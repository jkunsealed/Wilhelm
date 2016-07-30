/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.domain;

import javax.validation.constraints.NotNull;

public class SimpleDateTime {

    private Calendar calendar;
    private int day;
    private int month;
    private double ut;
    private int year;
    private double jdnr;

    @NotNull
    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(@NotNull Calendar calendar) {
        this.calendar = calendar;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getUt() {
        return ut;
    }

    public void setUt(double ut) {
        this.ut = ut;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getJdnr() {
        return jdnr;
    }

    public void setJdnr(double jdnr) {
        this.jdnr = jdnr;
    }
}
