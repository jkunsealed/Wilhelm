/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.exceptions;

import javax.validation.constraints.NotNull;

/**
 * Exception that should be thrown if a parameter is outside of a predefined range.
 */
public class ParameterOutOfRangeException extends RuntimeException {

    private final String message;

    public ParameterOutOfRangeException(@NotNull String value) {
        message = "Parameter " + value + " out of range.";
    }

    @NotNull
    public String getMessage() {
        return message;
    }
}
