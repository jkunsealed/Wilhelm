/* ********************************************************************************************
 Wilhelm - A library to assist astrology programs.
 Copyright (C) 2016 - Jan Kampherbeek, http://radixpro.com/sw.
 This program is free software: the license used is the GPL (GNU General Public License).
 More information: http://radixpro.com/sw/license.
********************************************************************************************* */

package com.radixpro.share.domain;

import com.radixpro.share.domain.Location;
import javax.validation.constraints.NotNull;

public interface CalculationRequest {

    void setLocation(@NotNull Location location);

    @NotNull
    Location getLocation();

    void setJulianDayNr(double julianDayNr);

    double getJulianDayNr();


}
