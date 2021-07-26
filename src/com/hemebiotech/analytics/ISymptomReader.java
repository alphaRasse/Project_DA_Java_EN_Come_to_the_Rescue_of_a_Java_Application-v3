package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomReader {
	
	
	/**
	 *  @return
	 * a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	public Map<Integer, String> GetSymptoms0() ;
	
	
	/**
	 * @return this method returns the list by number of occurrences per symptom
	 */
	public void valueOfSymptoms() ;
	
	
	/**
	 * this method allows us to create the result.out file 
	 * and write the symptoms and their occurrences in alphabetical order.
	 */
	public void fileResultOut();

}
