/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.analysis;

import java.util.List;

public class RelativePositionEndpoint {

    boolean isInZone(List<Double> zones, double anchorPoint, double orb, double movingPoint) {
        RelativePositionAnalysis analysis = new RelativePositionAnalysis(zones, anchorPoint, orb);
        return analysis.isInZone(movingPoint);
    }

}
