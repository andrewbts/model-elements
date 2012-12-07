/**
 * Copyright (c) 2012 The Regents of the University of California.
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE REGENTS OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */

package edu.berkeley.path.model_elements;


public class EnKFParams extends edu.berkeley.path.model_elements_base.EnKFParams {
	
	public EnKFParams(boolean MMDefaults) {

		if (MMDefaults == true ) {
         // Assign Default Mobile Millennium values for all attributes
        super.setModelNoiseMean( 0.5);
        super.setModelNoiseStdev(2.0);
        super.setPemsNoiseMean(0.0);
        super.setPemsNoiseStdev(4.0);
        super.setNavteqNoiseMean(0.0);
        super.setNavteqNoiseStdev(4.0);
        super.setTelenavNoiseMean(0.0);
        super.setTelenavNoiseStdev(4.0);
        super.setPemsBlackList(null);
        super.setTelenavPercentage(100.0);
        super.setNavteqPercentage(100.0);
        super.setUseLocalization(true);
        super.setLocalizationDistance(100.0);
        super.setConfidenceNoMeasurement(0.0);
        super.setConfidenceDefault(0.025);
        super.setConfidenceHasMeasurement( 0.5);
        // super.setConfidenceMeasurementLifetime(180.0);	
		}
	}
}
