/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */
package com.radixpro.share.domain;

/**
 * Enum for HouseSystems. The value for seId corresponds with the indexes as used by the Swiss Ephemeris.
 */
public enum HouseSystems {
    NONE('!',0),
    PLACIDUS('P', 1),
    KOCH('K',2),
    PORPHYRIUS('O',3),
    REGIOMONTANUS('R',4),
    CAMPANUS('C',5),
    EQUAL_ASC('A',6),           // SE also supports 'E'.
    VEHLOW('V',7),
    WHOLE_SIGN('W',8),
    AXIAL_ROTATION('X',9),
    HORIZONTAL('H',10),
    TOPOCENTRIC('T',11),
    ALCABITIUS('B',12),
    MORINUS('M',13),
    KRUSINSKI('K',14),
    GAUQUELIN('G',15),
    APC('Y',16);


    private final char seId;
    private final int id;

    HouseSystems(char seId, int id) {
        this.seId = seId;
        this.id = id;
    }


    /**
     * Getter for seId, the value as used by the Swiss Ephemeris.
     * If a system is bot supported by the SE, this value will be the negation sign '!'.
     * @return Value for seId, the id as used by the Swiss Ephemeris, or a '!' if SE does not handle the system.
     */
    public char getSeId() {
        return seId;
    }

    /**
     * Getter for id.
     * @return Value for the internally used id.
     */
    public int getId() {
        return id;
    }
}

