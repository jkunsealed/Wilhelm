/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.exceptions;

import javax.validation.constraints.NotNull;

/**
 * Exception to handle errors during analysis.
 */
public class AnalysisException extends RuntimeException {

    private final String message;

    public AnalysisException(@NotNull String description) {
        message = "Analysis error: " + description;
    }

    @NotNull
    public String getMessage() {
        return message;
    }

}
