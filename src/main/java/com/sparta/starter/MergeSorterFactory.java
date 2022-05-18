package com.sparta.starter;

import com.sparta.sorters.MergeSorter;
import com.sparta.sorters.Sorter;

public class MergeSorterFactory extends SorterFactory {

    @Override
    public Sorter getInstance() {
        return new MergeSorter();
    }
}
