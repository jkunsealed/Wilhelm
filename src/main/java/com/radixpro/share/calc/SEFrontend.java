/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.calc;

import com.radixpro.share.domain.*;
import com.radixpro.share.exceptions.CalculationException;
import swisseph.SwissEph;

import javax.validation.constraints.NotNull;
import java.io.File;
import java.util.List;

/**
 * Frontend for calculations by the Swiss Ephemeris.
 * Implemented as a singleton to prevent multiple instantiations of the SE itself.
 */
public class SEFrontend {

    private static final SEFrontend oneAndOnlyInstance = new SEFrontend();
    private final String path = "." + File.separator + "se";  // TODO --> constants ??
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
     * @param request required items to perform the calculation.
     * @return instance of BodyPosition with the calculated values.
     */
    @NotNull
    public BodyPosition calcBody(@NotNull CalculationRequestBody request) {
        double[] results = new double[6];
        int flagValue = constructCombinedValueForFlags(request.getCalculationFLags());
        int returnCode = 0;
        try {
            returnCode = swissEph.calc(request.getJulianDayNr(), request.getBodyName().getId(), flagValue, results);
        } catch (Exception e) {
            throw new CalculationException(String.format("Exception when calculating body, flagValue: %1$d . " +
                            "Returncode: %2$d . Exception message: %3$s", flagValue, returnCode, e.getMessage()));
        }
        return constructPosition(results, request.getBodyName());
    }

    @NotNull
    HousePositions calcHouses(@NotNull CalculationRequestHouses request) {
        double[] cuspPositions = new double[13];  // for Gauquelin: 37
        double[] ascmcPositions = new double[10];
        int flagValue = constructCombinedValueForFlags(request.getCalculationFLags());
        int returnCode = swissEph.swe_houses(request.getJulianDayNr(), flagValue,
                request.getLocation().getLatitude(), request.getLocation().getLongitude(),
                request.getHouseSystem().getSeId(), cuspPositions, ascmcPositions);
        if (returnCode != 0) {
            throw new CalculationException(String.format("Calculating houses, flagValue: %1$d . Returncode: %2$d .",
                    flagValue, returnCode));
        }
        HousePositions positions = new HousePositions();
        positions.setAllCusps(cuspPositions);
        positions.setAscendant(ascmcPositions[0]);
        positions.setMC(ascmcPositions[1]);
        positions.setVertex(ascmcPositions[3]);
        return positions;
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
