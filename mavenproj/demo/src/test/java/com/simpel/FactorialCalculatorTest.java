package com.simpel;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * The FactorialCalculatorTest class contains test methods for the FactorialCalculator class.
 */
public class FactorialCalculatorTest {

    /**
     * Tests the factorial method with various inputs.
     * Asserts that the factorial method returns the expected result for each input.
     */
    @Test
    public void testFactorial() {
        assertEquals(1, App.factorial(0));
        assertEquals(1, App.factorial(1));
        assertEquals(120, App.factorial(5));
        assertEquals(3628800, App.factorial(10));
    }

    /**
     * Tests the factorial method with a negative number.
     * Asserts that the factorial method throws an IllegalArgumentException when a negative number is passed.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegativeNumber() {
        App.factorial(-5);
    }
}
