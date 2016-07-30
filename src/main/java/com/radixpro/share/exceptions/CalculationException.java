/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.exceptions;

import javax.validation.constraints.NotNull;

/**
 * Exception to handle calculation errors.
 */
public class CalculationException extends RuntimeException {

    private final String message;

    public CalculationException(@NotNull String description) {
        message = "Calculation error: " + description;
    }

    @NotNull
    public String getMessage() {
        return message;
    }


}
