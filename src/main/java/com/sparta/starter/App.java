package com.sparta.starter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger("sortManager");

    public static void main(String[] args) {
        SorterLoader.start();
    }
}
