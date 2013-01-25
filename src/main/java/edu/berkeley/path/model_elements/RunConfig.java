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

public class RunConfig extends edu.berkeley.path.model_elements_base.RunConfig {
	public Long getLongId() {
		return Long.parseLong(getId().toString());
	}

	public void setId(Long id) {
		setId(id.toString());
	}
	
	/**
	 * @return FD type (Greenshields, etc), an element of the FDTypeEnum enumeration
	 */
	public FDTypeEnum getFDTypeEnum() {
		String type = super.getFdType().toString();
		
		if (type.equals("Greenshields")) return FDTypeEnum.GREENSHIELDS;
		if (type.equals("DaganzoNewell")) return FDTypeEnum.DAGANZO_NEWELL;
		if (type.equals("Smulders")) return FDTypeEnum.SMULDERS;
		
		throw new UnsupportedOperationException("Unknown FD type string '" + type + "' encountered.");
	}
	
	@Override
	@Deprecated
	public CharSequence getFdType() {
		throw new UnsupportedOperationException("Use method getFDTypeEnum instead.");
	}
	
	/**
	 * @param type FD type (Greenshields, etc), an element of the FDTypeEnum enumeration
	 */
	public void setFDTypeEnum(FDTypeEnum type) {
		CharSequence typeString = null;
		switch (type) {
		case GREENSHIELDS:
			typeString = "Greenshields";
			break;
		case DAGANZO_NEWELL:
			typeString = "DaganzoNewell";
			break;
		case SMULDERS:
			typeString = "Smulders";
			break;
		default:
			throw new IllegalArgumentException("Unknown FD type " + type + ".");			
		}
		super.setFdType(typeString);
	}
	
	@Override
	@Deprecated
	public void setFdType(CharSequence value) {
		throw new UnsupportedOperationException("Use method setFDTypeEnum instead.");
	}

	/**
	 * @return CTM type (rho-CTM, v-CTM, etc), an element of the CTMType enum
	 */
	public CTMType getCTMTypeEnum() {
		String type = super.getCtmType().toString();
		
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
	
	@Override
	public EnKFParams getEnkfParams() {
		return (EnKFParams)super.getEnkfParams();
	}
	
	@Override
	@Deprecated
	public CharSequence getEnkfType() {
		throw new UnsupportedOperationException("Use method getEnKFTypeEnum instead.");
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
	
	@Override
	@Deprecated
	public CharSequence getFeed() {
		throw new UnsupportedOperationException("Use method getFeedEnum instead.");
	}
	
	public Feed getFeedEnum() {
		String type = super.getFeed().toString();

		if (type.equals("PEMS")) return Feed.PEMS;
		if (type.equals("PROBEA")) return Feed.PROBEA;
		if (type.equals("PROBEB")) return Feed.PROBEB;
		
		throw new UnsupportedOperationException("Unknown Run Mode type string '" + type + "' encountered.");
	}
	
	@Override
	@Deprecated
	public CharSequence getRunMode() {
		throw new UnsupportedOperationException("Use method getRunModeTypeEnum instead.");
	}
	
	public RunMode getRunModeEnum() {
		String type = super.getRunMode().toString();

		if (type.equals("HISTORICAL")) return RunMode.HISTORICAL;
		if (type.equals("LIVE")) return RunMode.LIVE;
		
		throw new UnsupportedOperationException("Unknown Run Mode type string '" + type + "' encountered.");
	}
	
	@Override
	@Deprecated
	public CharSequence getWorkflow() {
		throw new UnsupportedOperationException("Use method getWorkflowEnum instead.");
	}
	
	public Workflow getWorkflowEnum() {
		String type = super.getWorkflow().toString();

		if (type.equals("ESTIMATION")) return Workflow.ESTIMATION;
		if (type.equals("FORECAST")) return Workflow.FORECAST;
		
		throw new UnsupportedOperationException("Unknown Workflow string '" + type + "' encountered.");
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

	@Override
	@Deprecated
	public void setEnkfType(CharSequence value) {
		throw new UnsupportedOperationException("Use method setEnKFTypeEnum instead.");
	}
	
	public void setEnkfTypeEnum(EnKFType type) {
		CharSequence typeString = null;
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
	
	@Override
	@Deprecated
	public void setFeed(CharSequence value) {
		throw new UnsupportedOperationException("Use method setFeedEnum instead.");
	}
	
	public void setFeedEnum(Feed type) {
		CharSequence typeString = null;
		switch (type) {
		case PEMS:
			typeString = "PEMS";
			break;
		case PROBEA:
			typeString = "PROBEA";
			break;
		case PROBEB:
			typeString = "PROBEB";
			break;
		default:
			throw new IllegalArgumentException("Unknown Feed " + type + ".");			
		}
		super.setFeed(typeString);
	}
	
	@Override
	@Deprecated
	public void setRunMode(CharSequence value) {
		throw new UnsupportedOperationException("Use method setRunModeEnum instead.");
	}
	
	public void setRunModeEnum(RunMode type) {
		CharSequence typeString = null;
		switch (type) {
		case HISTORICAL:
			typeString = "HISTORICAL";
			break;
		case LIVE:
			typeString = "LIVE";
			break;
		default:
			throw new IllegalArgumentException("Unknown RunMode " + type + ".");			
		}
		super.setRunMode(typeString);
	}
	
	
	@Override
	@Deprecated
	public void setWorkflow(CharSequence value) {
		throw new UnsupportedOperationException("Use method setWorkflowEnum instead.");
	}
	
	public void setWorkflowEnum(Workflow type) {
		CharSequence typeString = null;
		switch (type) {
		case ESTIMATION:
			typeString = "ESTIMATION";
			break;
		case FORECAST:
			typeString = "FORECAST";
			break;
		default:
			throw new IllegalArgumentException("Unknown Workflow " + type + ".");			
		}
		super.setWorkflow(typeString);
	}

	@Override
	public edu.berkeley.path.model_elements.DateTime getTimeBegin() {
		return (edu.berkeley.path.model_elements.DateTime) (super.getTimeBegin());
	}

	@Override
	public FreewayCTMEnsembleState getInitialEnsembleState() {
		return (FreewayCTMEnsembleState) super.getInitialEnsembleState();
	}

	@Override
	public FreewayCTMState getInitialState() {
		return (FreewayCTMState) super.getInitialState();
	}

	@Override
	public SensorSet getSensorSet() {
		return (SensorSet)super.getSensorSet();
	}
	
}
