package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void isEven_shouldReturnTrue_whenCalled2() {
        // Arrange
        int number = 2;
        boolean expected = true;
        // Act
        boolean actual = Main.isEven(number);
        // Assert
        assertEquals(expected, actual);
        assertTrue(actual);
    }
    @Test
    void add_shouldReturnSum7_whenSetNumbers2And5() {
        // Given
        int expected = 7;
        // When
        int actual = Main.add(2, 5);
        // Then
        assertEquals(expected, actual);
    }
}