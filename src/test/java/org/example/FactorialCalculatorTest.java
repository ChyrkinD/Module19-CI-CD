package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    private FactorialCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new FactorialCalculator();
    }

    @Test
    @DisplayName("Test factorial 0")
    void testFactorial0() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    @DisplayName("Test factorial 1")
    void testFactorial1() {
        assertEquals(1, calculator.factorial(1));
    }

    @Test
    @DisplayName("Test factorial 5")
    void testFactorial5() {
        assertEquals(120, calculator.factorial(5));
    }
}