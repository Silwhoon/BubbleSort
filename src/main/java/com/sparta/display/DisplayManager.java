package com.sparta.display;

import com.sparta.sorters.Sorter;
import com.sparta.util.StringFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class DisplayManager {

    private static final Logger logger = LogManager.getLogger("DisplayManager");

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

        long timeTakenInNanoSeconds = (end - start);

        String formattedTimeTaken = StringFormatter.formatNanosecondsToString(timeTakenInNanoSeconds);

        // log the sorting method used, the size of the array and the amount of time
        logger.info(sorter.toString() + " took " + formattedTimeTaken + " to sort an array of "
                + NumberFormat.getNumberInstance(Locale.US).format(arrayToSort.length) + " numbers.");
    }

    public static void displaySortChoices() {
        System.out.println("Type the number of the sorter you wish to use: ");

        ArrayList<String> menuItems = getMenuItems();
        for (String menuItem : menuItems) {
            int listIndex = menuItems.indexOf(menuItem) + 1;
            System.out.println(listIndex + ". " + menuItem);
        }
    }

}
