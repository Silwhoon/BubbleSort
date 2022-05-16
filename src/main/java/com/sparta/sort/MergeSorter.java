package com.sparta.sort;

public class MergeSorter {

    public static int[] sortArray(int[] inputArray) {
        // As we want to sort the entire array the end point is the same as the length
        mergeSortArray(inputArray, inputArray.length);
        return inputArray;
    }

    // A recursive function that sorts an input array using the "Merge-Sort" method
    private static void mergeSortArray(int[] arrayToSort, int endPoint) {
        // If the array is of length 1 or lower, job is already done!
        if (arrayToSort.length <= 1) {
            return;
        }

        // Instantiate a left and right array using the midpoint to determine the size
        int midPoint = endPoint / 2;
        int[] left = new int[midPoint];
        int[] right = new int[endPoint - midPoint];

        // Populate left and right arrays by splitting the original array into 'left' and 'right' values
        System.arraycopy(arrayToSort, 0, left, 0, midPoint);
        System.arraycopy(arrayToSort, midPoint, right, 0, endPoint - midPoint);

        // Purposefully call this method recursively, with the 2 new halves of the passed array
        mergeSortArray(left, midPoint);
        mergeSortArray(right, endPoint - midPoint);

        // Merge the split arrays back into the original static array
        int leftCounter = 0;
        int rightCounter = 0;
        int retCounter = 0;

        // While we still have values in BOTH left and right, compare them and sort
        while (leftCounter < midPoint && rightCounter < (endPoint - midPoint)) {
            if (left[leftCounter] <= right[rightCounter]) {
                arrayToSort[retCounter++] = left[leftCounter++];
            } else {
                arrayToSort[retCounter++] = right[rightCounter++];
            }
        }

        // After handling ALL the values either in the left or right array, add the last of the remaining array to the
        // original static array
        while (leftCounter < midPoint) {
            arrayToSort[retCounter++] = left[leftCounter++];
        }
        while (rightCounter < (endPoint - midPoint)) {
            arrayToSort[retCounter++] = right[rightCounter++];
        }
    }
}
