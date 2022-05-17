package com.sparta.starter;

import com.sparta.exceptions.SorterLoaderException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SorterFactoryTest {

    @Test
    public void test() throws SorterLoaderException {
        Assertions.assertEquals("BubbleSorter", SorterFactory.getSorter(1).getClass().getSimpleName());
        Assertions.assertEquals("MergeSorter", SorterFactory.getSorter(2).getClass().getSimpleName());
        Assertions.assertEquals("BinarySorter", SorterFactory.getSorter(3).getClass().getSimpleName());
    }

}
