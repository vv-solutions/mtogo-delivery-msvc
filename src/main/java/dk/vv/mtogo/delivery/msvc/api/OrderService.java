package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.common.data.transfer.objects.order.OrderDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient(configKey = "order-api")
@Path("/api/order")
public interface OrderService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{orderId}")
    OrderDTO getOrderById(@PathParam("orderId") int orderId);

}
