package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class ValueOfSymptoms implements IValueOfSymptoms {
	
	ReadSymptomDataFromFile rsdff = new ReadSymptomDataFromFile("symptom.txt");

	ArrayList<String> result = new ArrayList<String>();
	
	Map<String,Integer> result1 = new TreeMap<String,Integer>();
	
	

	
		
	
	

	/**
	 * valueofsymptoms() allows the program to count the number of times n symptom is repeated
	 */
	@Override
	public void valueOfSymptoms() {
		/**
		 *  enregister les elements du tableau[] dans la treemap avec la methode frequency 
		 */
		
		for(String s : result) {
			result1.put(s, Collections.frequency(result, s));
		
		}
	}
	}
	