/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

import com.radixpro.share.exceptions.ParameterOutOfRangeException;
import com.radixpro.share.util.Constants;

/**
 * Coordinates of location.
 */
public class Location {

    private double longitude;
    private double latitude;

    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude and checks for validness.
     * @param longitude value for longitude.
     */
    public void setLongitude(double longitude) {
        validateLongitude(longitude);
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude and checks for validness.
     * @param latitude value for latitude.
     */
    public void setLatitude(double latitude) {
        validateLatitude(latitude);
        this.latitude = latitude;
    }

    private void validateLongitude(double longitude) {
        if (longitude < Constants.MIN_LONGITUDE || longitude > Constants.MAX_LONGITUDE) {
            throw new ParameterOutOfRangeException(Double.toString(longitude));
        }
    }

    private void validateLatitude(double latitude) {
        if (latitude < Constants.MIN_LATITUDE || latitude > Constants.MAX_LATITUDE) {
            throw new ParameterOutOfRangeException(Double.toString(latitude));
        }
    }
}
