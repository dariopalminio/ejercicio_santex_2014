package com.discriminator.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class DiscriminatorEngineTest extends TestCase {

	public void testGetPalindromeListUsingFile() {
		// Using file ...		
		DiscriminatorEngine engine = new DiscriminatorEngine();
		List<String> resultList = engine.getPalindromeList("example_file.txt");
		assertEquals(resultList.size(), 4);
		assertEquals(resultList.get(0), "Mon noM");
	}
	
	public void testGetPalindromeList() {
		String[] stringArray = { "NEUQUEN", "NO_ES_PARA_NADA"};
		TextFileConverterMock converter = new TextFileConverterMock(stringArray);	
		PalindromeEngine palindromeEngine = new PalindromeEngine(converter);
		DiscriminatorEngine discriminatorEngine = new DiscriminatorEngine(palindromeEngine);
		List<String> resultList = discriminatorEngine.getPalindromeList("");
		assertEquals(resultList.size(), 1);
		assertEquals(resultList.get(0), "NEUQUEN");
	}

	public void testGetPrimesList() {
		DiscriminatorEngine discriminatorEngine = new DiscriminatorEngine();
		Integer[] numbersArray = { 2, 3, 4, 5, 6, 7, 11 };
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(numbersArray));
		List<Integer> result = discriminatorEngine.getPrimesList(numbers);
		assertEquals(result.size(), 5);
	}

}
