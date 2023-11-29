package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.common.data.transfer.objects.order.OrderDTO;
import dk.vv.mtogo.delivery.msvc.dtos.AddressDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "customer-api")
@Path("/api/customer")
public interface CustomerService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/address/{addressId}")
    AddressDTO getAddressById(@PathParam("addressId") int addressId);

}
