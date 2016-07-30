/*
 *  *********************************************************************************************
 *   Wilhelm - A library to assist astrology programs.
 *   Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 *   This program is free software: the license used is the GPL (GNU General Public License).
 *   More information: http://radixpro.com/sw/license .
 *   ********************************************************************************************
 */

package com.radixpro.share.exceptions;

import javax.validation.constraints.NotNull;

/**
 * Checked exception to be thrown if writing a file fails.
 */
public class PersistencyException extends Exception {

    private final String message;



    public PersistencyException(@NotNull String message) {
        this.message = "Persistency error: " + message;
    }

    @NotNull
    public String getMessage() {
        return message;
    }
}
