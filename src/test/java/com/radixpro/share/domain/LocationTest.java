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

public class LocationTest {

    private Location location;
    private final double margin = 0.000000001;

    @Before
    public void setUp() throws Exception {
        location = new Location();
    }

    @Test
    public void getSetLongitude() throws Exception {
        double longitude = 12.34;
        location.setLongitude(longitude);
        assertEquals(longitude, location.getLongitude(), margin);
    }

    @Test (expected = RuntimeException.class)
    public void setLongitudeTooSmall() {
        double longitude = -190.0;
        location.setLongitude(longitude);
    }

    @Test (expected = RuntimeException.class)
    public void setLongitudeTooLarge() {
        double longitude = 190.0;
        location.setLongitude(longitude);
    }

    @Test
    public void getSetLatitude() throws Exception {
        double latitude = -11.22;
        location.setLatitude(latitude);
        assertEquals(latitude, location.getLatitude(), margin);
    }

    @Test (expected = RuntimeException.class)
    public void setLatitudeTooSmall() {
        double latitude = -91.0;
        location.setLatitude(latitude);
    }

    @Test (expected = RuntimeException.class)
    public void setLatitudeTooLarge() {
        double latitude = 90.0;
        location.setLatitude(latitude);
    }

}