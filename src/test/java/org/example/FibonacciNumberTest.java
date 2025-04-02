package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciNumberTest {
    @Test
    void getFibonacciNumber_shouldReturn0_whenNumberIs0() {
        // GIVEN
        int n = 0;
        int expected = 0;
        // WHEN
        int actual = FibonacciNumber.getFibonacciNumber(n);
        // THEN
        assertEquals(expected, actual);
    }
    @Test
    void getFibonacciNumber_shouldReturn1_whenNumberIs1() {
        // GIVEN
        int n = 1;
        int expected = 1;
        // WHEN
        int actual = FibonacciNumber.getFibonacciNumber(n);
        // THEN
        assertEquals(expected, actual);
    }
    @Test
    void getFibonacciNumber_shouldReturn1_whenNumberIs2() {
        // GIVEN
        int n = 2;
        int expected = 1;
        // WHEN
        int actual = FibonacciNumber.getFibonacciNumber(n);
        // THEN
        assertEquals(expected, actual);
    }
    @Test
    void getFibonacciNumber_shouldReturn13_whenNumberIs7() {
        // GIVEN
        int n = 7;
        int expected = 13;
        // WHEN
        int actual = FibonacciNumber.getFibonacciNumber(n);
        // THEN
        assertEquals(expected, actual);
    }
    @Test
    void getFibonacciNumber_shouldReturnNeg1_whenNumberIsNeg1() {
        // GIVEN
        int n = -1;
        int expected = -1;
        // WHEN
        int actual = FibonacciNumber.getFibonacciNumber(n);
        // THEN
        assertEquals(expected, actual);
    }
    @Test
    void getFibonacciNumber_shouldReturnNeg13_whenNumberIsNeg7() {
        // GIVEN
        int n = -7;
        int expected = -13;
        // WHEN
        int actual = FibonacciNumber.getFibonacciNumber(n);
        // THEN
        assertEquals(expected, actual);
    }
}
