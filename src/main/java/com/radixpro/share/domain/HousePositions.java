/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

public class HousePositions {

    private double[] allCusps;
    private double MC;
    private double ascendant;
    private double vertex;

    public double[] getAllCusps() {
        return allCusps;
    }

    public void setAllCusps(double[] allCusps) {
        this.allCusps = allCusps;
    }

    public double getMC() {
        return MC;
    }

    public void setMC(double MC) {
        this.MC = MC;
    }

    public double getAscendant() {
        return ascendant;
    }

    public void setAscendant(double ascendant) {
        this.ascendant = ascendant;
    }

    public double getVertex() {
        return vertex;
    }

    public void setVertex(double vertex) {
        this.vertex = vertex;
    }

}
