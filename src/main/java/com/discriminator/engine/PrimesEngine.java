package com.discriminator.engine;

import java.util.ArrayList;
import java.util.List;

public class PrimesEngine {

	/**
	 * Gets a list of primes from a mixed numbers list.
	 * @param numbers Integer List or null
	 * @return Integer List
	 */
	public List<Integer> getPrimesList(List<Integer> numbers) {
		List<Integer> primesList = new ArrayList<Integer>();
		
		if (numbers != null)
			 {
			for (Integer i : numbers) {
				if (isPrime(i))
					primesList.add(i);
			}			
		}
		
		return primesList;
	}

	/**
	 * Is Prime number?
	 * A prime number (or a prime) is a natural number greater than 1 
	 * that has no positive divisors other than 1 and itself. 
	 * @param i Integer number
	 * @return boolean
	 */
	public boolean isPrime(Integer i) {

		int divisor = 2;
		boolean flag = true; 

		while (flag && divisor < i) 
		{
			if (i % divisor == 0) 									
				flag = false;
			else
				divisor++;
		}

		return flag;
	}

}
