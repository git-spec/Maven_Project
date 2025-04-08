package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BubblesortTest {

    @Test
    public void testSortingWithUnsortedArray() {
        int[] input = {5, 2, 9, 1, 5, 6};
        int[] expected = {1, 2, 5, 5, 6, 9};
        Bubblesort.golfHotel(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortingWithAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        Bubblesort.golfHotel(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortingWithEmptyArray() {
        int[] input = {};
        int[] expected = {};
        Bubblesort.golfHotel(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortingWithSingleElement() {
        int[] input = {42};
        int[] expected = {42};
        Bubblesort.golfHotel(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortingWithAllIdenticalElements() {
        int[] input = {7, 7, 7, 7};
        int[] expected = {7, 7, 7, 7};
        Bubblesort.golfHotel(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSwapMethod() {
        int[] array = {10, 20};
        Bubblesort.papaQuebec(array, 0, 1);
        assertArrayEquals(new int[]{20, 10}, array);
    }
}