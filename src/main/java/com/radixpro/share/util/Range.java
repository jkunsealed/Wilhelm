/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.util;

import com.radixpro.share.exceptions.ParametersInWrongSequenceException;

/**
 * Static class that handles ranges.
 */
public final class Range {

    private Range() {
        // prevent instantation.
    }


    /**
     * Makes a value fit within a given range.
     * PRE lowerLimit < upperLimit.
     * @param value The value to make fit the range.
     * @param lowerLimit minimal value of the range - inclusive.
     * @param upperLimit maximum value of the range - exclusive.
     * @return The value that fits.
     */
    public static double limitToRange(double value, int lowerLimit, int upperLimit) {
        checkLimits(lowerLimit, upperLimit);
        double testValue = value;
        int rangeLength = upperLimit - lowerLimit;
        while (!fits(testValue, lowerLimit, upperLimit)) {
            if (testValue >= upperLimit) {
                testValue -= rangeLength;
            } else testValue+= rangeLength;
        }
        return testValue;
    }

    /**
     * Makes a value fit within a circle: between 0 degrees and 360 degrees (exclusive).
     * @param value The value to make fit a circle.
     * @return value converted to the range of a circle.
     */
    public static double limitToCircle(double value) {
        return limitToRange(value, 0, 360);
    }

    private static boolean fits(double value, int lowerLimit, int upperLimit) {
        return (value >= lowerLimit) && (value < upperLimit);
    }

    private static void checkLimits(int lowerLimit, int upperLimit) {
        if (lowerLimit > upperLimit) {
            throw new ParametersInWrongSequenceException(Integer.toString(lowerLimit), Integer.toString(upperLimit));
        }
    }


}
