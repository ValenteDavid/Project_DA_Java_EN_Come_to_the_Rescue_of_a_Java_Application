package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class UtilSymptom {

	public static void main(String args[]) throws Exception {
		ISymptomReader symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> listDuplicate = symptomReader.getSymptoms();
		
		Map<String,Integer> mapSymptoms = new AnalyticsCounter().map(listDuplicate);
		
		ISymptomWriter symptomWritter = new WriteSymptomDataToFile("results.out");
		symptomWritter.write(mapSymptoms);
	}

}
