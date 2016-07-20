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

public class PositionTest {

    private Position position;
    private final double mainValue = 181.1;
    private final double deviation = -1.2;
    private final double distance = 2.2;
    private final double speedMainValue = 1.1;
    private final double speedDeviation = -0.1;
    private final double speedDistance = 0.002;
    private final double margin = 0.000000001;

    @Before
    public void setUp() throws Exception {
        position = new Position();
    }

    @Test
    public void setGetMainValue() throws Exception {
        position.setMainValue(mainValue);
        assertEquals(mainValue, position.getMainValue(), margin);
    }

    @Test
    public void setGetDeviation() throws Exception {
        position.setDeviation(deviation);
        assertEquals(deviation, position.getDeviation(), margin);
    }

    @Test
    public void setGetDistance() throws Exception {
        position.setDistance(distance);
        assertEquals(distance, position.getDistance(), margin);
    }

    @Test
    public void setGetSpeedMainValue() throws Exception {
        position.setSpeedMainValue(speedMainValue);
        assertEquals(speedMainValue, position.getSpeedMainValue(), margin);
    }

    @Test
    public void setGetSpeedDeviation() throws Exception {
        position.setSpeedDeviation(speedDeviation);
        assertEquals(speedDeviation, position.getSpeedDeviation(), margin);
    }

    @Test
    public void setGetSpeedDistance() throws Exception {
        position.setSpeedDistance(speedDistance);
        assertEquals(speedDistance, position.getSpeedDistance(), margin);
    }
}