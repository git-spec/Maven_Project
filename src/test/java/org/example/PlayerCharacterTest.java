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
        int[] pos = { 0, 1 };
        int[] expected = { 0, 1 };
        // When
        int [] actual = PlayerCharacter.moveW(pos);
        // Then
        assertArrayEquals(expected, actual);
    }
    @Test
    void moveS_shouldReturn0And1_whenMoveDown() {
        // Given
        int[] pos = { 0, -1 };
        int[] expected = { 0, -1 };
        // When
        int [] actual = PlayerCharacter.moveS(pos);
        // Then
        assertArrayEquals(expected, actual);
    }
    @Test
    void moveD_shouldReturn0And1_whenMoveRight() {
        // Given
        int[] pos = { 1, 0 };
        int[] expected = { 1, 0 };
        // When
        int [] actual = PlayerCharacter.moveD(pos);
        // Then
        assertArrayEquals(expected, actual);
    }
    @Test
    void moveA_shouldReturn0And1_whenMoveLeft() {
        // Given
        int[] pos = { -1, 0 };
        int[] expected = { -1, 0 };
        // When
        int [] actual = PlayerCharacter.moveA(pos);
        // Then
        assertArrayEquals(expected, actual);
    }
}
