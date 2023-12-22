package dk.vv.mtogo.delivery.msvc;

import dk.vv.mtogo.delivery.msvc.api.CustomerService;
import dk.vv.mtogo.delivery.msvc.api.CustomerServiceImpl;
import dk.vv.mtogo.delivery.msvc.repositories.DeliveryRepository;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;


public class Producers {

    @Produces
    DeliveryRepository getDeliveryRepository(){
        return new DeliveryRepository();
    }

    @Inject
    Configuration configuration;

}
