package com.discriminator.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class PrimesEngineTest extends TestCase {

	public void testGetPrimesList() {
		PrimesEngine primesEngine = new PrimesEngine();
		Integer[] numbersArray = { 2, 3, 4, 5, 6, 7, 11 };
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(numbersArray));
		List<Integer> result = primesEngine.getPrimesList(l);
		assertEquals(result.size(), 5);
	}

	public void testIsPrime() {
		PrimesEngine primesEngine = new PrimesEngine();
		assertTrue(primesEngine.isPrime(7));
		assertFalse(primesEngine.isPrime(10));
	}

}
