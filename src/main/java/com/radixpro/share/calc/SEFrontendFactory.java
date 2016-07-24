/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.calc;

import swisseph.SwissEph;

import java.io.File;

public class SEFrontendFactory {

    private final String path = "." + File.pathSeparator + "se";  // TODO --> constants ??
    private SwissEph swissEph;

    public SEFrontend getSEFrontend() {
        swissEph = new SwissEph(path);
        SEFrontend seFrontend = SEFrontend.getSEFrontEnd();
        seFrontend.setSwissEph(swissEph);
        return seFrontend;
    }


}
