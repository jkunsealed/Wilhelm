/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.calc;

import com.radixpro.share.domain.BodyNames;
import com.radixpro.share.domain.CalculationFlags;
import com.radixpro.share.domain.CalculationResponseBody;
import com.sun.istack.internal.NotNull;
import swisseph.SweDate;

import java.util.List;

/**
 * Endpoint for Calculations.
 */
public class CalculationEndPoint {

    @NotNull
    public CalculationResponseBody calcSingleBody(@NotNull SweDate sweDate,
                                                  @NotNull BodyNames bodyName,
                                                  @NotNull List<CalculationFlags> flags) {
        CalculationHandler calculationHandler = new CalculationHandlerFactory().getCalculationHandler();
        return calculationHandler.calcBody(sweDate, bodyName, flags);
    }
}
