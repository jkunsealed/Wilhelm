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

import javax.validation.constraints.NotNull;

/**
 * Standard implmentation of ChartData, also used as parent for specific implementations of ChartData.
 */
public class ChartDataImpl implements ChartData {

    private double timeZone;
    private double longitude;
    private double latitude;
    private String id = Constants.EMPTY_STRING;
    private String place = Constants.EMPTY_STRING;
    private String name = Constants.EMPTY_STRING;
    private String description = Constants.EMPTY_STRING;
    private ChartType chartType = ChartType.UNDEFINED;
    private SimpleDateTime dateTime;

    @Override
    @NotNull
    public String getId() {
        return id;
    }

    @Override
    public void setId(@NotNull String id) {
        this.id = id;
    }

    @Override
    @NotNull
    public SimpleDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public void setDateTime(@NotNull SimpleDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public double getTimeZone() {
        return timeZone;
    }

    @Override
    public void setTimeZone(double tz) {
        this.timeZone = tz;
    }

    @Override
    @NotNull
    public String getPlace() {
        return place;
    }

    @Override
    public void setPlace(@NotNull String place) {
        this.place = place;
    }

    @Override
    public double getLongitude() {
        return longitude;
    }

    @Override
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public double getLatitude() {
        return latitude;
    }

    @Override
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    @NotNull
    public String getName() {
        return name;
    }

    @Override
    public void setName(@NotNull String name) {
        this.name = name;
    }

    @Override
    @NotNull
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(@NotNull String description) {
        this.description = description;
    }

    @Override
    @NotNull
    public ChartType getChartType() {
        return chartType;
    }

    @Override
    public void setChartType(@NotNull ChartType chartType) {
        this.chartType = chartType;
    }
}
