package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testNegativeBikePriceThrowsError() {
        Customer customer = new Customer(2000);
        assertThrows(IllegalArgumentException.class, () -> {
            customer.buyBike(new Bike("a", -1));
        });

    }

}