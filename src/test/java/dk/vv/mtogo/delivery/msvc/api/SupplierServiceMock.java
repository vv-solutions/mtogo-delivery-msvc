package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.mtogo.delivery.msvc.dtos.AddressDTO;
import io.quarkus.test.Mock;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Mock
@RestClient
@ApplicationScoped
public class SupplierServiceMock implements SupplierService {
    @Override
    public AddressDTO getAddressById(int addressId) {
        return new AddressDTO(){{
            this.setAddress("Skottegården 37");
            this.setZipCode(2770);
            this.setCity("Kastrup");
        }};
    }
}
