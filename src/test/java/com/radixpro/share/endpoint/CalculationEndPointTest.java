/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.endpoint;

import com.radixpro.share.domain.BodyNames;
import com.radixpro.share.domain.CalculationFlags;
import org.junit.Before;
import org.junit.Test;
import swisseph.SweDate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class CalculationEndPointTest {

    private CalculationEndPoint endPoint;

    @Before
    public void setUp() throws Exception {
        endPoint = new CalculationEndPoint();
    }

    @Test
    public void calcSingleBody() throws Exception {
        try {
            SweDate sweDate = new SweDate(1953, 1, 29, 7.616666667);
            List<CalculationFlags> flags = new ArrayList<>();
            flags.add(CalculationFlags.SWIEPH);
            flags.add(CalculationFlags.SPEED);
            CalculationResponseBody result = endPoint.calcSingleBody(sweDate, BodyNames.JUPITER, flags);
            assertTrue("No exception", true);
        } catch (Exception e) {
            fail("Unexpected exception was thrown.");
        }
    }
}