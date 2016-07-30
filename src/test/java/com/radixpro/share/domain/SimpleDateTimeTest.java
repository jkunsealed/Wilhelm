/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleDateTimeTest {

    private SimpleDateTime simpleDateTime;
    private final double margin = 0.000000001;

    @Before
    public void setUp() throws Exception {
        simpleDateTime = new SimpleDateTime();
    }

    @Test
    public void getSetCalendar() throws Exception {
        Calendar cal = Calendar.GREGORIAN;
        simpleDateTime.setCalendar(cal);
        assertEquals(cal, simpleDateTime.getCalendar());
    }

    @Test
    public void getSetDay() throws Exception {
        int day = 13;
        simpleDateTime.setDay(day);
        assertEquals(day, simpleDateTime.getDay());
    }

    @Test
    public void getSetMonth() throws Exception {
        int month = 3;
        simpleDateTime.setMonth(month);
        assertEquals(month, simpleDateTime.getMonth());
    }

    @Test
    public void getSetUt() throws Exception {
        double ut = 8.666;
        simpleDateTime.setUt(ut);
        assertEquals(ut, simpleDateTime.getUt(), margin);
    }

    @Test
    public void getSetYear() throws Exception {
        int year = 2000;
        simpleDateTime.setYear(year);
        assertEquals(year, simpleDateTime.getYear());
    }

    @Test
    public void getSetJdnr() throws Exception {
        double jdnr = 12345.678;
        simpleDateTime.setJdnr(jdnr);
        assertEquals(jdnr, simpleDateTime.getJdnr(), margin);
    }
}
