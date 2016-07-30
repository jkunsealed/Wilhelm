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
import java.util.List;

/**
 * Set of data for charts and meta information on this set.
 */
public interface ChartDataSet {

    /**
     * Get expected number of items.
     *
     * @return expected number of charts in the list with ChartData.
     */
    @NotNull
    Long getCount();

    /**
     * Set expected number of items.
     *
     * @param count expected number of charts in the list with ChartData.
     */
    void setCount(@NotNull Long count);

    /**
     * Get name or title for set.
     *
     * @return name or title.
     */
    @NotNull
    String getName();

    /**
     * Set name or title for set.
     *
     * @param name name or title.
     */
    void setName(@NotNull String name);

    /**
     * Set description.
     *
     * @return descriptive text.
     */
    @NotNull
    String getDescription();

    /**
     * Get description.
     *
     * @param description descriptive text.
     */
    void setDescription(@NotNull String description);

    /**
     * Get all chart data
     *
     * @return list with populated instances of ChartData.
     */
    @NotNull
    List<ChartData> getAllChartData();

    /**
     * Set all chart data.
     *
     * @param allChartData list with populated instances of ChartData.
     */
    void setAllChartData(@NotNull List<ChartData> allChartData);
}