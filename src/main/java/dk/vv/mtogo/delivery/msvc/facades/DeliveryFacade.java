package dk.vv.mtogo.delivery.msvc.facades;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dk.vv.common.data.transfer.objects.Notification.NotificationDTO;
import dk.vv.common.data.transfer.objects.common.AddressDTO;
import dk.vv.common.data.transfer.objects.delivery.DeliveryDTO;
import dk.vv.common.data.transfer.objects.order.OrderDTO;
import dk.vv.mtogo.delivery.msvc.Configuration;
import dk.vv.mtogo.delivery.msvc.api.*;
import dk.vv.mtogo.delivery.msvc.enums.DeliveryStatus;
import dk.vv.mtogo.delivery.msvc.pojos.Delivery;
import dk.vv.mtogo.delivery.msvc.repositories.DeliveryRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.concurrent.ExecutionException;

@ApplicationScoped
public class DeliveryFacade {


    private final DeliveryRepository repository;

    private final OrderService orderService;
    private final CustomerService customerService;
    private final SupplierService supplierService;

    private final Configuration configuration;

    private final MapsService mapsService;

    private final ObjectMapper mapper = new ObjectMapper();

    public DeliveryFacade(DeliveryRepository deliveryRepository, @RestClient OrderService orderService, CustomerService customerService, SupplierService supplierService, Configuration configuration, @RestClient MapsService mapsService) {
        this.repository = deliveryRepository;
        this.orderService = orderService;
        this.customerService = customerService;
        this.supplierService = supplierService;
        this.configuration = configuration;
        this.mapsService = mapsService;
    }

    @Transactional
    public void updateStatus(int id, int status) {
        repository.update("status = ?1 where id= ?2",status,id);
    }


    public DeliveryDTO enrichWithOrderData(DeliveryDTO deliveryDTO) {

        OrderDTO orderDTO = orderService.getOrderById(deliveryDTO.getOrderId());

        deliveryDTO.setComment(orderDTO.getComment());
        deliveryDTO.setCustomerAddressId(orderDTO.getAddressId());
        deliveryDTO.setSupplierId(orderDTO.getSupplierId());
        deliveryDTO.setCustomerId(orderDTO.getCustomerId());

        return deliveryDTO;
    }

    public DeliveryDTO enrichWithCustomerAddress(DeliveryDTO deliveryDTO) throws ExecutionException, InterruptedException {

        AddressDTO addressDTO = customerService.getAddressById(deliveryDTO.getCustomerAddressId());


        StringBuilder sb = new StringBuilder();
        sb.append(addressDTO.getAddress());
        sb.append(", ");
        sb.append(addressDTO.getZipCode());
        sb.append(" ");
        sb.append(addressDTO.getCity());

        deliveryDTO.setCustomerAddress(sb.toString());

        return deliveryDTO;
    }

    public DeliveryDTO enrichWithSupplierAddress(DeliveryDTO deliveryDTO) throws ExecutionException, InterruptedException {

        AddressDTO addressDTO = supplierService.getAddressById(deliveryDTO.getSupplierId());

        StringBuilder sb = new StringBuilder();
        sb.append(addressDTO.getAddress());
        sb.append(", ");
        sb.append(addressDTO.getZipCode());
        sb.append(" ");
        sb.append(addressDTO.getCity());

        deliveryDTO.setSupplierAddress(sb.toString());


        return deliveryDTO;
    }

    public DeliveryDTO enrichWithDeliveryEstimate(DeliveryDTO deliveryDTO){
        double travelDurationTrafficInMinutes = 0;
        try{
            Response response = mapsService.getInformation(deliveryDTO.getCustomerAddress(),deliveryDTO.getSupplierAddress(),"json",configuration.bing().key());

            String json = response.readEntity(String.class);

            JsonNode rootNode;

            rootNode = mapper.readTree(json);

            double estimatedWithTrafficInSeconds = rootNode.findValue("travelDurationTraffic").asDouble();

            travelDurationTrafficInMinutes = estimatedWithTrafficInSeconds/60;


            travelDurationTrafficInMinutes = Math.round(travelDurationTrafficInMinutes);

        }catch (Exception e){
            System.out.println("Unable to estimate duration");
        }

        deliveryDTO.setDeliveryTimeEstimate(travelDurationTrafficInMinutes);
        return deliveryDTO;

    }

    @Transactional
    public DeliveryDTO saveDelivery(Delivery delivery) {
        repository.persist(delivery);
        return delivery.toDto();
    }




    public NotificationDTO createStatusUpdateNotificationDTO(int orderId, int customerId, int status, double deliveryTimeEstimate){

        NotificationDTO notificationDTO = new NotificationDTO();

        notificationDTO.setOrderId(orderId);
        notificationDTO.setCustomerId(customerId);

        String message = "";

        if(status == DeliveryStatus.IN_PROGRESS.value()){
            message = "Your order is now on its way, it will arrive in approximately " + deliveryTimeEstimate+ " min";
        }
        else if (status == DeliveryStatus.DELIVERED.value()){
            message = "Please rate your experience";
        }

        notificationDTO.setMessage(message);

        return notificationDTO;
    }

    @Transactional
    public DeliveryDTO getDeliveryById(int id){
        return repository.findById((long) id).toDto();
    }
}
