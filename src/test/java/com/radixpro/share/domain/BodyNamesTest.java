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

public class BodyNamesTest {

    private BodyNames bodyName;

    @Before
    public void setUp() throws Exception {
        bodyName = BodyNames.MERCURY;
    }

    @Test
    public void getId() throws Exception {
        int expected = 2;
        assertEquals(expected, bodyName.getId());
    }
}