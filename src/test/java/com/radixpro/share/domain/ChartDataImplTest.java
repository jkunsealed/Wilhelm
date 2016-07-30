/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChartDataImplTest {

    private ChartData chartData;
    private final double margin = 0.000000001;

    @Before
    public void setUp() throws Exception {
        chartData = new ChartDataImpl();
    }

    @Test
    public void getSetId() throws Exception {
        String id = "A33";
        chartData.setId(id);
        assertEquals(id, chartData.getId());
    }

    @Test
    public void getSetDateTime() throws Exception {
        SimpleDateTime dateTime = new SimpleDateTime();
        chartData.setDateTime(dateTime);
        assertEquals(dateTime, chartData.getDateTime());
    }

    @Test
    public void getSetTimeZone() throws Exception {
        double tz = 60.0;
        chartData.setTimeZone(tz);
        assertEquals(tz, chartData.getTimeZone(), margin);
    }

    @Test
    public void getSetPlace() throws Exception {
        String place = "someLocation";
        chartData.setPlace(place);
        assertEquals(place, chartData.getPlace());
    }

    @Test
    public void getSetLongitude() throws Exception {
        double longitude = 6.90123456789;
        chartData.setLongitude(longitude);
        assertEquals(longitude, chartData.getLongitude(), margin);
    }

    @Test
    public void getSetLatitude() throws Exception {
        double latitude = -22.3456789;
        chartData.setLatitude(latitude);
        assertEquals(latitude, chartData.getLatitude(), margin);
    }

    @Test
    public void getSetName() throws Exception {
        String name = "myName";
        chartData.setName(name);
        assertEquals(name, chartData.getName());
    }

    @Test
    public void getSetDescription() throws Exception {
        String description = "myDescription";
        chartData.setDescription(description);
        assertEquals(description, chartData.getDescription());
    }

    @Test
    public void getSetChartType() throws Exception {
        ChartType result = chartData.getChartType();
        assertEquals(result, ChartType.UNDEFINED);
        ChartType chartType = ChartType.BIRTH;
        chartData.setChartType(chartType);
        assertEquals(chartType, chartData.getChartType());
    }

}