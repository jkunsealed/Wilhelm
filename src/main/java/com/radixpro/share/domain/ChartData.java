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

/**
 * Data Transfer Object for chart data: required data to define and calculate a chart.
 */
public interface ChartData {
    /**
     * Unique identifier for a chart.
     *
     * @return id of the chart.
     */
    @NotNull
    String getId();


    /**
     * Define unique identifier for a chart.
     *
     * @param id the id to use.
     */
    void setId(@NotNull String id);

    /**
     * Get date and time.
     *
     * @return SimpleDateTime instance.
     */
    @NotNull
    SimpleDateTime getDateTime();

    /**
     * Set date and time.
     *
     * @param dateTime date and time.
     */
    void setDateTime(@NotNull SimpleDateTime dateTime);

    /**
     * Get timezone: offset from Universal time.
     *
     * @return offset in minutes and fractions.
     */
    double getTimeZone();

    /**
     * Get timezone: offset from Universal Time.
     *
     * @param tz offset in minutes and fractions.
     */
    void setTimeZone(double tz);

    /**
     * Get location.
     *
     * @return name or description of location.
     */
    @NotNull
    String getPlace();

    /**
     * Set location
     *
     * @param place name or description of location.
     */
    void setPlace(@NotNull String place);

    /**
     * Get Longitude.
     *
     * @return longitude in degrees and fractions. Values between +180 and -180. West = -, east = +.
     */
    double getLongitude();

    /**
     * Set longitude.
     *
     * @param longitude longitude in degrees and fractions. Values between +180 and -180. West = -, east = +.
     */
    void setLongitude(double longitude);

    /**
     * Get latitude.
     *
     * @return latitude in degrees and fractions. Values between +90 and -90. North = +, south = -.
     */
    double getLatitude();

    /**
     * Set latitude.
     *
     * @param latitude latitude in degrees and fractions. Values between +90 and -90. North = +, south = -.
     */
    void setLatitude(double latitude);

    /**
     * Get name.
     *
     * @return name or title of chart.
     */
    @NotNull
    String getName();

    /**
     * Set name.
     *
     * @param name name or title of chart.
     */
    void setName(@NotNull String name);

    /**
     * Get description.
     *
     * @return descriptive text.
     */
    @NotNull
    String getDescription();

    /**
     * Set description.
     *
     * @param description descriptive text.
     */
    void setDescription(@NotNull String description);

    /**
     * Get type of chart.
     *
     * @return type of chart as defined in Enum ChartType.
     */
    @NotNull
    ChartType getChartType();

    /**
     * Set type of chart.
     *
     * @param chartType type of chart as defined in Enum ChartType.
     */
    void setChartType(@NotNull ChartType chartType);


}
