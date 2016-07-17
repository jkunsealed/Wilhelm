/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.util;

/**
 * Handles ranges.
 */
public class Range {

    /**
     * Makes a value fit within a given range.
     * PRE lowerLimit < upperLimit.
     * @param value The value to make fit the range.
     * @param lowerLimit minimal value of the range - inclusive.
     * @param upperLimit maximum value of the range - exclusive.
     * @return The value that fits.
     */
    public double limitToRange(double value, int lowerLimit, int upperLimit) {
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
    public double limitToCircle(double value) {
        return limitToRange(value, 0, 360);
    }

    private boolean fits(double value, int lowerLimit, int upperLimit) {
        return (value >= lowerLimit) && (value < upperLimit);
    }


}
