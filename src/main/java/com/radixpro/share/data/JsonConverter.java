/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.data;

import com.radixpro.share.domain.ChartDataSet;
import org.json.simple.JSONObject;

import javax.validation.constraints.NotNull;

/**
 * Interface for converters from JSONObject to ChartDataSet.
 */
public interface JsonConverter {

    @NotNull
    ChartDataSet jsonToChartData(@NotNull JSONObject object);

}
