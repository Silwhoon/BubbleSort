package com.sparta.bubblesort;

public class BubbleSort {

    // Takes an array of ints, sorts them in ascending order (by default)
    public static int[] sortArray(int[] inputArray) {
        return sortArray(inputArray, SortingMethod.ASCENDING);
    }

    // Takes an array of ints, sorts them in the specified order
    public static int[] sortArray(int[] inputArray, SortingMethod sortingMethod) {
        return switch (sortingMethod) {
            case ASCENDING -> sortArrayAscending(inputArray);
            case DESCENDING -> sortArrayDescending(inputArray);
        };
    }

    private static int[] sortArrayAscending(int[] inputArray) {
        boolean swappedPositions;

        do {
            // Set swappedPositions to false after each pass, if changes were made it will have changed to true
            // before the next pass. Passes must stop running *only* when no changes were made
            swappedPositions = false;

            for (int i = 0; i < (inputArray.length - 1); i++) {
                int currentInt = inputArray[i];
                int nextInt = inputArray[i + 1];

                if (currentInt > nextInt) {
                    swappedPositions = true;
                    inputArray[i] = nextInt;
                    inputArray[i + 1] = currentInt;
                }
            }
        }
        while (swappedPositions);

        return inputArray;
    }

    private static int[] sortArrayDescending(int[] inputArray) {
        boolean swappedPositions;

        do {
            // Set swappedPositions to false after each pass, if changes were made it will have changed to true
            // before the next pass. Passes must stop running *only* when no changes were made
            swappedPositions = false;

            for (int i = 0; i < (inputArray.length - 1); i++) {
                int currentInt = inputArray[i];
                int nextInt = inputArray[i + 1];

                if (currentInt < nextInt) {
                    swappedPositions = true;
                    inputArray[i] = nextInt;
                    inputArray[i + 1] = currentInt;
                }
            }
        }
        while (swappedPositions);

        return inputArray;
    }
}