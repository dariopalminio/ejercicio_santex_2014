package com.discriminator.engine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PalindromeEngine {

	private ITextFileConverter textFileConverter;
	
	/**
	 * Default constructor
	 */
	public PalindromeEngine(){
		textFileConverter = new TextFileConverter();
	}
	
	/**
	 * Constructor to injection
	 * @param textFileConverter
	 */
	public PalindromeEngine(ITextFileConverter textFileConverter){
		this.textFileConverter = textFileConverter;
	}
	
	/**
	 * 
	 * @param fileName
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public List<String> getPalindromeList(String fileName) throws FileNotFoundException, IOException{
	
		List<String> wordsList = textFileConverter.toList(fileName);
   
		return getPalindromeList(wordsList);
	}
	
	/**
	 * Get Palindrome List from list of words.
	 * @param words
	 * @return
	 */
	public List<String> getPalindromeList(List<String> words){
		List<String> palindromeList = new ArrayList<String>();
		
		if (words != null)
			 {
			for (String s : words) {
				if (isPalindrome(s))
					palindromeList.add(s);
			}			
		}
		
		return palindromeList;
	}
	
	/**
	 * Is Palindrome?
	 * 
	 * @param s
	 * @return
	 */
	public boolean isPalindrome(String s) {

		char[] word = s.toCharArray();
	    int indexLeft = 0;
	    int indexRigth = word.length - 1;
	    while (indexRigth > indexLeft) {
	        if (word[indexLeft] != word[indexRigth]) {
	            return false;
	        }
	        ++indexLeft;
	        --indexRigth;
	    }
	    
		return true;	
	}
	
}
