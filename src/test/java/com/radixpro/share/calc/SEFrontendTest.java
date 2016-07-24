/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.calc;

import com.radixpro.share.domain.BodyNames;
import com.radixpro.share.domain.BodyPosition;
import com.radixpro.share.domain.CalculationFlags;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import swisseph.SweDate;
import swisseph.SwissEph;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SEFrontendTest {

    @Mock
    private SwissEph swissEphMock;
    @Mock
    private SweDate sweDateMock;
    @InjectMocks
    private SEFrontend seFrontend;


    @Before
    public void setUp() throws Exception {
        seFrontend = new SEFrontendFactory().getSEFrontend();
        // TODO find a way to mock parameter values by reference
        when(swissEphMock.calc(anyDouble(), anyInt(), anyInt(), anyObject())).thenReturn(3);
    }



    @Test
    public void calcBody() throws Exception {
//        double[] expectedElements = constructResults();
        BodyPosition bodyPosition = seFrontend.calcBody(sweDateMock, BodyNames.JUPITER, constructFlags());
        assertNotNull(bodyPosition.getMainValue());
    }

//    private double[] constructResults() {
//        double[] results = new double[6];
//        results[0] = 0.0;
//        results[1] = 1.0;
//        results[2] = 2.0;
//        results[3] = 3.0;
//        results[4] = 4.0;
//        results[5] = 5.0;
//        return results;
//    }

    private List<CalculationFlags> constructFlags() {
        List<CalculationFlags> flags = new ArrayList<>();
        flags.add(CalculationFlags.SWIEPH);
        flags.add(CalculationFlags.SPEED);
        return flags;
    }
}