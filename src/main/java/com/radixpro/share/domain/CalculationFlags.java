/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */
package com.radixpro.share.domain;

import swisseph.SweConst;

/**
 * Flags to define the way positions are being calculated by he Swiss Ephemeris.
 */
public enum CalculationFlags {
    SWIEPH(SweConst.SEFLG_SWIEPH),
    HELCTR(SweConst.SEFLG_HELCTR),
    TRUEPOS(SweConst.SEFLG_TRUEPOS),
    SPEED(SweConst.SEFLG_SPEED),
    EQUATORIAL(SweConst.SEFLG_EQUATORIAL),
    XYZ(SweConst.SEFLG_XYZ),
    TOPOCTR(SweConst.SEFLG_TOPOCTR),
    SIDEREAL(SweConst.SEFLG_SIDEREAL);

    private final int seFlagId;

    CalculationFlags(int seFlagId) {
        this.seFlagId = seFlagId;
    }

    /**
     * Return the id of this flag, this id corresponds with the value as used in the Swiss Ephemeris.
     * @return id of the flag.
     */
    public int getFlagId() {
        return seFlagId;
    }

}
