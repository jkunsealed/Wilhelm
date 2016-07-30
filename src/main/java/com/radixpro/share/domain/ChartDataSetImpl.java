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
 * DTO with set of data for charts.
 */
public class ChartDataSetImpl implements ChartDataSet {

    private Long count;
    private String name;
    private String description;
    private List<ChartData> allChartData;

    @Override
    @NotNull
    public Long getCount() {
        return count;
    }

    @Override
    public void setCount(@NotNull Long count) {
        this.count = count;
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
    public List<ChartData> getAllChartData() {
        return allChartData;
    }

    @Override
    public void setAllChartData(@NotNull List<ChartData> allChartData) {
        this.allChartData = allChartData;
    }
}
