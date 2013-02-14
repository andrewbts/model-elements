package edu.berkeley.path.model_elements;
/*
 * Enumeration for the supported Workflow types:
 *    ESTIMATION -- CTM + EnKF
 *    FORECAST -- CTM 
 *    ESTIMATION_FORECAST -- CTM + EnKF with forecast CTMs spun off periodically
 */
public enum Workflow {
	FORECAST, ESTIMATION, ESTIMATION_FORECAST
}
