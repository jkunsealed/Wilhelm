/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */
package com.radixpro.share.domain;

import swisseph.SweConst;

/**
 * Enum for planets and other bodies ad positional points.<br/>
 * The keys and values for the enum correspond to the values as used in the Swiss Ephemeris.
 * However, the prefix <i>SE_</i> is removed from the keys.<br/>
 * Not all possibilities are being implemented yet.
 */
public enum BodyNames {
    SUN(0),
    MOON(1),
    MERCURY(2),
    VENUS(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9),
    MEAN_NODE(10),
    TRUE_NODE(11),
    MEAN_APOG(12),
    OSCU_APOG(13),
    EARTH(14),
    CHIRON(15),
    PHOLUS(16),
    CERES(17),
    PALLAS(18),
    JUNO(19),
    VESTA(20),
    INTP_APOG(21),
    INTP_PERG(22),
    ERIS(SweConst.SE_AST_OFFSET + 999001);

    private final int id;

    BodyNames(int id) {
        this.id = id;
    }

    /**
     * Get internal id for body. This id is identical to the id for the Swiss Ephemeris.
     * @return the internal id.
     */
    public int getId() {
        return id;
    }

}