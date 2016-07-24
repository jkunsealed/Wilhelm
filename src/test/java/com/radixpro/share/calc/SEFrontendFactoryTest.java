/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.calc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SEFrontendFactoryTest {

    private SEFrontendFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new SEFrontendFactory();

    }

    @Test
    public void getSEFrontend() throws Exception {
        assertNotNull(factory.getSEFrontend());
    }
}