package com.sparta.starter;

import com.sparta.exceptions.SorterLoaderException;
import com.sparta.sorters.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SorterLoaderTest {

    @Test
    public void createArrayWithNegativeNumber() {
        int actualResult = SorterLoader.createArray(-5).length;
        int expectedResult = 5;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 10, (Integer.MAX_VALUE / 2)})
    public void createArrayWithValidNumber(int size) {
        int actualResult = SorterLoader.createArray(size).length;

        Assertions.assertEquals(size, actualResult);
    }

    @Test
    public void createArrayWithInvalidNumber() {
        int actualResult = SorterLoader.createArray(Integer.MAX_VALUE).length;

        Assertions.assertEquals(Integer.MAX_VALUE / 2, actualResult);
    }

    @ParameterizedTest
    @MethodSource("getSorterValidChoiceData")
    public void getSorterValidChoice(int choice, SorterFactory expectedSorter) throws SorterLoaderException {
        Sorter actualResult = SorterLoader.getSorter(choice);
        Sorter expectedResult = expectedSorter.getInstance();

        Assertions.assertEquals(expectedResult.getClass(), actualResult.getClass());
    }

    private static Stream<Arguments> getSorterValidChoiceData() {
        return Stream.of(
                arguments(1, new BubbleSorterFactory()),
                arguments(2, new MergeSorterFactory()),
                arguments(3, new BinarySorterFactory())
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4})
    public void getSorterInvalidChoice(int choice) {
        try {
            Sorter actualResult = SorterLoader.getSorter(choice);
        } catch (SorterLoaderException e) {
            Assertions.assertTrue(true);
        }
    }
}
