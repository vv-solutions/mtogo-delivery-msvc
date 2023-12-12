package dk.vv.mtogo.delivery.msvc.message;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.rabbitmq.client.*;
import dk.vv.common.data.transfer.objects.order.OrderDTO;
import dk.vv.mtogo.delivery.msvc.Configuration;
import dk.vv.mtogo.delivery.msvc.dtos.DeliveryDTO;
import dk.vv.mtogo.delivery.msvc.dtos.NotificationDTO;
import dk.vv.mtogo.delivery.msvc.enums.DeliveryStatus;
import dk.vv.mtogo.delivery.msvc.facades.DeliveryFacade;
import io.quarkiverse.rabbitmqclient.RabbitMQClient;
import io.quarkus.arc.profile.UnlessBuildProfile;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;

@ApplicationScoped
@UnlessBuildProfile("test")
public class MessageServiceImpl implements MessageService {

    private  Logger logger;

    private  RabbitMQClient rabbitMQClient;


    private Configuration configuration;

    private Channel channel;

    private final DeliveryFacade deliveryFacade;

    private ObjectMapper mapper = new ObjectMapper(){{
        this.registerModule(new JavaTimeModule());
    }};


    @Inject
    public MessageServiceImpl(Logger logger, RabbitMQClient rabbitMQClient, Configuration configuration, DeliveryFacade deliveryFacade) {
        this.logger = logger;
        this.rabbitMQClient = rabbitMQClient;
        this.configuration = configuration;
        this.deliveryFacade = deliveryFacade;
    }

    @Override
    public void onApplicationStart(@Observes StartupEvent event) {
        // on application start prepare the queues and message listener
        setupQueues();
        listenOnStatusUpdateQueue();
        listenOnDeliveryCreationQueue();
    }

    @Override
    public void setupQueues() {
        try {
            // create a connection
            Connection connection = rabbitMQClient.connect();

            // create a channel
            channel = connection.createChannel();

            // declare queues
            channel.queueDeclare(configuration.queues().deliveryStatus().queue(), true, false, false, null);

            channel.queueDeclare(configuration.queues().deliveryCreation().queue(), true, false, false, null);

            // bind queues to exchanges
            channel.queueBind(configuration.queues().deliveryStatus().queue(),configuration.queues().deliveryStatus().exchange(),configuration.queues().deliveryStatus().routingKey());
            channel.queueBind(configuration.queues().deliveryCreation().queue(),configuration.queues().deliveryCreation().exchange(),configuration.queues().deliveryCreation().routingKey());

        } catch (IOException e) {

            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void listenOnDeliveryCreationQueue() {
        try {
            channel.basicConsume(configuration.queues().deliveryCreation().queue(), false, new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {

                    var delivery = mapper.readValue(body, DeliveryDTO.class);

                    logger.infof("delivery: received information about delivery with orderId [%d]",delivery.getOrderId());

                    // enrich with order data
                    deliveryFacade.enrichWithOrderData(delivery);

                    // Enrich with customer address
                    deliveryFacade.enrichWithCustomerAddress(delivery);

                    // Enrich with supplier address
                    deliveryFacade.enrichWithSupplierAddress(delivery);

                    // enrich with estimated delivery time
                    deliveryFacade.enrichWithDeliveryEstimate(delivery);

                    // Set status
                    delivery.setStatus(DeliveryStatus.RECEIVED.value());

                    // persist delivery
                    delivery = deliveryFacade.saveDelivery(new dk.vv.mtogo.delivery.msvc.pojos.Delivery(delivery));


                    // send delivery information on queue
                    sendDeliveryInformation(delivery);


                    channel.basicAck(envelope.getDeliveryTag(),false);

                }
            });
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void sendDeliveryInformation(DeliveryDTO deliveryDTO) {
        try {
            // send a message to the exchange

            String message = mapper.writeValueAsString(deliveryDTO);

            logger.infof("delivery: sending delivery information for delivery [%s]",deliveryDTO.getId());

            channel.basicPublish(configuration.queues().deliveryInformation().exchange(), configuration.queues().deliveryInformation().routingKey() ,null, message.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void listenOnStatusUpdateQueue() {
        try {
            channel.basicConsume(configuration.queues().deliveryStatus().queue(), false, new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {

                    var delivery = mapper.readValue(body, DeliveryDTO.class);

                    logger.infof("delivery: received status for delivery [%s]",delivery.getId());

                    // Update status of delivery
                    deliveryFacade.updateStatus(delivery.getId(),delivery.getStatus());

                    // send notification based on status
                    delivery = deliveryFacade.getDeliveryById(delivery.getId());
                    sendNotificationMessage(deliveryFacade.createStatusUpdateNotificationDTO(delivery.getOrderId(),delivery.getCustomerId(),delivery.getStatus(),delivery.getDeliveryTimeEstimate()));


                    channel.basicAck(envelope.getDeliveryTag(),false);

                }
            });
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    @Override
    public void sendNotificationMessage(NotificationDTO notificationDTO) {
        try {
            // send a message to the exchange

            String message = mapper.writeValueAsString(notificationDTO);

            logger.infof("notification: sending notification information for delivery with orderId [%s]",notificationDTO.getOrderId());

            channel.basicPublish(configuration.queues().notification().exchange(), configuration.queues().notification().routingKey(), null, message.getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}



