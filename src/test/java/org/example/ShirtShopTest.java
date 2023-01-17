package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShirtShopTest {

    @Test
    void testAddAndRetrieveShirt() {
        ShirtShop s = new ShirtShop();
        s.addShirt("foo", new Shirt("Foo", 10));

        assertEquals("Foo", s.getShirts().get("foo").getBrand());

    }

    @Test
    void testShirtPrice() {
        ShirtShop s = new ShirtShop();
        s.addShirt("foo", new Shirt("Foo", 10));

        assertEquals(10, s.getShirts().get("foo").getPrice());
    }
}