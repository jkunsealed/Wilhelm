/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.util;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * Shared constants.
 */
public final class Constants {

    // FIXME correct values for jdnr limits
    public static final double MAX_JULIAN_DAY_NR = 12345678.0;
    public static final double MIN_JULIAN_DAY_NR = -12345678.0;
    public static final double MAX_LONGITUDE = 180.0;
    public static final double MIN_LONGITUDE = -180.0;
    public static final double MAX_LATITUDE = 89.999999;
    public static final double MIN_LATITUDE = -89.999999;
    public static final String STATUS_OK = "OK";
    public static final String STATUS_UNKNOWN_ERROR = "ERROR_UNKNOWN";


    public static final String COLON = ":";
    public static final String DOT = ".";
    public static final String EMPTY_STRING = "";
    public static final LocalDateTime EPOCH_DATE_FOR_QUAKES = LocalDateTime.of(1970, Month.JANUARY, 1, 0, 0, 0);
    public static final String EXTENSION_PROJECT = "proj";
    public static final String EXTENSION_INPUT_DATA = "input_data";
    public static final String DATA_EXTENSION = "json";
    public static final String DATA_CONTROL = "control";
    public static final String DATA_INPUT = "input";
    public static final String DATA_SPLIT = "split";
    public static final int MILLISECONDS_PER_SECOND = 1000;
    public static final int MINUTES_PER_HOUR = 60;
    public static final String RESULT_ERROR = "ERROR";
    public static final String RESULT_OK = "OK";
    public static final int SECONDS_PER_HOUR = 3600;
    public static final String SPACE = " ";
    public static final String UNDERSCORE = "_";
    public static final String UNDEFINED = "undefined";
    public static final int UT_FRACTION_ACCURACY = 1000000;





    private Constants() {
        // prevent instantiation.
    }

}
