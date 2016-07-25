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
import org.mockito.Mock;
import swisseph.SweDate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculationEndPointTest {

    @Mock
    private CalculationRequestHouses requestHousesMock = mock(CalculationRequestHouses.class);
    @Mock
    private Location locationMock = mock(Location.class);

    private SweDate sweDate;
    private CalculationEndPoint endPoint;

    @Before
    public void setUp() throws Exception {
        sweDate = new SweDate(1953, 1, 29, 7.616666667);
        endPoint = new CalculationEndPoint();
        when(locationMock.getLatitude()).thenReturn(52.216666667);
        when(locationMock.getLongitude()).thenReturn(6.9);
        when(requestHousesMock.getHouseSystem()).thenReturn(HouseSystems.ALCABITIUS);
        when(requestHousesMock.getCalculationFLags()).thenReturn(constructFlags());
        when(requestHousesMock.getJulianDayNr()).thenReturn(sweDate.getJulDay());
        when(requestHousesMock.getLocation()).thenReturn(locationMock);
    }

    @Test
    public void calcSingleBody() throws Exception {
        try {

            CalculationRequestBody request = new CalculationRequestBody();
            request.setBodyName(BodyNames.JUPITER);
            request.setCalculationFLags(constructFlags());
            request.setJulianDayNr(sweDate.getJulDay());
            Location location = new Location();
            location.setLatitude(52.216666667);
            location.setLongitude(6.9);
            request.setLocation(location);
            CalculationResponseBody result = endPoint.calcSingleBody(request);
            assertTrue("No exception", true);
        } catch (Exception e) {
            fail("Unexpected exception was thrown.");
        }
    }

    @Test
    public void calcHouses() throws Exception {
        try {
            CalculationResponseHouses result = endPoint.calcHouses(requestHousesMock);
            assertTrue("No exception", true);
        } catch (Exception e) {
            fail("Unexpected exception was thrown.");
        }
    }

    private List<CalculationFlags> constructFlags() {
        List<CalculationFlags> flags = new ArrayList<>();
        flags.add(CalculationFlags.SWIEPH);
        flags.add(CalculationFlags.SPEED);
        return flags;
    }


}