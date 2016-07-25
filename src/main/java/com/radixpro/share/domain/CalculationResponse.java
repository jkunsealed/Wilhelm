/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

import com.sun.istack.internal.NotNull;

public interface CalculationResponse {

    @NotNull
    /**
     * Getter for text with status.
     */
    String getStatus();

    /**
     * Setter for text with status.
     * @param status text to set for status.
     */
    void setStatus(@NotNull String status);

}
