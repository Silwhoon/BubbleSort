package com.sparta.starter;

import com.sparta.display.DisplayManager;
import com.sparta.exceptions.SorterLoaderException;
import com.sparta.sorters.Sorter;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class SorterLoader {

    private final static Scanner scanner = new Scanner(System.in);

    public static void start() {
        try {
            DisplayManager.displaySortChoices();
            Sorter sorter = getSorter(scanner.nextInt());

            System.out.println("Please enter the size of array you wish to generate: ");

            int[] arrayToSort = createArray(scanner.nextInt());

            // Print before and start sorting the array that was just created
            DisplayManager.printBeforeSort(sorter, arrayToSort);
            DisplayManager.printResults(sorter, arrayToSort);
        } catch (SorterLoaderException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException ime) {
            System.out.println("Please enter a valid number.");
        }
    }

    public static int[] createArray(int size) {
        // Convert negative numbers to positive
        if (size < 0) size *= -1;

        // Constrain size to be half the max value at most, so that we can create an array
        size = Math.min(size, Integer.MAX_VALUE / 2);

        int[] unsortedArray = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            unsortedArray[i] = random.nextInt(size*10);
        }

        return unsortedArray;
    }

    public static Sorter getSorter(int choice) throws SorterLoaderException {
        SorterFactory sf;
        switch (choice) {
            case 1 -> sf = new BubbleSorterFactory();
            case 2 -> sf = new MergeSorterFactory();
            case 3 -> sf = new BinarySorterFactory();
            default -> throw new SorterLoaderException("Invalid sorter choice: " + choice);
        }

        return sf.getInstance();
    }

}
