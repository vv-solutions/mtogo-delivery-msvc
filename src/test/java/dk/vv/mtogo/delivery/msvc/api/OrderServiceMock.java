package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.common.data.transfer.objects.order.OrderDTO;
import io.quarkus.test.Mock;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Assertions;

@Mock
@RestClient
@ApplicationScoped
public class OrderServiceMock implements OrderService{
    @Override
    public OrderDTO getOrderById(int orderId) {
        return new OrderDTO(){{
            this.setCustomerId(11);
            this.setSupplierId(7);
            this.setComment("It better be warm!");
            this.setAddressId(5);
        }};
    }
}
