package com.sparta.sort;

import java.util.Arrays;

public class MergeSorter {

    public static int[] sortArray(int[] inputArray) {
        mergeSortArray(inputArray, 0, inputArray.length);
        return inputArray;
    }

    private static void mergeSortArray(int[] arrayToSort, int startPoint, int endPoint) {
        int midPoint = endPoint / 2;

        // Check if the specified start/end point has a size greater than 1, if it does then split it in half
        // and attempt to 'merge sort' the new parts
        if (startPoint < endPoint) {
            // Purposefully call this method recursively, with the 2 new halves of the passed array
            mergeSortArray(arrayToSort, startPoint, midPoint);
            mergeSortArray(arrayToSort, midPoint + 1, endPoint);
        }

        //System.arraycopy(arrayTwo, arrayTwoPosition, ret, i, arrayTwo.length - arrayTwoPosition);

        int[] left = new int[midPoint - startPoint];
        int[] right = new int[endPoint - midPoint];
    }
}
