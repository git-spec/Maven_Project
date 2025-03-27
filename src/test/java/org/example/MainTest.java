package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void isEven_shouldReturnTrue_whenCalled2() {
        // Given
        int number = 2;
        boolean expected = true;
        // When
        boolean actual = Main.isEven(number);
        // Then
        assertEquals(expected, actual);
    }
    @Test
    void add_shouldRetrunSum7_whenSetnumbers2And5() {
        // Given
        int expected = 7;
        // When
        int actual = Main.add(2, 5);
        // Then
        assertEquals(expected, actual);
    }
}