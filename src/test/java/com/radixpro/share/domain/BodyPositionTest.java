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

public class BodyPositionTest {

    private BodyPosition bodyPosition;
    private final BodyNames bodyName = BodyNames.JUPITER;
    private final double mainValue = 181.1;
    private final double deviation = -1.2;
    private final double distance = 2.2;
    private final double speedMainValue = 1.1;
    private final double speedDeviation = -0.1;
    private final double speedDistance = 0.002;
    private final double margin = 0.000000001;

    @Before
    public void setUp() throws Exception {
        bodyPosition = new BodyPosition();
    }


    @Test
    public void setGetBodyName() throws Exception {
        bodyPosition.setBodyName(bodyName);
        assertEquals(bodyName, bodyPosition.getBodyName());
    }


    @Test
    public void setGetMainValue() throws Exception {
        bodyPosition.setMainValue(mainValue);
        assertEquals(mainValue, bodyPosition.getMainValue(), margin);
    }

    @Test
    public void setGetDeviation() throws Exception {
        bodyPosition.setDeviation(deviation);
        assertEquals(deviation, bodyPosition.getDeviation(), margin);
    }

    @Test
    public void setGetDistance() throws Exception {
        bodyPosition.setDistance(distance);
        assertEquals(distance, bodyPosition.getDistance(), margin);
    }

    @Test
    public void setGetSpeedMainValue() throws Exception {
        bodyPosition.setSpeedMainValue(speedMainValue);
        assertEquals(speedMainValue, bodyPosition.getSpeedMainValue(), margin);
    }

    @Test
    public void setGetSpeedDeviation() throws Exception {
        bodyPosition.setSpeedDeviation(speedDeviation);
        assertEquals(speedDeviation, bodyPosition.getSpeedDeviation(), margin);
    }

    @Test
    public void setGetSpeedDistance() throws Exception {
        bodyPosition.setSpeedDistance(speedDistance);
        assertEquals(speedDistance, bodyPosition.getSpeedDistance(), margin);
    }
}