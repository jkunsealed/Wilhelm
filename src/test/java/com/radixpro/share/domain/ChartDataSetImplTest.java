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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ChartDataSetImplTest {

    private ChartDataSet dataSet;

    @Before
    public void setUp() throws Exception {
        dataSet = new ChartDataSetImpl();
    }

    @Test
    public void getSetCount() throws Exception {
        Long count = 4L;
        dataSet.setCount(count);
        assertEquals(count, dataSet.getCount());
    }

    @Test
    public void getSetName() throws Exception {
        String name = "myName";
        dataSet.setName(name);
        assertEquals(name, dataSet.getName());
    }

    @Test
    public void getSetDescription() throws Exception {
        String description = "myDescription";
        dataSet.setDescription(description);
        assertEquals(description, dataSet.getDescription());
    }

    @Test
    public void getSetAllChartData() throws Exception {
        List<ChartData> chartData = new ArrayList<>();
        dataSet.setAllChartData(chartData);
        assertEquals(chartData, dataSet.getAllChartData());
    }

}