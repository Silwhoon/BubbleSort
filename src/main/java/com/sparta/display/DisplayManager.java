package com.sparta.display;

import com.sparta.sorters.Sorter;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {

    private static ArrayList<String> getMenuItems() {
        return new ArrayList<>(Arrays.asList("BubbleSorter", "MergeSorter", "BinarySorter"));
    }

    public static void printBeforeSort(Sorter sorter, int[] arrayToSort) {
        System.out.println("Sorting using the " + sorter);
        System.out.println("Before sorting:\n" + Arrays.toString(arrayToSort));
    }

    public static void printResults(Sorter sorter, int[] arrayToSort) {
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(arrayToSort);
        long end = System.nanoTime();

        System.out.println("After sorting:\n" + Arrays.toString(sortedArray));
        System.out.println("Time taken: " + (end - start) + " nanoseconds.");
    }

    public static void displaySortChoices() {
        System.out.println("The number of the sorter you wish to use: ");

        ArrayList<String> menuItems = getMenuItems();
        for (String menuItem : menuItems) {
            int listIndex = menuItems.indexOf(menuItem) + 1;
            System.out.println(listIndex + ". " + menuItem);
        }
    }

}
