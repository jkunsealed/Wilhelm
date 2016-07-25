/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SignsTest {

    private Signs sign;

    @Before
    public void setUp() {
        sign = Signs.AQUARIUS;
    }

    @Test
    public void getIndex() throws Exception {
        int expected = 11;
        assertEquals(expected, sign.getIndex());
    }

    @Test
    public void getSignForIndex() throws Exception {
        Signs expected = Signs.SAGITTARIUS;
        int index = 9;
        assertEquals(expected, Signs.getSignForIndex(index));
    }
}