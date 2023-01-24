package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testMultiplyTwoFactors() {
        Calculator calc = new Calculator();
        assertEquals(200, calc.multiply(10, 20));
    }

    @Test
    void testMultiplyThreeFactors() {
        Calculator calc = new Calculator();
        assertEquals(20000, calc.multiply(10, 20, 100));
    }
}