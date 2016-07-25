/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

import com.sun.istack.internal.NotNull;

/**
 * Response for the calculation of a BodyPosition.
 */
public class CalculationResponseBody implements CalculationResponse {

    private String status;
    private BodyPosition position;

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(@NotNull String status) {
        this.status = status;
    }

    /**
     * Getter for Position for a specific body.
     * @return Instance of Position with all the calculated elements.
     */
    public BodyPosition getPosition() {
        return position;
    }

    /**
     * Setter for Position for a specific body.
     * @param position calculated Position.
     */
    public void setPosition(BodyPosition position) {
        this.position = position;
    }
}
