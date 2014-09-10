package com.discriminator.engine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class PalindromeEngineTest extends TestCase {

	public void testGetPalindromeListString() {
		String[] stringArray = { "NEUQUEN", "NO_ES_PARA_NADA", "MENEM", "Laura"};
		TextFileConverterMock converter = new TextFileConverterMock(stringArray);
		PalindromeEngine palindromeEngine = new PalindromeEngine(converter);
		
		List<String> resultList = null;
		
		try {
			resultList = palindromeEngine.getPalindromeList("fileName");
			assertEquals(resultList.size(), 2);
			assertEquals(resultList.get(0), "NEUQUEN");
			assertEquals(resultList.get(1), "MENEM");
		} catch (IOException e) {
			fail("Exception... " + e.getMessage());
		}
	}

	public void testGetPalindromeListListOfString() {
		PalindromeEngine palindromeEngine = new PalindromeEngine();
		String[] stringArray = { "NEUQUEN", "NO_ES_PARA_NADA"};
		List<String> words = new ArrayList<String>(Arrays.asList(stringArray));
		List<String> resultList = palindromeEngine.getPalindromeList(words);
		assertEquals(resultList.size(), 1);
		assertEquals(resultList.get(0), "NEUQUEN");
		
	}

	public void testIsPalindrome() {
		PalindromeEngine palindromeEngine = new PalindromeEngine();
		assertTrue(palindromeEngine.isPalindrome("NEUQUEN"));
		assertFalse(palindromeEngine.isPalindrome("NO_ES_PARA_NADA"));		
	}

}
