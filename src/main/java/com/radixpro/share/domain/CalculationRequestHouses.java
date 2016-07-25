/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

import javax.validation.constraints.NotNull;
import java.util.List;

public class CalculationRequestHouses implements CalculationRequest {


    private Location location;
    private double julianDayNr;
    private HouseSystems houseSystem;
    private List<CalculationFlags> calculationFLags;

    @Override
    public void setLocation(@NotNull Location location) {
        this.location = location;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setJulianDayNr(double julianDayNr) {
        this.julianDayNr = julianDayNr;
    }

    @Override
    public double getJulianDayNr() {
        return julianDayNr;
    }

    public void setHouseSystem(HouseSystems houseSystem) {
        this.houseSystem = houseSystem;
    }

    public HouseSystems getHouseSystem() {
        return houseSystem;
    }

    public List<CalculationFlags> getCalculationFLags() {
        return calculationFLags;
    }

    public void setCalculationFLags(List<CalculationFlags> calculationFLags) {
        this.calculationFLags = calculationFLags;
    }
}
