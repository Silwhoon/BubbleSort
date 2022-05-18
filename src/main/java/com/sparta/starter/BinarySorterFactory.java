package com.sparta.starter;

import com.sparta.sorters.BinarySorter;
import com.sparta.sorters.Sorter;

public class BinarySorterFactory extends SorterFactory {

    @Override
    public Sorter getInstance() {
        return new BinarySorter();
    }
}
