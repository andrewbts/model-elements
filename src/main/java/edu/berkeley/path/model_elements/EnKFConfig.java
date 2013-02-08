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

import java.util.ArrayList;

public class EnKFConfig extends	edu.berkeley.path.model_elements_base.EnKFConfig {
	
	public EnKFConfig() {
		super();
	}
	
	/**
	 * @return EnKF type (), an element of the EnKFType enum
	 */
	public EnKFType getEnKFTypeEnum() {
		String type = super.getEnkfType().toString();

		if (type.equals("SIMPLEAVERAGE")) return EnKFType.SIMPLEAVERAGE;
		if (type.equals("GLOBALJAMA")) return EnKFType.GLOBALJAMA;
		if (type.equals("GLOBALBLAS")) return EnKFType.GLOBALBLAS;
		if (type.equals("LOCALJAMA")) return EnKFType.LOCALJAMA;
		if (type.equals("LOCALBLAS")) return EnKFType.LOCALBLAS;
		
		throw new UnsupportedOperationException("Unknown EnKF type string '" + type + "' encountered.");
	}
	
	public void setEnkfTypeEnum(EnKFType type) {
		String typeString = null;
		switch (type) {
		case SIMPLEAVERAGE:
			typeString = "SIMPLEAVERAGE";
			break;
		case GLOBALJAMA:
			typeString = "GLOBALJAMA";
			break;
		case GLOBALBLAS:
			typeString = "GLOBALBLAS";
			break;
		case LOCALJAMA:
			typeString = "LOCALJAMA";
			break;
		case LOCALBLAS:
			typeString = "LOCALBLAS";
			break;
		default:
			throw new IllegalArgumentException("Unknown EnKF Type " + type + ".");			
		}
		super.setEnkfType(typeString);
	}

	public static EnKFConfig createWithMMDefaults() {
		
		EnKFConfig params = new EnKFConfig();

		// Assign Default Mobile Millenium values for all attributes
		params.setPemsNoiseMean(0.0);
		params.setPemsNoiseStdev(4.0);
		params.setNavteqNoiseMean(0.0);
		params.setNavteqNoiseStdev(4.0);
		params.setTelenavNoiseMean(0.0);
		params.setTelenavNoiseStdev(4.0);
		params.setPemsBlackList(new ArrayList<Integer>());
		params.setTelenavPercentage(100.0);
		params.setNavteqPercentage(100.0);
		params.setUseLocalization(true);
		params.setLocalizationDistance(100.0);
		
		return params;

	}
}
