/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.calc;

import com.radixpro.share.domain.BodyPosition;
import com.radixpro.share.domain.CalculationResponseBody;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

public class CalculationResponseBodyTest {

    private CalculationResponseBody calculationResponse;
    @Mock
    private BodyPosition positionMock = mock(BodyPosition.class);

    @Before
    public void setUp() throws Exception {
        calculationResponse = new CalculationResponseBody();
    }

    @Test
    public void getStatus() throws Exception {
        String status = "OK";
        calculationResponse.setStatus(status);
        assertEquals(status, calculationResponse.getStatus());
    }

    @Test
    public void getPosition() throws Exception {
        calculationResponse.setPosition(positionMock);
        assertEquals(positionMock, calculationResponse.getPosition());
    }
}