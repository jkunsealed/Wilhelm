/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.calc;

import com.radixpro.share.domain.CalculationRequestBody;
import com.radixpro.share.domain.CalculationRequestHouses;
import com.radixpro.share.domain.CalculationResponseBody;
import com.radixpro.share.domain.CalculationResponseHouses;
import com.radixpro.share.util.Constants;

import javax.validation.constraints.NotNull;

/**
 * Handler for several types of calculations.
 */
class CalculationHandler {

    private final SEFrontend seFrontend;

    CalculationHandler(@NotNull SEFrontend seFrontend) {
        this.seFrontend = seFrontend;
    }

    @NotNull
    CalculationResponseBody calcBody(@NotNull CalculationRequestBody request) {
        SEFrontend seFrontend = new SEFrontendFactory().getSEFrontend();
        CalculationResponseBody response = new CalculationResponseBody();
        response.setPosition(seFrontend.calcBody(request));
        response.setStatus(Constants.STATUS_OK);
        return response;
    }

    @NotNull
    CalculationResponseHouses calcHouses(@NotNull CalculationRequestHouses request) {
        SEFrontend seFrontend = new SEFrontendFactory().getSEFrontend();
        CalculationResponseHouses response = new CalculationResponseHouses();
        response.setHousePositions(seFrontend.calcHouses(request));
        response.setHouseSystem(request.getHouseSystem());
        response.setStatus(Constants.STATUS_OK);
        return response;
    }
}
