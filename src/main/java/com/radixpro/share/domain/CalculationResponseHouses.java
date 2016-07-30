/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

import javax.validation.constraints.NotNull;

public class CalculationResponseHouses implements CalculationResponse {

    private String status;
    private HouseSystems houseSystem;
    private HousePositions housePositions;


    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(@NotNull String status) {
        this.status = status;
    }

    public void setHouseSystem(@ NotNull HouseSystems houseSystem) {
        this.houseSystem = houseSystem;
    }

    @NotNull
    public HouseSystems getHouseSystem() {
        return houseSystem;
    }

    @NotNull
    public HousePositions getHousePositions() {
        return housePositions;
    }

    public void setHousePositions(@NotNull HousePositions housePositions) {
        this.housePositions = housePositions;
    }
}
