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
import com.radixpro.share.util.Constants;
import com.sun.istack.internal.NotNull;
import swisseph.SweDate;

import java.util.List;

/**
 * Handler for several types of calculations.
 */
class CalculationHandler {

    private final SEFrontend seFrontend;

    CalculationHandler(@NotNull SEFrontend seFrontend) {
        this.seFrontend = seFrontend;
    }

    @NotNull
    CalculationResponseBody calcBody(@NotNull SweDate sweDate,
                                            @NotNull BodyNames bodyName,
                                            @NotNull List<CalculationFlags> flags) {
        SEFrontend seFrontend = new SEFrontendFactory().getSEFrontend();
        CalculationResponseBody response = new CalculationResponseBody();
        response.setPosition(seFrontend.calcBody(sweDate, bodyName, flags));
        response.setStatus(Constants.STATUS_OK);
        return response;
    }


}
