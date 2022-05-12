package com.sparta.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSorterTest {

    @Test
    public void mergeAndSortArraySimple() {
        int[] exampleArray = {0, 3, 2, 5, 4, 1};
        int[] expectedResult = {0, 1, 2, 3, 4, 5};
        int[] actualResult = MergeSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
