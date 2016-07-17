/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangeTest {

    private Range range;
    private final double margin = 0.000000001;

    @Before
    public void setUp() throws Exception {
        range = new Range();
    }

    @Test
    public void limitToRange() throws Exception {
        double value = 100.0;
        double expected = 20.0;
        assertEquals(expected, range.limitToRange(value, 10, 50), margin);
    }

    @Test
    public void limitToRangeTooLow() throws Exception {
        double value = 10.0;
        double expected = 80.0;
        assertEquals(expected, range.limitToRange(value, 20, 90), margin);
    }

    @Test
    public void limitToRangeTooHigh() throws Exception {
        double value = 300.0;
        double expected = 20.0;
        assertEquals(expected, range.limitToRange(value, 20, 90), margin);
    }

    @Test
    public void limitToRangeBottomLimit() throws Exception {
        double value = 20.0;
        double expected = 20.0;
        assertEquals(expected, range.limitToRange(value, 20, 90), margin);
    }

    @Test
    public void limitToRangeTopLimit() throws Exception {
        double value = 90.0;
        double expected = 20.0;
        assertEquals(expected, range.limitToRange(value, 20, 90), margin);
    }


    @Test
    public void limitToCircle() throws Exception {
        double value = 100.0;
        double expected = 100.0;
        assertEquals(expected, range.limitToCircle(value), margin);
    }

    @Test
    public void limitToCircleTooLow() throws Exception {
        double value = -100.0;
        double expected = 260.0;
        assertEquals(expected, range.limitToCircle(value), margin);
    }

    @Test
    public void limitToCircleTooHigh() throws Exception {
        double value = 500.0;
        double expected = 140.0;
        assertEquals(expected, range.limitToCircle(value), margin);
    }

    @Test
    public void limitToCircleBottomLimit() throws Exception {
        double value = 0.0;
        double expected = 0.0;
        assertEquals(expected, range.limitToCircle(value), margin);
    }

    @Test
    public void limitToCircleTopLimit() throws Exception {
        double value = 360.0;
        double expected = 0.0;
        assertEquals(expected, range.limitToCircle(value), margin);
    }



}