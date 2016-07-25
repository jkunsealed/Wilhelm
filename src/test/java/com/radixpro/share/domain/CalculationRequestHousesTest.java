/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class CalculationRequestHousesTest {

    @Mock
    private Location locationMock = mock(Location.class);
    private CalculationRequestHouses request;
    private double margin = 0.000000001;

    @Before
    public void setUp() throws Exception {
        request = new CalculationRequestHouses();
    }

    @Test
    public void setGetLocation() throws Exception {
        request.setLocation(locationMock);
        assertEquals(locationMock, request.getLocation());
    }

    @Test
    public void setGetJulianDayNr() throws Exception {
        double jdnr = 1234.5678;
        request.setJulianDayNr(jdnr);
        assertEquals(jdnr, request.getJulianDayNr(), margin);
    }

    @Test
    public void setGetHouseSystem() throws Exception {
        request.setHouseSystem(HouseSystems.ALCABITIUS);
        assertEquals(HouseSystems.ALCABITIUS, request.getHouseSystem());
    }

    @Test
    public void setGetCalculationFLags() throws Exception {
        List<CalculationFlags> flags = constructFlags();
        request.setCalculationFLags(flags);
        assertEquals(flags, request.getCalculationFLags());
    }

    private List<CalculationFlags> constructFlags() {
        List<CalculationFlags> flags = new ArrayList<>();
        flags.add(CalculationFlags.SWIEPH);
        flags.add(CalculationFlags.SPEED);
        return flags;
    }
}