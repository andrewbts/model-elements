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

public class EnKFParams extends	edu.berkeley.path.model_elements_base.EnKFParams {
	
	public EnKFParams() {
		super();
	}

	public static EnKFParams createWithMMDefaults() {
		
		EnKFParams params = new EnKFParams();

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
