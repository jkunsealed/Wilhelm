/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.endpoint;

import com.radixpro.share.domain.BodyNames;
import com.radixpro.share.domain.CalculationFlags;
import com.radixpro.share.domain.Location;
import com.radixpro.share.exceptions.ParameterOutOfRangeException;
import com.radixpro.share.util.Constants;
import javax.validation.constraints.NotNull;

import java.util.List;


public class CalculationRequestBody implements CalculationRequest {

    private Location location;
    private double julianDayNr;
    private BodyNames bodyName;
    private List<CalculationFlags> calculationFLags;

    @Override
    public void setLocation(@NotNull Location location) {
        this.location = location;
    }

    @NotNull
    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setJulianDayNr(double julianDayNr) {
        validateJulianDayNr(julianDayNr);
        this.julianDayNr = julianDayNr;
    }

    @Override
    public double getJulianDayNr() {
        return julianDayNr;
    }

    @NotNull
    public BodyNames getBodyName() {
        return bodyName;
    }

    public void setBodyName(@NotNull BodyNames bodyName) {
        this.bodyName = bodyName;
    }

    @NotNull
    public List<CalculationFlags> getCalculationFLags() {
        return calculationFLags;
    }

    public void setCalculationFLags(@NotNull List<CalculationFlags> calculationFLags) {
        this.calculationFLags = calculationFLags;
    }

    private void validateJulianDayNr(double julianDayNr) {
        if (julianDayNr < Constants.MIN_JULIAN_DAY_NR || julianDayNr > Constants.MAX_JULIAN_DAY_NR) {
            throw new ParameterOutOfRangeException(Double.toString(julianDayNr));
        }
    }
}
