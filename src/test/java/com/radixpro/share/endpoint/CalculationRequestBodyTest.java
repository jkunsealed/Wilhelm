/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.endpoint;

import com.radixpro.share.domain.BodyNames;
import com.radixpro.share.domain.CalculationFlags;
import com.radixpro.share.domain.Location;
import com.radixpro.share.exceptions.ParameterOutOfRangeException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculationRequestBodyTest {

    private CalculationRequestBody calculationRequestBody;
    @Mock
    private Location locationMock;
    private final double julianDayNr = 123456.789;
    private final double margin = 0.000000001;
    private final BodyNames bodyName = BodyNames.JUPITER;
    private List<CalculationFlags> calculationFlags;
    @Before
    public void setUp() throws Exception {
        calculationRequestBody = new CalculationRequestBody();
        calculationFlags = createFlags();
    }

    @Test
    public void setGetLocation() throws Exception {
        calculationRequestBody.setLocation(locationMock);
        assertEquals(locationMock, calculationRequestBody.getLocation());
    }

    @Test
    public void setJulianDayNr() throws Exception {
        calculationRequestBody.setJulianDayNr(julianDayNr);
        assertEquals(julianDayNr, calculationRequestBody.getJulianDayNr(), margin);
    }

    @Test (expected= ParameterOutOfRangeException.class)
    public void setJulianDayNrTooLarge() throws Exception {
        double julianDayNr = Double.POSITIVE_INFINITY;
        calculationRequestBody.setJulianDayNr(julianDayNr);
        assertEquals(julianDayNr, calculationRequestBody.getJulianDayNr(), margin);
    }

    @Test (expected= ParameterOutOfRangeException.class)
    public void setJulianDayNrTooSmall() throws Exception {
        double julianDayNr = Double.NEGATIVE_INFINITY;
        calculationRequestBody.setJulianDayNr(julianDayNr);
        assertEquals(julianDayNr, calculationRequestBody.getJulianDayNr(), margin);
    }


    @Test
    public void setBodyName() throws Exception {
        calculationRequestBody.setBodyName(bodyName);
        assertEquals(bodyName, calculationRequestBody.getBodyName());
    }

    @Test
    public void setCalculationFLags() throws Exception {
        calculationRequestBody.setCalculationFLags(calculationFlags);
        assertEquals(calculationFlags, calculationRequestBody.getCalculationFLags());
    }

    private List<CalculationFlags> createFlags() {
        List<CalculationFlags> flags = new ArrayList<>();
        flags.add(CalculationFlags.EQUATORIAL);
        flags.add(CalculationFlags.SPEED);
        flags.add(CalculationFlags.SWIEPH);
        return flags;
    }
}