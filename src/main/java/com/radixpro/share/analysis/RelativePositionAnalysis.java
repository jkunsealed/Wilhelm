/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.analysis;

import com.radixpro.share.util.Range;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Analyzes relative positions between one given point and other points.
 */
public class RelativePositionAnalysis {

    private double anchorPoint;
    private double orb;
    List<Double> zones;

    /**
     * Prepares the analysis for a relative position.
     * @param zones List of zones that should be checked, for alles values:
     *              PRE: 0 <= value < 360;
     * @param anchorPoint position of the point to compare with:
     *                    PRE: 0 <= anchorPoint < 360;
     * @param orb the orb to use in both directions, the value is considered to be in degrees and fraction.
     *            PRE: 0 <= orb < 180 divided by the number of zones
     */
    RelativePositionAnalysis(@NotNull List<Double> zones, double anchorPoint, double orb) {
        this.anchorPoint = anchorPoint;
        this.orb = orb;
        this.zones = zones;
    }

    /**
     * Checks if a given point is within one of the zones, also considering the orb.
     * @param movingPoint the point to check.
     *                    PRE: 0 <= movingPoint < 360.
     * @return true if movingPoint is in one of the zones, false otherwise.
     */
    boolean isInZone(double movingPoint) {
        double distance = Range.limitToCircle(movingPoint - anchorPoint);
        for (double zone: zones) {
            if (checkZone(zone, distance)) {
                return true;
            }
        }
        return false;
    }


    private boolean checkZone(double zone, double distance) {
        double startPoint = Range.limitToCircle(zone - orb);
        double endPoint = Range.limitToCircle(zone + orb);
        if (endPoint < startPoint) {
            return ((distance > startPoint) && (distance < (endPoint + 360.0)));
        } else {
            return ((distance > startPoint) && (distance < endPoint));
        }
    }

}
