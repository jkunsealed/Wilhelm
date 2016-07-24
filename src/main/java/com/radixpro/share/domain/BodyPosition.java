/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

/**
 * Defines position in three dimensions for a body or a fictitious point. Also defines the speed of each dimensionm.
 * The actual values depend on the chosen CalculationFlags.
 */
public class BodyPosition {

    private BodyNames bodyName;
    private double mainValue;
    private double deviation;
    private double distance;
    private double speedMainValue;
    private double speedDeviation;
    private double speedDistance;

    /**
     * Getter for the name of the calculated body.
     * @return the name of the body.
     */
    public BodyNames getBodyName() {
        return bodyName;
    }

    /**
     * Setter for the name of the calculated body.
     * @param bodyName hte bodyName to use.
     */
    public void setBodyName(BodyNames bodyName) {
        this.bodyName = bodyName;
    }

    /**
     * Getter for the mainvalue, this could be longitude, right ascension, azimuth.
     * @return the calculated value
     */
    public double getMainValue() {
        return mainValue;
    }

    /**
     * Setter for the mainvalue, this could be longitude, right ascension, azimuth.
     * @param mainValue the value to set.
     */
    public void setMainValue(double mainValue) {
        this.mainValue = mainValue;
    }

    /**
     * Getter for the deviation, this could be latitude, declination or altitude.
     * @return the calculated value.
     */
    public double getDeviation() {
        return deviation;
    }

    /**
     * Setter for the deviation, this could be latitude, declination or altitude.
     * @param deviation the value to set.
     */
    public void setDeviation(double deviation) {
        this.deviation = deviation;
    }

    /**
     * Setter for the distance, the radius vector, measured in AU.
     * @return the calculated value.
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Getter for the distance, the radius vector, measured in AU.
     * @param distance hte value to set.
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Getter for speed, the daily difference for the mainValue.
     * @return calculated value.
     */
    public double getSpeedMainValue() {
        return speedMainValue;
    }

    /**
     * Setter for speed, the daily difference for the mainValue.
     * @param speedMainValue the value to set.
     */
    public void setSpeedMainValue(double speedMainValue) {
        this.speedMainValue = speedMainValue;
    }

    /**
     * Getter for the speed, the daily difference of the deviation.
     * @return calculated value.
     */
    public double getSpeedDeviation() {
        return speedDeviation;
    }

    /**
     * Setter for the speed, the daily difference of the deviation.
     * @param speedDeviation the value to set.
     */
    public void setSpeedDeviation(double speedDeviation) {
        this.speedDeviation = speedDeviation;
    }

    /**
     * Getter for the speed, the daily difference of the distance.
     * @return the calculated value.
     */
    public double getSpeedDistance() {
        return speedDistance;
    }

    /**
     * Setter for the speed, the daily difference of the distance.
     * @param speedDistance the value to set.
     */
    public void setSpeedDistance(double speedDistance) {
        this.speedDistance = speedDistance;
    }
}
