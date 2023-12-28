package dk.vv.mtogo.delivery.msvc.api;

import static io.smallrye.graphql.client.core.Document.document;
import static io.smallrye.graphql.client.core.Field.field;
import static io.smallrye.graphql.client.core.Operation.operation;
import dk.vv.common.data.transfer.objects.common.AddressDTO;
import io.smallrye.graphql.client.GraphQLClient;
import io.smallrye.graphql.client.Response;
import io.smallrye.graphql.client.core.Argument;
import io.smallrye.graphql.client.core.Document;
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.concurrent.ExecutionException;

@ApplicationScoped
public class CustomerServiceImpl implements CustomerService{

    @Inject
    @GraphQLClient("customer-api")
    DynamicGraphQLClient customerService;


    @Override
    public AddressDTO getAddressById(int addressId) throws ExecutionException, InterruptedException {
        Document query = document(
                operation(
                        field("getAddressById", Argument.args(Argument.arg("id",addressId)),
                                field("city"),
                                field("address"),
                                field("zipCode")
                        )));

        Response response = customerService.executeSync(query);

        return response.getObject(AddressDTO.class,"getAddressById");
    }
}
