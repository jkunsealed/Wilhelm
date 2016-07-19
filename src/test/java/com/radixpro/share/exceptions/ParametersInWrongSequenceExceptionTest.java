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
        double value1 = 13.0;
        double value2 = 11.1;
        try {
            throw new ParametersInWrongSequenceException(Double.toString(value1), Double.toString(value2));
        } catch (ParametersInWrongSequenceException wsope) {
            assertEquals(expected, wsope.getMessage());
        }
    }
}