package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.common.data.transfer.objects.common.AddressDTO;
import io.smallrye.graphql.client.typesafe.api.GraphQLClientApi;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.concurrent.ExecutionException;


public interface CustomerService {
    AddressDTO getAddressById( int addressId) throws ExecutionException, InterruptedException;

}
