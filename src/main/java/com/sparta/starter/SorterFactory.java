package com.sparta.starter;

import com.sparta.exceptions.SorterLoaderException;
import com.sparta.sorters.BinarySorter;
import com.sparta.sorters.BubbleSorter;
import com.sparta.sorters.MergeSorter;
import com.sparta.sorters.Sorter;

public class SorterFactory {

    public static Sorter getSorter(int choice) throws SorterLoaderException {
        return switch (choice) {
            case 1 -> new BubbleSorter();
            case 2 -> new MergeSorter();
            case 3 -> new BinarySorter();
            default -> throw new SorterLoaderException("Invalid sorter choice: " + choice);
        };
    }

}
