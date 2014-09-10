package com.discriminator.engine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileConverter implements ITextFileConverter{

	
	/**
	 * Converts a text file to strings list where each list item is a file line.
	 * 
	 * @param fileName
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public List<String> toList(String fileName) throws FileNotFoundException, IOException{
		
		List<String> wordsList = new ArrayList<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	        	wordsList.add(line.trim());
	            sb.append(line);
	            sb.append(System.lineSeparator());
	            line = br.readLine();	            
	        }
	    }
		
		return wordsList;
		
	}
	

	
	
}
