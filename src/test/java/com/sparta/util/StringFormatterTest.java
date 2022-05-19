package com.sparta.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StringFormatterTest {

    @ParameterizedTest
    @MethodSource("nanosecondConvertToSecondsData")
    public void nanosecondConvertToSeconds(long input, String expectedResult) {
        String actualResult = StringFormatter.formatNanosecondsToString(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> nanosecondConvertToSecondsData() {
        return Stream.of(
                arguments(1000000000, "1 second"),
                arguments(2000000000, "2 seconds"),
                arguments(1500000000, "1.5 seconds"),
                arguments(1535150000, "1.53515 seconds")
        );
    }

    @ParameterizedTest
    @MethodSource("nanosecondConvertToMilliSecondsData")
    public void nanosecondConvertToMilliSeconds(long input, String expectedResult) {
        String actualResult = StringFormatter.formatNanosecondsToString(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> nanosecondConvertToMilliSecondsData() {
        return Stream.of(
                arguments(1000000, "1 millisecond"),
                arguments(2000000, "2 milliseconds"),
                arguments(1500000, "1.5 milliseconds"),
                arguments(1535150, "1.53515 milliseconds")
        );
    }

    @ParameterizedTest
    @MethodSource("nanosecondConvertToMicroSecondsData")
    public void nanosecondConvertToMicroSeconds(long input, String expectedResult) {
        String actualResult = StringFormatter.formatNanosecondsToString(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> nanosecondConvertToMicroSecondsData() {
        return Stream.of(
                arguments(1000, "1 microsecond"),
                arguments(2000, "2 microseconds"),
                arguments(1500, "1.5 microseconds"),
                arguments(1535, "1.535 microseconds")
        );
    }

    @ParameterizedTest
    @MethodSource("nanosecondConvertToStringData")
    public void nanosecondConvertToString(long input, String expectedResult) {
        String actualResult = StringFormatter.formatNanosecondsToString(input);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> nanosecondConvertToStringData() {
        return Stream.of(
                arguments(1, "1 nanosecond"),
                arguments(2, "2 nanoseconds")
        );
    }
}
