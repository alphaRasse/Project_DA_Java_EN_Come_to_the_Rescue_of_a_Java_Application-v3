package com.hemebiotech.analytics;



public class AnalyticsCounter {
	
	public static void main(String args[])  {
		ReadSymptomDataFromFile rsdff = new ReadSymptomDataFromFile("symptoms.txt");
		ValueOfSymptoms vos = new ValueOfSymptoms();
		FileResultOut fro =new FileResultOut();
		
		rsdff.getSymptoms();
		vos.valueOfSymptoms();
		fro.fileResultOut();
		
		
		}
}