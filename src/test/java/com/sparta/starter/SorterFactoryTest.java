package com.sparta.starter;

import com.sparta.sorters.BinarySorter;
import com.sparta.sorters.BubbleSorter;
import com.sparta.sorters.MergeSorter;
import com.sparta.sorters.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SorterFactoryTest {

    @ParameterizedTest
    @MethodSource("sorterFactoryCanReturnSpecificSortersData")
    public void sorterFactoryCanReturnSpecificSorters(SorterFactory inputFactory, Sorter expectedResult) {
        Sorter actualResult = inputFactory.getInstance();
        Assertions.assertEquals(expectedResult.getClass(), actualResult.getClass());
    }

    private static Stream<Arguments> sorterFactoryCanReturnSpecificSortersData() {
        return Stream.of(
                arguments(new BubbleSorterFactory(), new BubbleSorter()),
                arguments(new MergeSorterFactory(), new MergeSorter()),
                arguments(new BinarySorterFactory(), new BinarySorter())
        );
    }
}
