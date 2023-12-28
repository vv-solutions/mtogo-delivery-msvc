package dk.vv.mtogo.delivery.msvc.message;

import dk.vv.common.data.transfer.objects.Notification.NotificationDTO;
import dk.vv.common.data.transfer.objects.delivery.DeliveryDTO;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.event.Observes;

public interface MessageService {

    void onApplicationStart(@Observes StartupEvent event);
    void setupQueues();
    void listenOnDeliveryCreationQueue();

    void sendDeliveryInformation(DeliveryDTO d);

    void listenOnStatusUpdateQueue();

    void sendNotificationMessage(NotificationDTO notificationDTO);

}
