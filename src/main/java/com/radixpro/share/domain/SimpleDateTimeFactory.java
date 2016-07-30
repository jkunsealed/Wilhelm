/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.domain;

import com.radixpro.share.util.Constants;
import swisseph.SweDate;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


public class SimpleDateTimeFactory {

    /**
     * Construct SimpleDateTime from LocalDateTime. Uses Gregorian calendar.
     *
     * @param localDateTime instance of LocalDateTime.
     * @return the constructed SimpleDateTime instance.
     */
    @NotNull
    public SimpleDateTime getSimpleDateTime(@NotNull LocalDateTime localDateTime) {
        return getSimpleDateTime(localDateTime, Calendar.GREGORIAN);
    }

    /**
     * Construct SimpleDateTime from LocalDateTime.
     * @param localDateTime instance of LocalDateTime.
     * @param cal calendar to use.
     * @return the constructed SimpleDateTime instance.
     */
    @NotNull
    public SimpleDateTime getSimpleDateTime(@NotNull LocalDateTime localDateTime, @NotNull Calendar cal) {
        return constructSimpleDateTime(localDateTime, cal);
    }

    /**
     * Construct SimpleDateTime. Uses Gregorian Calendar.
     * @param year year
     * @param month month 1..12
     * @param day day 1..28/29/31
     * @param ut universal time, minutes/seconds as a decimal fraction.
     * @return the constructed SimpleDateTime instance.
     */
    @NotNull
    public SimpleDateTime getSimpleDateTime(int year, int month, int day, double ut) {
        return getSimpleDateTime(year, month, day, ut, Calendar.GREGORIAN);
    }

    /**
     * Construct SimpleDateTime.
     * @param year year
     * @param month month 1..12
     * @param day day 1..28/29/31
     * @param ut universal time, minutes/seconds as a decimal fraction.
     * @param cal calendar to use.
     * @return the constructed SimpleDateTime instance.
     */
    @NotNull
    public SimpleDateTime getSimpleDateTime(int year, int month, int day, double ut, @NotNull Calendar cal) {
        return constructSimpleDateTime(year, month, day, ut, cal);
    }


    @NotNull
    private SimpleDateTime constructSimpleDateTime(@NotNull LocalDateTime localDateTime, @NotNull Calendar cal) {
        SimpleDateTime simpleDateTime = new SimpleDateTime();
        simpleDateTime.setYear(localDateTime.getYear());
        simpleDateTime.setMonth(localDateTime.getMonth().getValue());
        simpleDateTime.setDay(localDateTime.getDayOfMonth());
        double ut = localDateTime.getHour() + (double) localDateTime.getMinute() / Constants.MINUTES_PER_HOUR
                + (double) localDateTime.getSecond() / Constants.SECONDS_PER_HOUR;
        simpleDateTime.setUt(ut);
        simpleDateTime.setJdnr(calcJd(simpleDateTime));
        return simpleDateTime;
    }

    @NotNull
    private SimpleDateTime constructSimpleDateTime(int year, int month, int day, double ut, @NotNull Calendar cal) {
        SimpleDateTime simpleDateTime = new SimpleDateTime();
        simpleDateTime.setYear(year);
        simpleDateTime.setMonth(month);
        simpleDateTime.setDay(day);
        simpleDateTime.setUt(ut);
        simpleDateTime.setCalendar(cal);
        simpleDateTime.setJdnr(calcJd(simpleDateTime));
        return simpleDateTime;
    }

    @NotNull
    public SimpleDateTime constructSimpleDateTime(@NotNull Long milliseconds) {
        Long seconds = milliseconds / Constants.MILLISECONDS_PER_SECOND;
        LocalDateTime localDateTime = Constants.EPOCH_DATE_FOR_QUAKES.plusSeconds(seconds);
        return getSimpleDateTime(localDateTime);
    }




    private double calcJd(@NotNull SimpleDateTime dateTime) {
        SweDate sweDate = new SweDate(dateTime.getYear(), dateTime.getMonth(), dateTime.getDay(), dateTime.getUt(),
                dateTime.getCalendar() == Calendar.GREGORIAN);
        return sweDate.getJulDay();
    }


}
