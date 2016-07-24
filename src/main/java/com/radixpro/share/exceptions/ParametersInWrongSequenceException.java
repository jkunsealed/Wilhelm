/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.exceptions;

import com.sun.istack.internal.NotNull;

public class ParametersInWrongSequenceException extends RuntimeException {

    private String message;

    public ParametersInWrongSequenceException(@NotNull String value1, @NotNull String value2) {
        message = "Parameters " + value1 + " and " + value2 + " in wrong sequence.";
    }

    @NotNull
    public String getMessage() {
        return message;
    }
}
