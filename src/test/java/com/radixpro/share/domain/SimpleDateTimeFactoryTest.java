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

import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;

public class SimpleDateTimeFactoryTest {

    private SimpleDateTimeFactory factory;
    private final double margin = 0.000000001;

    @Before
    public void setUp() throws Exception {
        factory = new SimpleDateTimeFactory();
    }

    @Test
    public void getSimpleDateTimeForLocalDateTime() throws Exception {
        LocalDateTime localDateTime = LocalDateTime.of(2016, 5, 28, 21, 54, 0);
        SimpleDateTime simpleDateTime = factory.getSimpleDateTime(localDateTime);
        assertEquals(localDateTime.getYear(), simpleDateTime.getYear());
        assertEquals(21.9, simpleDateTime.getUt(), margin);
    }

    @Test
    public void getSimpleDateTimeForLocalDateTimeWithCal() throws Exception {
        LocalDateTime localDateTime = LocalDateTime.of(2016, 6, 29, 22, 24, 0);
        SimpleDateTime simpleDateTime = factory.getSimpleDateTime(localDateTime, Calendar.GREGORIAN);
        assertEquals(localDateTime.getYear(), simpleDateTime.getYear());
        assertEquals(22.4, simpleDateTime.getUt(), margin);
    }

    @Test
    public void getSimpleDateTime() throws Exception {
        int year = 2016; int month = 5; int day = 28; double ut = 21.9;
        SimpleDateTime simpleDateTime = factory.getSimpleDateTime(year, month, day, ut);
        assertEquals(year, simpleDateTime.getYear());
        assertEquals(ut, simpleDateTime.getUt(), margin);
    }

    @Test
    public void getSimpleDateTimeWithCal() throws Exception {
        int year = 2016; int month = 6; int day = 29; double ut = 22.4; Calendar cal = Calendar.GREGORIAN;
        SimpleDateTime simpleDateTime = factory.getSimpleDateTime(year, month, day, ut, cal);
        assertEquals(year, simpleDateTime.getYear());
        assertEquals(22.4, simpleDateTime.getUt(), margin);
        assertEquals(cal, simpleDateTime.getCalendar());
    }




}