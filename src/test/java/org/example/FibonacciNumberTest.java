package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciNumberTest {
    @Test
    void fibonacciNumber_shouldReturn0_whenFibonacciNumberIs0() {
        // GIVEN
        int n = 0;
        int expexted = 0;
        // WHEN
        int actual = FibonacciNumber.getFibonacciNumber(n);
        // THEN
        assertEquals(expexted, actual);
    }
}
