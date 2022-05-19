package com.sparta.util;

import java.math.BigDecimal;

public class StringFormatter {

    // No one really cares about nanoseconds, lets format this to use seconds
    public static String formatNanosecondsToString(long nanosecondsLong) {
        String ret = "";
        BigDecimal nanoseconds = new BigDecimal(nanosecondsLong);

        // Check for seconds
        BigDecimal seconds = nanoseconds.divide(new BigDecimal("1000000000")).stripTrailingZeros();

        if (seconds.compareTo(BigDecimal.ONE) >= 0) {
            ret = seconds.toPlainString() + " second";

            if (seconds.compareTo(BigDecimal.ONE) != 0) {
                ret += "s";
            }
            return ret;
        }

        // Check for milliseconds
        BigDecimal milliseconds = nanoseconds.divide(new BigDecimal("1000000")).stripTrailingZeros();

        if (milliseconds.compareTo(BigDecimal.ONE) >= 0) {
            ret = milliseconds.toPlainString() + " millisecond";

            if (milliseconds.compareTo(BigDecimal.ONE) != 0) {
                ret += "s";
            }
            return ret;
        }

        // Check for microseconds
        BigDecimal microseconds = nanoseconds.divide(new BigDecimal("1000")).stripTrailingZeros();

        if (microseconds.compareTo(BigDecimal.ONE) >= 0) {
            ret = microseconds.toPlainString() + " microsecond";

            if (microseconds.compareTo(BigDecimal.ONE) != 0) {
                ret += "s";
            }
            return ret;
        }

        // Otherwise use nanoseconds
        ret = nanoseconds.toPlainString() + " nanosecond";

        if (nanoseconds.compareTo(BigDecimal.ONE) != 0) {
            ret += "s";
        }
        return ret;
    }
}
