/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.util;

/**
 * Shared constants.
 */
public class Constants {

    // FIXME correct values for jdnr limits
    public static final double MAX_JULIAN_DAY_NR = 12345678.0;
    public static final double MIN_JULIAN_DAY_NR = -12345678.0;
    public static final double MAX_LONGITUDE = 180.0;
    public static final double MIN_LONGITUDE = -180.0;
    public static final double MAX_LATITUDE = 89.999999;
    public static final double MIN_LATITUDE = -89.999999;
    public static final String STATUS_OK = "OK";
    public static final String STATUS_UNKNOWN_ERROR = "ERROR_UNKNOWN";

    private Constants() {
        // prevent instantiation.
    }

}
