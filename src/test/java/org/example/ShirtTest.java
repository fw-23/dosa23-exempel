package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShirtTest {

    @Test
    void testShirtInstantiation() {
        assertEquals("Foo", new Shirt("Foo", 1).getBrand());
    }
}
