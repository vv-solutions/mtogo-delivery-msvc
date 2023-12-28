package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.common.data.transfer.objects.common.AddressDTO;
import io.smallrye.graphql.client.GraphQLClient;
import io.smallrye.graphql.client.Response;
import io.smallrye.graphql.client.core.Argument;
import io.smallrye.graphql.client.core.Document;
import io.smallrye.graphql.client.dynamic.api.DynamicGraphQLClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.concurrent.ExecutionException;

import static io.smallrye.graphql.client.core.Document.document;
import static io.smallrye.graphql.client.core.Field.field;
import static io.smallrye.graphql.client.core.Operation.operation;

@ApplicationScoped
public class SupplierServiceImpl implements SupplierService{

    @Inject
    @GraphQLClient("supplier-api")
    DynamicGraphQLClient supplierService;


    @Override
    public AddressDTO getAddressById(int supplierId) throws ExecutionException, InterruptedException {
        Document query = document(
                operation(
                        field("getAddressBySupplierId", Argument.args(Argument.arg("supplierId",supplierId)),
                                field("city"),
                                field("address"),
                                field("zipCode")

                        )));
        Response response = supplierService.executeSync(query);


        return response.getObject(AddressDTO.class,"getAddressBySupplierId");
    }
}
