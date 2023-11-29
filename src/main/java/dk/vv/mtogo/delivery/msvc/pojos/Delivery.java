package dk.vv.mtogo.delivery.msvc.pojos;

import dk.vv.mtogo.delivery.msvc.dtos.DeliveryDTO;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "supplier_id")
    private int supplierId;

    @Column(name = "status")
    private int status;

    @Column(name = "comment")
    private String comment;

    @Column(name = "customer_address_id")
    private int customerAddressId;

    @Column(name = "pickup_time")
    private LocalDateTime pickupTime;

    @Column(name = "customer_address")
    private String customerAddress;

    @Column(name = "supplier_address")
    private String supplierAddress;

    @Column(name = "delivery_time_estimate")
    private Double deliveryTimeEstimate;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_stamp")
    private LocalDateTime createStamp;


    // ====== Constructors =======


    public Delivery(DeliveryDTO deliveryDTO) {
        this.id = deliveryDTO.getId();
        this.orderId = deliveryDTO.getOrderId();
        this.customerId = deliveryDTO.getCustomerId();
        this.supplierId = deliveryDTO.getSupplierId();
        this.status = deliveryDTO.getStatus();
        this.comment = deliveryDTO.getComment();
        this.customerAddressId = deliveryDTO.getCustomerAddressId();
        this.pickupTime = deliveryDTO.getPickupTime();
        this.customerAddress = deliveryDTO.getCustomerAddress();
        this.supplierAddress = deliveryDTO.getSupplierAddress();
        this.deliveryTimeEstimate = deliveryDTO.getDeliveryTimeEstimate();
    }

    public Delivery() {
    }

    // ====== Methods =======

    public DeliveryDTO toDto(){
        DeliveryDTO deliveryDTO = new DeliveryDTO();
        deliveryDTO.setId(this.id);
        deliveryDTO.setOrderId(this.orderId);
        deliveryDTO.setCustomerId(this.customerId);
        deliveryDTO.setSupplierId(this.supplierId);
        deliveryDTO.setStatus(this.status);
        deliveryDTO.setComment(this.comment);
        deliveryDTO.setCustomerAddressId(this.customerAddressId);
        deliveryDTO.setPickupTime(this.pickupTime);
        deliveryDTO.setCustomerAddress(this.customerAddress);
        deliveryDTO.setSupplierAddress(this.supplierAddress);
        deliveryDTO.setDeliveryTimeEstimate(this.deliveryTimeEstimate);
        return deliveryDTO;
    }

    // ====== Getters and Setters =======
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getCustomerAddressId() {
        return customerAddressId;
    }

    public void setCustomerAddressId(int customerAddressId) {
        this.customerAddressId = customerAddressId;
    }

    public LocalDateTime getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(LocalDateTime pickupTime) {
        this.pickupTime = pickupTime;
    }

    public LocalDateTime getCreateStamp() {
        return createStamp;
    }

    public void setCreateStamp(LocalDateTime createStamp) {
        this.createStamp = createStamp;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public double getDeliveryTimeEstimate() {
        return deliveryTimeEstimate;
    }

    public void setDeliveryTimeEstimate(double deliveryTimeEstimate) {
        this.deliveryTimeEstimate = deliveryTimeEstimate;
    }

    /*

    flow:

    1. receive info about delivery from order creation mediator.

    2. fetch address customer and restaurant.

    3. bing maps api

    4. save delivery status - ongoing.

    5. inform courier svc with pickup time and adresses and time estimate for route


   done

   ----------------
   listen for order picked up_

   send notification svc -- delivery in progress

   update delivery status - in progress


   -------

   listen for finished deliveries:

    get event from queue:

    inform notification service about delivery done, feedback type thing.

    update delivery status -- done

    done

    ------------




     */

}
