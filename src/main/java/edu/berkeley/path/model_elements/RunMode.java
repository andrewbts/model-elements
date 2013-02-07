package edu.berkeley.path.model_elements;

/**
 * Run Mode for a simulation:
 * HISTORICAL -- process historical data, requires a start and end time
 * LIVE -- process live data in real time
 * HISTORICAL_LIVE -- process historical data but at live mode speed
 */
public enum RunMode {
	HISTORICAL, LIVE, HISTORICAL_LIVE
}
