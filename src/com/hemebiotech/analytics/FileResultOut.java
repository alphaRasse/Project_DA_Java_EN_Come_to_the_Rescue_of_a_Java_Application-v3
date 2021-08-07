package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

public class FileResultOut implements IFileResultOut {
	
	Map<String,Integer> result1 = new TreeMap<String,Integer>();
	
	
	/**
	 * The fileResultOut() method allows the program to create and write a file named result.out
	 */
	@Override
	public void fileResultOut() {
		PrintWriter writer;
		try {
			writer = new PrintWriter(new FileWriter("result2.out"));
			
			for(Map.Entry<String, Integer> m : result1.entrySet()) {
				if(m.getKey() != null) {
					String symptom = m.getKey();
					int value = m.getValue();
						writer.println(symptom+" = "+value);
				}
			}
		          writer.close();
		} catch (IOException e) {
		
			System.out.println("a problem occurred when closing PrintWriter");
		}
		
	}

}
