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
}
