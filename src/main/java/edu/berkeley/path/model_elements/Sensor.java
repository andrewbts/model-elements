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

public class Sensor extends edu.berkeley.path.model_elements_base.Sensor {
	public Long getLongLinkId() {
		return Long.parseLong(getLinkId().toString());
	}

	public void setLinkId(Long id) {
		setLinkId(id.toString());
	}
	
	public Long getLongMeasurementFeedId() {
		return Long.parseLong(getMeasurementFeedId().toString());
	}
  
	public void setMeasurementFeedId(Long id) {
		setMeasurementFeedId(id.toString());
	}
	
	/**
	 * @return Sensor type (Loop, etc)
	 */
	public SensorTypeEnum getTypeEnum() {
		String type = super.getType().toString();

		if (type.equals("Loop"))
			return SensorTypeEnum.LOOP;
		if (type.equals("Camera"))
			return SensorTypeEnum.CAMERA;
		if (type.equals("Magnetic"))
			return SensorTypeEnum.MAGNETIC;
		if (type.equals("RADAR"))
			return SensorTypeEnum.RADAR;
		if (type.equals("TMC"))
			return SensorTypeEnum.TMC;

		throw new UnsupportedOperationException("Unknown sensor type string '"
				+ type + "' encountered.");
	}

	/**
	 * @param type Sensor type (Loop, etc), an element of the SensorTypeEnum enumeration
	 */
	public void setTypeEnum(SensorTypeEnum type) {
		String typeString = null;
		switch (type) {
		case LOOP:
			typeString = "Loop";
			break;
		case MAGNETIC:
			typeString = "Magnetic";
			break;
		case RADAR:
			typeString = "RADAR";
			break;
		case TMC:
			typeString = "TMC";
			break;
		case CAMERA:
			typeString = "Camera";
			break;
		default:
			throw new IllegalArgumentException("Unknown sensor type " + type + ".");
		}
		super.setType(typeString);
	}
}
