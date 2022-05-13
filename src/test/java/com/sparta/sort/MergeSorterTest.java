package com.sparta.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSorterTest {

    @Test
    public void mergeAndSortArraySimpleEvenAmountOfIndexes() {
        int[] exampleArray = {0, 3, 2, 5, 4, 1};
        int[] expectedResult = {0, 1, 2, 3, 4, 5};
        int[] actualResult = MergeSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeAndSortArraySimpleOddAmountOfIfIndexes() {
        int[] exampleArray = {0, 3, 2, 5, 4};
        int[] expectedResult = {0, 2, 3, 4, 5};
        int[] actualResult = MergeSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeAndSortArrayEmpty() {
        int[] exampleArray = {};
        int[] expectedResult = {};
        int[] actualResult = MergeSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeAndSortArraySingleIndex() {
        int[] exampleArray = {5};
        int[] expectedResult = {5};
        int[] actualResult = MergeSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeAndSortArrayDoubleIndex() {
        int[] exampleArray = {5, -1};
        int[] expectedResult = {-1, 5};
        int[] actualResult = MergeSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeAndSortArrayNegative() {
        int[] exampleArray = {0, 3, 2, -1, -2, 1};
        int[] expectedResult = {-2, -1, 0, 1, 2, 3};
        int[] actualResult = MergeSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeAndSortArrayFewIdenticalIndexes() {
        int[] exampleArray = {0, 3, 2, 2, 1, 1};
        int[] expectedResult = {0, 1, 1, 2, 2, 3};
        int[] actualResult = MergeSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void mergeAndSortArrayIdenticalIndexes() {
        int[] exampleArray = {1, 1, 1};
        int[] expectedResult = {1, 1, 1};
        int[] actualResult = MergeSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
