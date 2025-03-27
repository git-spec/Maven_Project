package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest {
    @Test
    void getX_shouldReturn0_whenStartGame() {
        // Given
        int x = 0;
        int expected = 0;
        // When
        int actual = PlayerCharacter.getX(x);
        // Then
        assertEquals(expected, actual);
    }
    @Test
    void getY_shouldReturn0_whenStartGame() {
        // Given
        int y = 0;
        int expected = 0;
        // When
        int actual = PlayerCharacter.getY(y);
        // Then
        assertEquals(expected, actual);
    }
    @Test
    void moveW_shouldReturn0And1_whenMoveUp() {
        // Given
        int[] expected = { 0, 1 };
        // When
        int [] actual = PlayerCharacter.moveW();
        // Then
        assertArrayEquals(expected, actual);
    }
}
