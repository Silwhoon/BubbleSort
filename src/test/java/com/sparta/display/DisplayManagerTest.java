package com.sparta.display;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DisplayManagerTest {

    @Test
    public void smallArrayTest() {
        int[] inputArray = new int[4];
        String expectedResult = "[0, 0, 0, 0]";
        String actualResult = DisplayManager.getDisplayArrayString(inputArray);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void massiveArrayTest() {
        int[] inputArray = new int[1000000000];
        String expectedResult = "Array too long to display.";
        String actualResult = DisplayManager.getDisplayArrayString(inputArray);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sizeOfThirtyArrayTest() {
        int[] inputArray = new int[30];
        String expectedResult = "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, " +
                "0, 0, 0, 0, 0, 0, 0]";
        String actualResult = DisplayManager.getDisplayArrayString(inputArray);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sizeOfThirtyOneArrayTest() {
        int[] inputArray = new int[31];
        String expectedResult = "Array too long to display.";
        String actualResult = DisplayManager.getDisplayArrayString(inputArray);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
