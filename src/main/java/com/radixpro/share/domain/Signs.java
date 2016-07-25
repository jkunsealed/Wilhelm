/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

import com.radixpro.share.exceptions.AnalysisException;

public enum Signs {
    ARIES(1),
    TAURUS(2),
    GEMINI(3),
    CANCER(4),
    LEO(5),
    VIRGO(6),
    LIBRA(7),
    SCORPIO(8),
    SAGITTARIUS(9),
    CAPRICORN(10),
    AQUARIUS(11),
    PISCES(12);

    final int index;

    Signs(int index) {
        this.index = index;
    }

    /**
     * Get index for sign.
     * @return the index.
     */
    public int getIndex() {
        return index;
    }

    /**
     * Retrieve the sign for a given index.
     * PRE: 1 <= index <= 12.
     * @param index
     * @return the sign for the given index
     */
    public static Signs getSignForIndex(int index) {
        for (Signs sign : Signs.values()) {
            if (index == sign.getIndex()) {
                return sign;
            }
        }
        throw new AnalysisException("Error looking up sign for index: " + index);
    }
}
