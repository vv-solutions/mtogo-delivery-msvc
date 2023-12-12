
CREATE TABLE IF NOT EXISTS delivery
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT NOT NULL,
    customer_id INT,
    supplier_id INT,
    status INT NOT NULL,
    comment VARCHAR(255),
    customer_address_id INT,
    customer_address VARCHAR(255),
    supplier_address VARCHAR(255),
    pickup_time TIMESTAMP,
    deliveryTimeEstimate NUMBER,
    create_stamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);