/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParameterOutOfRangeExceptionTest {

    @Test
    public void getMessage() throws Exception {
        String expected = "Parameter 13.0 out of range.";
        double value = 13.0;
        try {
            throw new ParameterOutOfRangeException(Double.toString(value));
        } catch (ParameterOutOfRangeException poore) {
            assertEquals(expected, poore.getMessage());
        }
    }
}