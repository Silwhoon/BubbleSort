package com.sparta.display;

import com.sparta.sorters.BubbleSorter;
import com.sparta.sorters.Sorter;
import org.junit.jupiter.api.Test;

public class DisplayManagerTest {

    @Test
    public void test() {
        Sorter sorter = new BubbleSorter();
        int[] exampleArray = new int[]{45, 10, 7, 90, 12, 50, 13, 39, 57};
        DisplayManager.printBeforeSort(sorter, exampleArray);
        DisplayManager.printResults(sorter, exampleArray);
        DisplayManager.displaySortChoices();
    }

    @Test
    public void printBeforeSort() {
        Sorter sorter = new BubbleSorter();
        DisplayManager.printBeforeSort(sorter, new int[]{45, 10, 7, 90, 12, 50, 13, 39, 57});
    }

    @Test
    public void printResults() {
        Sorter sorter = new BubbleSorter();
        DisplayManager.printResults(sorter, new int[]{45, 10, 7, 90, 12, 50, 13, 39, 57});
    }

    @Test
    public void displaySortChoices() {
        DisplayManager.displaySortChoices();
    }

}
