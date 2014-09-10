package com.discriminator.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * DiscriminatorEngine (Main class Facade)
 * 
 * Serve following operations: 
 * 1) That receives as input a list of numbers and returns 
 * a list of prime numbers. 
 * 2) That receives as input a file name (with word list) and 
 * returns a list of palindromes (palíndromos). 
 * 
 * @author Daro
 *
 */
public class DiscriminatorEngine {

	private PalindromeEngine palindromeEngine;
	private PrimesEngine primesEngine;

	/**
	 * Constructor
	 */
	public DiscriminatorEngine() {
		palindromeEngine = new PalindromeEngine();
		primesEngine = new PrimesEngine();
	}

	/**
	 * Constructor to injection
	 * 
	 * @param palindromeEngine
	 */
	public DiscriminatorEngine(PalindromeEngine palindromeEngine) {
		this.palindromeEngine = palindromeEngine;
		primesEngine = new PrimesEngine();
	}

	/**
	 * Gets a list of palindrome words from a list of words located in a file
	 * with name fileName.
	 * 
	 * @param fileName
	 * @return
	 */
	public List<String> getPalindromeList(String fileName) {
		List<String> list = null;
		try {
			list = palindromeEngine.getPalindromeList(fileName);
		} catch (IOException e) {
			e.printStackTrace();
			list = new ArrayList<String>();
		}
		return list;
	}

	/**
	 * Gets a list of primes from a mixed numbers list.
	 * 
	 * @param numbers
	 * @return
	 */
	public List<Integer> getPrimesList(List<Integer> numbers) {

		List<Integer> returnedList = primesEngine.getPrimesList(numbers);

		return returnedList;
	}

}
