package dk.vv.mtogo.delivery.msvc.facades;


import dk.vv.mtogo.delivery.msvc.dtos.DeliveryDTO;
import dk.vv.mtogo.delivery.msvc.pojos.Delivery;
import dk.vv.mtogo.delivery.msvc.repositories.DeliveryRepository;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
class DeliveryFacadeIT {

    @Inject
    protected DeliveryFacade deliveryFacade;

    @Inject
    DeliveryRepository repository;

    @Test
    @Transactional
    void when_update_status_with_status_2_status_should_be_updated_to_2(){
        //Arrange

        int id = 1;
        int status = 2;

        //Act
        deliveryFacade.updateStatus(id,status);


        //assert
        var delivery = repository.findById((long) id);

        Assertions.assertEquals(status,delivery.getStatus());
    }

    @Test
    void when_enrich_with_order_data_delivery_should_have_customer_id_supplier_id_customer_address_id_and_comment(){

        // Arrange
        DeliveryDTO deliveryDTO = new DeliveryDTO();
        deliveryDTO.setOrderId(1);

        //ACT

        var delivery = deliveryFacade.enrichWithOrderData(deliveryDTO);

        // Assert
        Assertions.assertEquals(11,delivery.getCustomerId());
        Assertions.assertEquals(5,delivery.getCustomerAddressId());
        Assertions.assertEquals(7,delivery.getSupplierId());
        Assertions.assertEquals("It better be warm!",delivery.getComment());
    }

    @Test
    void when_enrich_with_customer_address_delivery_should_have_customer_address(){

        //Arrange

        DeliveryDTO deliveryDTO = new DeliveryDTO();
        deliveryDTO.setCustomerAddressId(5);

        //Act

        var delivery = deliveryFacade.enrichWithCustomerAddress(deliveryDTO);

        //Assert
        Assertions.assertEquals("Ulrikkenborg Alle 33, 2800 Kgs. Lyngby",delivery.getCustomerAddress());

    }


    @Test
    void when_enrich_with_supplier_address_delivery_should_have_supplier_address(){


        //Arrange
        DeliveryDTO deliveryDTO = new DeliveryDTO();
        deliveryDTO.setSupplierId(8);

        //Act
        var delivery = deliveryFacade.enrichWithSupplierAddress(deliveryDTO);

        //Assert
        Assertions.assertEquals("Skottegården 37, 2770 Kastrup",delivery.getSupplierAddress());

    }


    @Test
    void when_enrich_delivery_time_estimate_delivery_should_have_a_delivery_time_estimate(){
        //Arrange
        String supplierAddress = "Skottegården 37, 2770";

        String customerAddress = "Ulrikkenborg Alle 33, 2800";

        DeliveryDTO deliveryDTO = new DeliveryDTO();
        deliveryDTO.setCustomerAddress(customerAddress);
        deliveryDTO.setSupplierAddress(supplierAddress);

        //Act
        var delivery = deliveryFacade.enrichWithDeliveryEstimate(deliveryDTO);

        //Assert
        Assertions.assertEquals(30.0,delivery.getDeliveryTimeEstimate());

    }

    @Test
    void when_save_delivery_size_of_all_deliveries_should_be_9(){
        //Arrange
        Delivery delivery = new Delivery();
        delivery.setCustomerId(1);
        delivery.setSupplierId(5);
        delivery.setCustomerAddressId(3);
        delivery.setOrderId(1777);

        //ACT
        deliveryFacade.saveDelivery(delivery);

        //Assert
        var all = repository.findAll().list();

        Assertions.assertEquals(9,all.size());
    }

}