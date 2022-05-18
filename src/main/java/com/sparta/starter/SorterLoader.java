package com.sparta.starter;

import com.sparta.display.DisplayManager;
import com.sparta.exceptions.SorterLoaderException;
import com.sparta.sorters.Sorter;

import java.util.Random;
import java.util.Scanner;

public class SorterLoader {

    private final static Scanner scanner = new Scanner(System.in);

    public static void start() {
        try {
            DisplayManager.displaySortChoices();
            Sorter sorter = SorterFactory.getSorter(scanner.nextInt());

            System.out.println("Please enter the size of array you wish to generate: ");

            int[] arrayToSort = createArray(scanner.nextInt());

            // Print before and start sorting the array that was just created
            DisplayManager.printBeforeSort(sorter, arrayToSort);
            DisplayManager.printResults(sorter, arrayToSort);
        } catch (SorterLoaderException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int[] createArray(int size) {
        int[] unsortedArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            unsortedArray[i] = random.nextInt(size*10);
        }

        return unsortedArray;
    }

}