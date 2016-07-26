/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.analysis;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class RelativePositionEndpointTest {

    private RelativePositionEndpoint endpoint;

    @Before
    public void setUp() throws Exception {
        endpoint = new RelativePositionEndpoint();
    }

    @Test
    public void isInZone() throws Exception {
        double anchorPoint = 10.1;
        double orb = 5.0;
        double movingPoint = 12.0;
        try {
            endpoint.isInZone(createZones(), anchorPoint, orb, movingPoint);
            assertTrue("No exception occurred", true);
        } catch (Exception e) {
            fail ("Unexpected exception was thrown.");
        }


    }

    private List<Double> createZones() {
        List<Double> zones = new ArrayList<>();
        zones.add(0.0);
        zones.add(180.0);
        return zones;
    }
}