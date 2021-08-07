package com.hemebiotech.analytics;





	
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
	import java.util.TreeMap;

	public class ReadSymptomDataFromFile implements ISymptomReader {
		
		private String filepath;
		ArrayList<String> result = new ArrayList<String>();
		
				

		public ReadSymptomDataFromFile(String filepath) {
			
			this.filepath = filepath;
		}

		/**
		 * the Getsymptoms() method allows the program to read external files and save them in an ArrayList
		 */
		@Override
		public List<String> getSymptoms() {
			if (filepath != null) {
				try {
					BufferedReader reader = new BufferedReader (new FileReader(filepath));
					String line = reader.readLine();
					
					while (line != null) {
						result.add(line);
						line = reader.readLine();
					}
					reader.close();
					
				} catch (FileNotFoundException e) {
				
					System.err.printf("the %s file does not exist!",filepath);
				} catch(IOException e) {
					System.out.println("a problem occurred when the tomporary drive was closed");
			}
				//Collections.sort(result);
								}	
			return result;
		}
		
		
		
		


		
		
	}
