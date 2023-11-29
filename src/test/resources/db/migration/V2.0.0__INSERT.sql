-- Insert sample data into Delivery table
INSERT INTO delivery (order_id, customer_id, supplier_id, status, comment, customer_address_id, pickup_time)
VALUES
    (1, 101, 201, 1, 'Use the doorbell', 301, '2023-01-01 12:00:00'),
    (2, 102, 202, 2, 'It better be warm when it arrives', 302, '2023-01-02 14:30:00'),
    (3, 103, 203, 3, 'Leave it at the door please', 303, '2023-01-03 10:45:00'),
    (4, 109, 209, 1, 'Contactless delivery - Please leave at the doorstep', 309, '2023-01-09 18:30:00'),
    (5, 110, 210, 2, 'Special instructions: Extra napkins and utensils', 310, '2023-01-10 19:45:00'),
    (6, 111, 211, 3, 'Preferred delivery time: Dinner - 7:00 PM', 311, '2023-01-11 19:00:00'),
    (7, 112, 212, 1, 'Handle with care - Fragile desserts inside', 312, '2023-01-12 20:15:00'),
    (8, 113, 213, 2, 'Delivery to the reception - Corporate lunch order', 313, '2023-01-13 12:00:00');