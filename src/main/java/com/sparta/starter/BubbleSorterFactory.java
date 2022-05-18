package com.sparta.starter;

import com.sparta.sorters.BubbleSorter;
import com.sparta.sorters.Sorter;

public class BubbleSorterFactory extends SorterFactory {

    @Override
    public Sorter getInstance() {
        return new BubbleSorter();
    }
}
