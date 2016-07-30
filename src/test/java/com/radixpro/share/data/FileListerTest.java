/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.data;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class FileListerTest {

    private FileLister fileLister;

    @Before
    public void setUp() throws Exception {
        fileLister = new FileLister();
    }

    @Test
    public void getFilenames() throws Exception {
        try {
            List<String> filenames = fileLister.getFilenames(".", "json");
            assertTrue("No exception occurred", true);
        } catch (Exception e) {
            fail ("Unexepcted exception : " + e.getMessage());
        }
    }

}