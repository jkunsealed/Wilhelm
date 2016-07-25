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
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

public class CalculationResponseHousesTest {

    @Mock
    private HousePositions housePositionsMock = mock(HousePositions.class);
    private CalculationResponseHouses response;

    @Before
    public void setUp() throws Exception {
        response = new CalculationResponseHouses();
    }

    @Test
    public void getSetStatus() throws Exception {
        String status = "STATUS";
        response.setStatus(status);
        assertEquals(status, response.getStatus());
    }

    @Test
    public void getSetHouseSystem() throws Exception {
        response.setHouseSystem(HouseSystems.ALCABITIUS);
        assertEquals(HouseSystems.ALCABITIUS, response.getHouseSystem());
    }

    @Test
    public void getSetHousePositions() throws Exception {
        response.setHousePositions(housePositionsMock);
        assertEquals(housePositionsMock, response.getHousePositions());
    }
}