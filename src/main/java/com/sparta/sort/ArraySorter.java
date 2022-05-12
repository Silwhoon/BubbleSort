package com.sparta.sort;

public class ArraySorter {

    // Takes 2 SORTED arrays and combines them
    public static int[] combineSortedArrays(int[] arrayOne, int[] arrayTwo) {
        int[] ret = new int[arrayOne.length + arrayTwo.length];
        int arrayOnePosition = 0;
        int arrayTwoPosition = 0;

        for (int i = 0; i < ret.length; i++) {

            // If we reach the end of array one, fill the ret array with the remaining values of array two
            if (arrayOnePosition >= arrayOne.length) {
                System.arraycopy(arrayTwo, arrayTwoPosition, ret, i, arrayTwo.length - arrayTwoPosition);
                break;
            }

            // Also check if we reach the end of array two, fill the ret array with the remaining values of array one
            if (arrayTwoPosition >= arrayTwo.length) {
                System.arraycopy(arrayOne, arrayOnePosition, ret, i, arrayOne.length - arrayOnePosition);
                break;
            }

            // Otherwise, we compare the 2 current numbers (based on the 2 positions) and place the lower of the 2 in
            // the ret array
            int arrayOneNumber = arrayOne[arrayOnePosition];
            int arrayTwoNumber = arrayTwo[arrayTwoPosition];

            if (arrayOneNumber < arrayTwoNumber) {
                ret[i] = arrayOneNumber;
                arrayOnePosition++;
            } else {
                ret[i] = arrayTwoNumber;
                arrayTwoPosition++;
            }
        }

        return ret;
    }
}
