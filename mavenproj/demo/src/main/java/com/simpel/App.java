package com.simpel;

/**
 * The App class contains methods for calculating the factorial of a number and testing the factorial calculation.
 */
public class App {

    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param n the non-negative integer whose factorial is to be calculated
     * @return the factorial of the given non-negative integer
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Test method to verify factorial calculation.
     * Prints the factorial of each test case.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Test cases
        int[] testCases = {0, 1, 5, 10};

        for (int n : testCases) {
            long factorialResult = factorial(n);
            System.out.println("Factorial of " + n + " is: " + factorialResult);
        }
    }
}
