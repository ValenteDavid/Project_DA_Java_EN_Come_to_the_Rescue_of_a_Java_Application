package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will write symptom data to a source
 * 
 */
public interface ISymptomWriter {
	
	/**
	 * Write list of symptom name and symptom count in the filepath
	 * @param map of symptom name and symptom count
	 */
	void write (Map<String,Integer> map);

}
