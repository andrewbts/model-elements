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

public class FreewayContextConfig extends edu.berkeley.path.model_elements_base.FreewayContextConfig {
	public Long getLongId() {
		return Long.parseLong(getId().toString());
	}

	public void setId(Long id) {
		setId(id.toString());
	}

	/**
	 * @return CTM type (rho-CTM, v-CTM, etc), an element of the CTMType enum
	 */
	public CTMType getCTMTypeEnum() {
		CharSequence type = super.getCtmType();
		
		if (type.equals("Density")) return CTMType.DENSITY;
		if (type.equals("Velocity")) return CTMType.VELOCITY;
		if (type.equals("DensityVelocityFusion")) return CTMType.DENSITY_VELOCITY_FUSION;
		if (type.equals("VelocityDensityFusion")) return CTMType.VELOCITY_DENSITY_FUSION;
		
		throw new UnsupportedOperationException("Unknown CTM type string '" + type + "' encountered.");
	}
	
	@Override
	@Deprecated
	public CharSequence getCtmType() {
		throw new UnsupportedOperationException("Use method getCTMTypeEnum instead.");
	}
	
	/**
	 * @param type CTM type (rho-CTM, v-CTM, etc), an element of the CTMType enum
	 */
	public void setCTMTypeEnum(CTMType type) {
		CharSequence typeString = null;
		switch (type) {
		case DENSITY:
			typeString = "Density";
			break;
		case VELOCITY:
			typeString = "Velocity";
			break;
		case DENSITY_VELOCITY_FUSION:
			typeString = "DensityVelocityFusion";
			break;
		case VELOCITY_DENSITY_FUSION:
			typeString = "VelocityDensityFusion";
			break;
		default:
			throw new IllegalArgumentException("Unknown CTM type " + type + ".");			
		}
		super.setCtmType(typeString);
	}
	
	@Override
	@Deprecated
	public void setCtmType(CharSequence value) {
		throw new UnsupportedOperationException("Use method setCTMTypeEnum instead.");
	}

}
