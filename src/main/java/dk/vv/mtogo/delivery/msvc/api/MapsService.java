package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.common.data.transfer.objects.order.OrderDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "maps-api")
@Path("/")
public interface MapsService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    Response getInformation(@QueryParam("wp.0") String SupplierAddress, @QueryParam("wp.1") String customerAddress, @QueryParam("o") String outputFormat, @QueryParam("key") String key);

}
