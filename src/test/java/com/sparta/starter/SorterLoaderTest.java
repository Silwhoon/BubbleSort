package com.sparta.starter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SorterLoaderTest {

    @Test
    public void createArrayWithNegativeNumber() {
        int actualResult = SorterLoader.createArray(-5).length;
        int expectedResult = new int[5].length;

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
