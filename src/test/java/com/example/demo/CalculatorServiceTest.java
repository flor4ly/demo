package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAddition() {
        assertEquals(15, calculatorService.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, calculatorService.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, calculatorService.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2.0, calculatorService.divide(10, 5));
    }
}
