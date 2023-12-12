package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.mtogo.delivery.msvc.dtos.AddressDTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "supplier-api")
@Path("/api/supplier")
public interface SupplierService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/address/{supplierId}")
    AddressDTO getAddressById(@PathParam("supplierId") int addressId);

}
