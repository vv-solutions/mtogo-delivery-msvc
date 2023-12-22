package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.common.data.transfer.objects.common.AddressDTO;
import io.quarkus.test.Mock;
import jakarta.enterprise.context.ApplicationScoped;


@Mock
@ApplicationScoped
public class CustomerServiceStub implements CustomerService{
    @Override
    public AddressDTO getAddressById(int addressId) {
        return new AddressDTO(){{
            this.setAddress("Ulrikkenborg Alle 33");
            this.setZipCode(2800);
            this.setCity("Kgs. Lyngby");
        }};
    }
}
