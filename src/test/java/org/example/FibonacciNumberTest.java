package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciNumberTest {
    @Test
    void getFibonacciNumber_shouldReturn0_whenNumberIs0() {
        // GIVEN
        int n = 0;
        int expexted = 0;
        // WHEN
        int actual = FibonacciNumber.getFibonacciNumber(n);
        // THEN
        assertEquals(expexted, actual);
    }
    @Test
    void getFibonacciNumber_shouldReturn1_whenNumberIs1() {
        // GIVEN
        int n = 1;
        int expexted = 1;
        // WHEN
        int actual = FibonacciNumber.getFibonacciNumber(n);
        // THEN
        assertEquals(expexted, actual);
    }
}
