/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.analysis;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RelativePositionAnalysisTest {

    private RelativePositionAnalysis rpAnalysis;


    @Test
    public void isInZoneHappyFlow() throws Exception {
        double anchorPoint = 280.2;
        double orb = 15.0;
        rpAnalysis = new RelativePositionAnalysis(createZones(), anchorPoint, orb);
        assertTrue(rpAnalysis.isInZone(101.0));
    }

    @Test
    public void isInZoneDistanceNegative() throws Exception {
        double anchorPoint = 280.2;
        double orb = 15.0;
        rpAnalysis = new RelativePositionAnalysis(createZones(), anchorPoint, orb);
        assertTrue(rpAnalysis.isInZone(278.0));
    }

    @Test
    public void isInZoneAnchorAlmostZero() throws Exception {
        double anchorPoint = 1.2;
        double orb = 15.0;
        rpAnalysis = new RelativePositionAnalysis(createZones(), anchorPoint, orb);
        assertTrue(rpAnalysis.isInZone(182.3));
    }

    @Test
    public void isInZoneAnchorAlmostZeroDistanceNegative() throws Exception {
        double anchorPoint = 1.2;
        double orb = 15.0;
        rpAnalysis = new RelativePositionAnalysis(createZones(), anchorPoint, orb);
        assertTrue(rpAnalysis.isInZone(179.8));
    }

    @Test
    public void isNotInZoneHappyFlow() throws Exception {
        double anchorPoint = 280.2;
        double orb = 15.0;
        rpAnalysis = new RelativePositionAnalysis(createZones(), anchorPoint, orb);
        assertFalse(rpAnalysis.isInZone(350.0));
    }

    @Test
    public void isNotInZoneDistanceNegative() throws Exception {
        double anchorPoint = 280.2;
        double orb = 15.0;
        rpAnalysis = new RelativePositionAnalysis(createZones(), anchorPoint, orb);
        assertFalse(rpAnalysis.isInZone(220.0));
    }

    @Test
    public void isNotInZoneAnchorAlmostZero() throws Exception {
        double anchorPoint = 1.2;
        double orb = 15.0;
        rpAnalysis = new RelativePositionAnalysis(createZones(), anchorPoint, orb);
        assertFalse(rpAnalysis.isInZone(220.0));
    }

    private List<Double> createZones() {
        List<Double> zones = new ArrayList<>();
        zones.add(0.0);
        zones.add(180.0);
        return zones;
    }
}