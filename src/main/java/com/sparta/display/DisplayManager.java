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

    private static final Logger logger = LogManager.getLogger(DisplayManager.class.getName());
    private static final int MAXIMUM_ARRAY_LENGTH_TO_DISPLAY = 30;

    private static ArrayList<String> getMenuItems() {
        return new ArrayList<>(Arrays.asList("BubbleSorter", "MergeSorter", "BinarySorter"));
    }

    public static void printBeforeSort(Sorter sorter, int[] arrayToSort) {
        System.out.println("Sorting using the " + sorter);
        System.out.println(getDisplayArrayString("Before sorting:\n", arrayToSort));
    }

    public static String getDisplayArrayString(String startOfMessage, int[] array) {
        if (array.length > MAXIMUM_ARRAY_LENGTH_TO_DISPLAY) {
            return startOfMessage + "Array too long to display.";
        } else {
            return startOfMessage + Arrays.toString(array);
        }
    }

    public static void printResults(Sorter sorter, int[] arrayToSort) {
        // Sort the array and keep track of how long it takes - in nanoseconds
        long start = System.nanoTime();
        int[] sortedArray = sorter.sortArray(arrayToSort);
        long end = System.nanoTime();

        // Display the sorted array after performing the sort
        System.out.println(getDisplayArrayString("After sorting:\n", sortedArray));

        // Convert the time to something a little more readable (no one cares about nanoseconds)
        long timeTakenInNanoSeconds = (end - start);
        String formattedTimeTaken = StringFormatter.formatNanosecondsToString(timeTakenInNanoSeconds);

        // log the sorting method used, the size of the array and the amount of time
        logger.info(sorter + " took " + formattedTimeTaken + " to sort an array of "
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
