/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.calc;

import com.radixpro.share.domain.*;
import com.sun.istack.internal.NotNull;
import swisseph.SweDate;

import java.util.List;

/**
 * Endpoint for Calculations.
 */
public class CalculationEndPoint {

    @NotNull
    public CalculationResponseBody calcSingleBody(@NotNull CalculationRequestBody request) {
        CalculationHandler calculationHandler = new CalculationHandlerFactory().getCalculationHandler();
        return calculationHandler.calcBody(request);
    }

    @NotNull
    public CalculationResponseHouses calcHouses(@NotNull CalculationRequestHouses request) {
        CalculationHandler calculationHandler = new CalculationHandlerFactory().getCalculationHandler();
        return calculationHandler.calcHouses(request);
    }
}
