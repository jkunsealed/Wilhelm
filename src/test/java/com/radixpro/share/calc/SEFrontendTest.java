/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.calc;

import com.radixpro.share.domain.*;
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
    @Mock
    private CalculationRequestBody requestBodyMock;
    @Mock
    private CalculationRequestHouses requestHousesMock;
    @Mock
    private Location locationMock;
    @InjectMocks
    private SEFrontend seFrontend;


    @Before
    public void setUp() throws Exception {
        seFrontend = new SEFrontendFactory().getSEFrontend();
        // TODO find a way to mock parameter values by reference
        when(locationMock.getLatitude()).thenReturn(22.0);
        when(locationMock.getLongitude()).thenReturn(33.0);
        when(requestBodyMock.getBodyName()).thenReturn(BodyNames.JUPITER);
        when(requestBodyMock.getCalculationFLags()).thenReturn(constructFlags());
        when(requestBodyMock.getJulianDayNr()).thenReturn(1234.5);
        when(requestBodyMock.getLocation()).thenReturn(locationMock);
        when(requestHousesMock.getLocation()).thenReturn(locationMock);
        when(requestHousesMock.getJulianDayNr()).thenReturn(1234.5);
        when(requestHousesMock.getCalculationFLags()).thenReturn(constructFlags());
        when(requestHousesMock.getHouseSystem()).thenReturn(HouseSystems.ALCABITIUS);
        when(swissEphMock.calc(anyDouble(), anyInt(), anyInt(), anyObject())).thenReturn(3);
        when(swissEphMock.swe_houses(anyDouble(), anyInt(), anyDouble(), anyDouble(), anyInt(), anyObject(),
                anyObject())).thenReturn(3);
    }


    @Test
    public void calcBody() throws Exception {
        BodyPosition bodyPosition = seFrontend.calcBody(requestBodyMock);
        assertNotNull(bodyPosition.getMainValue());
    }

    @Test
    public void calcHouses() throws Exception {
        HousePositions housePositions = seFrontend.calcHouses(requestHousesMock);
        assertNotNull(housePositions.getAscendant());
    }


    private List<CalculationFlags> constructFlags() {
        List<CalculationFlags> flags = new ArrayList<>();
        flags.add(CalculationFlags.SWIEPH);
        flags.add(CalculationFlags.SPEED);
        return flags;
    }
}