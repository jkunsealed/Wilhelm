/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.analysis;

import com.radixpro.share.domain.Signs;

public class SignsEndpoint {

    public Signs findSignForLongitude(double longitude) {
        SignAnalysis signAnalysis = new SignAnalysis();
        return signAnalysis.getSignForLongitude(longitude);
    }

}
