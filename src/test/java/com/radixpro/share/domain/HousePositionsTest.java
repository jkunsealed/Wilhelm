/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HousePositionsTest {

    private HousePositions housePositions;
    private final double margin = 0.000000001;

    @Before
    public void setUp() throws Exception {
        housePositions = new HousePositions();
    }

    @Test
    public void setGetAllCusps() throws Exception {
        double[] allCusps = new double[13];
        housePositions.setAllCusps(allCusps);
        assertEquals(allCusps, housePositions.getAllCusps());
    }

    @Test
    public void setGetMC() throws Exception {
        double mc = 251.0;
        housePositions.setMC(mc);
        assertEquals(mc, housePositions.getMC(), margin);
    }

    @Test
    public void setGetAscendant() throws Exception {
        double asc = 314.5;
        housePositions.setAscendant(asc);
        assertEquals(asc, housePositions.getAscendant(), margin);
    }

    @Test
    public void getVertex() throws Exception {
        double vertex = 2.3;
        housePositions.setVertex(vertex);
        assertEquals(vertex, housePositions.getVertex(), margin);
    }
}