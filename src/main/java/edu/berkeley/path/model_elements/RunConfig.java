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
		
	/**
	 * @param type FD type (Greenshields, etc), an element of the FDTypeEnum enumeration
	 */
	public void setFDTypeEnum(FDTypeEnum type) {
		String typeString = null;
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
	public EnKFConfig getEnkfConfig() {
		return (EnKFConfig)super.getEnkfConfig();
	}
					
	public RunMode getRunModeEnum() {
		String type = super.getRunMode().toString();

		if (type.equals("HISTORICAL")) return RunMode.HISTORICAL;
		if (type.equals("LIVE")) return RunMode.LIVE;
		if (type.equals("HISTORICAL_LIVE")) return RunMode.HISTORICAL_LIVE;
		
		throw new UnsupportedOperationException("Unknown Run Mode type string '" + type + "' encountered.");
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
		String typeString = null;
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
						
	public void setRunModeEnum(RunMode type) {
		String typeString = null;
		switch (type) {
		case HISTORICAL:
			typeString = "HISTORICAL";
			break;
		case LIVE:
			typeString = "LIVE";
			break;
		case HISTORICAL_LIVE:
			typeString = "HISTORICAL_LIVE";
			break;
		default:
			throw new IllegalArgumentException("Unknown RunMode " + type + ".");			
		}
		super.setRunMode(typeString);
	}	
		
	public void setWorkflowEnum(Workflow type) {
		String typeString = null;
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
	
}
