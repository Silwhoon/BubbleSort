package com.sparta.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortedArraySorterTest {

    @Test
    public void combineAndSortTwoArrays() {
        int[] exampleArrayOne = {1, 3, 5, 7, 9};
        int[] exampleArrayTwo = {2, 4, 6, 8, 10};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] actualResult = SortedArraySorter.combineSortedArrays(exampleArrayOne, exampleArrayTwo);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void combineAndSortTwoIdenticalArrays() {
        int[] exampleArrayOne = {1, 3, 5, 7, 9};
        int[] exampleArrayTwo = {1, 3, 5, 7, 9};
        int[] expectedResult = {1, 1, 3, 3, 5, 5, 7, 7, 9, 9};

        int[] actualResult = SortedArraySorter.combineSortedArrays(exampleArrayOne, exampleArrayTwo);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void combineAndSortTwoArraysWithDifferingLengthsOne() {
        int[] exampleArrayOne = {0, 1, 2, 3, 4, 5, 6};
        int[] exampleArrayTwo = {0, 1, 2, 3, 4, 5};
        int[] expectedResult = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6};

        int[] actualResult = SortedArraySorter.combineSortedArrays(exampleArrayOne, exampleArrayTwo);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void combineAndSortTwoArraysWithDifferingLengthsTwo() {
        int[] exampleArrayOne = {0, 1, 2, 3, 4, 5};
        int[] exampleArrayTwo = {0, 1, 2, 3, 4, 5, 6};
        int[] expectedResult = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6};

        int[] actualResult = SortedArraySorter.combineSortedArrays(exampleArrayOne, exampleArrayTwo);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void combineAndSortTwoArraysWithDifferingLengthsThree() {
        int[] exampleArrayOne = {0, 1, 2, 3, 4, 5};
        int[] exampleArrayTwo = {0, 1, 2, 3, 4, 5, 6, 9};
        int[] expectedResult = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 9};

        int[] actualResult = SortedArraySorter.combineSortedArrays(exampleArrayOne, exampleArrayTwo);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void combineAndSortTwoArraysWithOneEmpty() {
        int[] exampleArrayOne = {0, 1, 2, 3, 4, 5};
        int[] exampleArrayTwo = {};
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        int[] actualResult = SortedArraySorter.combineSortedArrays(exampleArrayOne, exampleArrayTwo);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void combineAndSortTwoArraysNegative() {
        int[] exampleArrayOne = {-1, 3, 5, 7, 9};
        int[] exampleArrayTwo = {-8, 2, 4, 6, 10};
        int[] expectedResult = {-8, -1, 2, 3, 4, 5, 6, 7, 9, 10};

        int[] actualResult = SortedArraySorter.combineSortedArrays(exampleArrayOne, exampleArrayTwo);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
