package dk.vv.mtogo.delivery.msvc.api;

import dk.vv.common.data.transfer.objects.common.AddressDTO;
import io.quarkus.test.Mock;
import jakarta.enterprise.context.ApplicationScoped;

@Mock
@ApplicationScoped
public class SupplierServiceStub implements SupplierService {
    @Override
    public AddressDTO getAddressById(int supplierId) {
        return new AddressDTO(){{
            this.setAddress("Skottegården 37");
            this.setZipCode(2770);
            this.setCity("Kastrup");
        }};
    }
}
