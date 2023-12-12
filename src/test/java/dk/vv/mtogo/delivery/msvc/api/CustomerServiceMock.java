package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.mtogo.delivery.msvc.dtos.AddressDTO;
import io.quarkus.test.Mock;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Mock
@RestClient
@ApplicationScoped
public class CustomerServiceMock implements CustomerService{
    @Override
    public AddressDTO getAddressById(int addressId) {
        return new AddressDTO(){{
            this.setAddress("Ulrikkenborg Alle 33");
            this.setZipCode(2800);
            this.setCity("Kgs. Lyngby");
        }};
    }
}
