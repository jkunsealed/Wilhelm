/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */
package com.radixpro.share.domain;

import org.junit.Before;
import org.junit.Test;
import swisseph.SweConst;

import static org.junit.Assert.assertEquals;

public class CalculationFlagsTest {

    private CalculationFlags flag;

    @Before
    public void setUp() throws Exception {
        flag = CalculationFlags.TOPOCTR;
    }

    @Test
    public void getFlagId() throws Exception {
        int expected = SweConst.SEFLG_TOPOCTR;
        assertEquals(expected, flag.getFlagId());
    }
}