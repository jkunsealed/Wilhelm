/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.analysis;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class SignsEndpointTest {

    private SignsEndpoint endpoint;

    @Before
    public void setUp() throws Exception {
        endpoint = new SignsEndpoint();
    }

    @Test
    public void findSignForLongitude() throws Exception {
        double longitude = 11.0;
        try {
            endpoint.findSignForLongitude(longitude);
            assertTrue("No exception ocurred.", true);
        } catch (Exception e) {
            fail("An unexpected exception was thrown.");
        }
    }
}