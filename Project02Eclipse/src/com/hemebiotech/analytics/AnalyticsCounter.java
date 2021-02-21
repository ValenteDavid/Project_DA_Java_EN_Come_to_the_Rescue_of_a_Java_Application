package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AnalyticsCounter {
	
	/**
	 * Counts the number of occurrences symptoms
	 * 
	 * @param listDuplicate
	 * @return map of symptom name and symptom count
	 */
	public Map<String,Integer> map(List<String> listDuplicate) {
		Map<String,Integer> mapCounter = new HashMap<>();
		Set<String> symptomsNoDuplicate = new HashSet<>(listDuplicate);
		for (String symptom : symptomsNoDuplicate) {
			mapCounter.put(symptom, Collections.frequency(listDuplicate, symptom));
		}
		return mapCounter;
	}
}
