/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.data;

import com.radixpro.share.domain.ChartData;
import com.radixpro.share.domain.ChartDataImpl;
import com.radixpro.share.exceptions.PersistencyException;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class JsonWriterTest {

    private JsonWriter jsonWriter;

    @Before
    public void setUp() throws Exception {
        jsonWriter = new JsonWriter();
    }

    @Test
    public void write2File() throws Exception {
        try {
            jsonWriter.write2File("." + File.separator + "myfile.json", createObject(), true);
            assertTrue("No exception was thrown", true);
        } catch (Exception e) {
            fail("Unexpected exception was thrown: " + e.getMessage());
        }
    }

    @Test (expected = PersistencyException.class)
    public void write2FileWithError() throws Exception {
        jsonWriter.write2File("", null, true);
    }


    private Object createObject() {
        ChartData data = new ChartDataImpl();
        data.setLatitude(3.0);
        data.setLongitude(5.2);
        data.setId("123");
        data.setName("dummy");
        return data;
    }

}