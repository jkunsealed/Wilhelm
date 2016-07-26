/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.analysis;

import com.radixpro.share.domain.Signs;
import com.radixpro.share.exceptions.AnalysisException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SignAnalysisTest {

    private SignAnalysis signAnalysis;

    @Before
    public void setUp() {
        signAnalysis = new SignAnalysis();
    }


    @Test
    public void getSignForLongitude() throws Exception {
        double longitude = 155.5;
        Signs expected = Signs.VIRGO;
        assertEquals(expected, signAnalysis.getSignForLongitude(longitude));
    }

    @Test (expected = AnalysisException.class)
    public void getSignForLongitudeTooLarge() {
        double longitude = 400.0;
        signAnalysis.getSignForLongitude(longitude);
    }

    @Test (expected = AnalysisException.class)
    public void getSignForLongitudeTooSmall() {
        double longitude = -33.33;
        signAnalysis.getSignForLongitude(longitude);
    }

}