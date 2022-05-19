package com.sparta.sorters;

import com.sparta.SortingMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSorterTest {

    private final BubbleSorter bubbleSorter = new BubbleSorter();

    @Test
    public void sortArraySimple() {
        int[] exampleArray = {0, 3, 2, 5, 4, 1};
        int[] expectedResult = {0, 1, 2, 3, 4, 5};
        int[] actualResult = bubbleSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayWithNegativeNumbers() {
        int[] exampleArray = {-2, 3, 2, -1, 1, 0};
        int[] expectedResult = {-2, -1, 0, 1, 2, 3};
        int[] actualResult = bubbleSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayWithDuplicateValues() {
        int[] exampleArray = {1, 1, 0, 2, 3, 2};
        int[] expectedResult = {0, 1, 1, 2, 2, 3};
        int[] actualResult = bubbleSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayWithOneValue() {
        int[] exampleArray = {1};
        int[] expectedResult = {1};
        int[] actualResult = bubbleSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayWithZeroValues() {
        int[] exampleArray = {};
        int[] expectedResult = {};
        int[] actualResult = bubbleSorter.sortArray(exampleArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArraySimpleDescending() {
        int[] exampleArray = {0, 3, 2, 5, 4, 1};
        int[] expectedResult = {5, 4, 3, 2, 1, 0};
        int[] actualResult = bubbleSorter.sortArray(exampleArray, SortingMethod.DESCENDING);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayWithNegativeNumbersDescending() {
        int[] exampleArray = {-2, 3, 2, -1, 1, 0};
        int[] expectedResult = {3, 2, 1, 0, -1, -2};
        int[] actualResult = bubbleSorter.sortArray(exampleArray, SortingMethod.DESCENDING);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayWithDuplicateValuesDescending() {
        int[] exampleArray = {1, 1, 0, 2, 3, 2};
        int[] expectedResult = {3, 2, 2, 1, 1, 0};
        int[] actualResult = bubbleSorter.sortArray(exampleArray, SortingMethod.DESCENDING);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayWithOneValueDescending() {
        int[] exampleArray = {1};
        int[] expectedResult = {1};
        int[] actualResult = bubbleSorter.sortArray(exampleArray, SortingMethod.DESCENDING);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void sortArrayWithZeroValuesDescending() {
        int[] exampleArray = {};
        int[] expectedResult = {};
        int[] actualResult = bubbleSorter.sortArray(exampleArray, SortingMethod.DESCENDING);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void bubbleSortToString() {
        String actualResult = bubbleSorter.toString();
        Assertions.assertEquals("BubbleSorter", actualResult);
    }
}
