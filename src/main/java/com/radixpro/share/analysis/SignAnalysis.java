/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.analysis;

import com.radixpro.share.domain.Signs;
import com.radixpro.share.exceptions.AnalysisException;

public class SignAnalysis {

    private double longitude;

    Signs getSignForLongitude(final double longitude) {
        this.longitude = longitude;
        return findSign();
    }

    private Signs findSign() {
        if (longitude < 0.0 || longitude >= 360.0) {
            throw new AnalysisException("Trying to find sign for incorrect longitude " + longitude);
        }
        int signLength = 30;
        int index = ((int) (longitude / signLength)) + 1;
        return Signs.getSignForIndex(index);
    }

}
