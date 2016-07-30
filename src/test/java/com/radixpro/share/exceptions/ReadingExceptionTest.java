/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReadingExceptionTest {
    @Test
    public void getMessage() throws Exception {
        ReadingException re = new ReadingException("description");
        String expected = "Reading error: description";
        assertEquals(expected, re.getMessage());
    }
}