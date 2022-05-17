package com.sparta.sorters;

import com.sparta.sorters.binarytree.TraversalMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySorterTest {

    private final BinarySorter binarySorter = new BinarySorter();

    @Test
    public void binarySortArrayInorderEven() {
        int[] exampleArray = {45, 10, 7, 90, 12, 50, 13, 39, 57};
        int[] expectedResult = {7, 10, 12, 13, 39, 45, 50, 57, 90};
        int[] actualResult = binarySorter.sortArray(exampleArray, TraversalMethod.INORDER);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void binarySortArrayInorderOdd() {
        int[] exampleArray = {45, 10, 7, 90, 50, 13, 39, 57};
        int[] expectedResult = {7, 10, 13, 39, 45, 50, 57, 90};
        int[] actualResult = binarySorter.sortArray(exampleArray, TraversalMethod.INORDER);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void binarySortArrayInorderEmpty() {
        int[] exampleArray = {};
        int[] expectedResult = {};
        int[] actualResult = binarySorter.sortArray(exampleArray, TraversalMethod.INORDER);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void binarySortArrayInorderSingleIndex() {
        int[] exampleArray = {5};
        int[] expectedResult = {5};
        int[] actualResult = binarySorter.sortArray(exampleArray, TraversalMethod.INORDER);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void binarySortArrayInorderDoubleIndex() {
        int[] exampleArray = {5, -1};
        int[] expectedResult = {-1, 5};
        int[] actualResult = binarySorter.sortArray(exampleArray, TraversalMethod.INORDER);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void binarySortArrayInorderNegative() {
        int[] exampleArray = {0, 3, 2, -1, -2, 1};
        int[] expectedResult = {-2, -1, 0, 1, 2, 3};
        int[] actualResult = binarySorter.sortArray(exampleArray, TraversalMethod.INORDER);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void binarySortArrayInorderFewIdenticalIndexes() {
        int[] exampleArray = {0, 3, 2, 2, 1, 1};
        int[] expectedResult = {0, 1, 1, 2, 2, 3};
        int[] actualResult = binarySorter.sortArray(exampleArray, TraversalMethod.INORDER);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void binarySortArrayInorderIdenticalIndexes() {
        int[] exampleArray = {1, 1, 1};
        int[] expectedResult = {1, 1, 1};
        int[] actualResult = binarySorter.sortArray(exampleArray, TraversalMethod.INORDER);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}

