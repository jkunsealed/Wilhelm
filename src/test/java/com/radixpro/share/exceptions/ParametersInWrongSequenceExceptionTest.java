/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParametersInWrongSequenceExceptionTest {

    @Test
    public void getMessage() throws Exception {
        String expected = "Parameters 13.0 and 11.1 in wrong sequence.";
        String value1 = Double.toString(13.0);
        String value2 = Double.toString(11.1);
        ParametersInWrongSequenceException piwse = new ParametersInWrongSequenceException(value1, value2);
        assertEquals(expected, piwse.getMessage());
    }
}