package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Simple brute force implementation
 *
 */
public class WriteSymptomDataToFile implements ISymptomWriter{

	private String filepath;
		
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom and number of symptom strings in it, one per line
	 */
	public WriteSymptomDataToFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public void write(Map<String,Integer> map) {
		Set<String> symptomsSet = new TreeSet<>(map.keySet());
		try(FileWriter writer = new FileWriter (filepath)){
			StringBuffer chaine = new StringBuffer();
				for (String symptom : symptomsSet) {
					int symptomOccurence = map.get(symptom);
					chaine.append(symptom +"=" + symptomOccurence + "\n");
				}
			writer.write(chaine.toString());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

