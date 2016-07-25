/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.calc;

import com.radixpro.share.domain.BodyNames;
import com.radixpro.share.domain.BodyPosition;
import com.radixpro.share.domain.CalculationFlags;
import com.radixpro.share.exceptions.CalculationException;
import com.sun.istack.internal.NotNull;
import swisseph.SweDate;
import swisseph.SwissEph;

import java.io.File;
import java.util.List;

/**
 * Frontend for calculations by the Swiss Ephemeris.
 * Implemented as a singleton to prevent multiple instantiations of the SE itself.
 */
class SEFrontend {

    private static final SEFrontend oneAndOnlyInstance = new SEFrontend();
    private final String path = "." + File.pathSeparator + "se";  // TODO --> constants ??
    private SwissEph swissEph;

    private SEFrontend() {
        // prevent direct instantiation.
    }

    static SEFrontend getSEFrontEnd() {
        return oneAndOnlyInstance;
    }

    void setSwissEph(@NotNull SwissEph swissEph) {
        this.swissEph = swissEph;
    }
    /**
     * Calculate a body.
     * @param sweDate date for calculation.
     * @param bodyName the body to calculate.
     * @param flags settings for calculations.
     * @return instance of BodyPosition with the calculated values.
     */
    @NotNull
    BodyPosition calcBody(@NotNull SweDate sweDate, @NotNull BodyNames bodyName, @NotNull List<CalculationFlags> flags) {
        double[] results = new double[6];
        int flagValue = constructCombinedValueForFlags(flags);
        int returnCode = swissEph.calc(sweDate.getJulDay(), bodyName.getId(), flagValue, results);
        if (returnCode != flagValue) {
            throw new CalculationException(String.format("Calculating body, flagValue: %1$d . Returncode: %2$d .", flagValue, returnCode));
        }
        return constructPosition(results, bodyName);
    }

    @NotNull
    private BodyPosition constructPosition(@NotNull double[] elementsForPosition, @NotNull BodyNames bodyName) {
        BodyPosition bodyPosition = new BodyPosition();
        bodyPosition.setBodyName(bodyName);
        bodyPosition.setMainValue(elementsForPosition[0]);
        bodyPosition.setDeviation(elementsForPosition[1]);
        bodyPosition.setDistance(elementsForPosition[2]);
        bodyPosition.setSpeedMainValue(elementsForPosition[3]);
        bodyPosition.setSpeedDeviation(elementsForPosition[4]);
        bodyPosition.setSpeedDistance(elementsForPosition[5]);
        return bodyPosition;
    }

    private int constructCombinedValueForFlags(@NotNull List<CalculationFlags> flags) {
        int combinedValue = 0;
        for (CalculationFlags flag : flags) {
            combinedValue = combinedValue | flag.getFlagId();
        }
        return combinedValue;
    }

}
