package com.efecte.prime.validator;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.Test;
import com.efecte.prime.utilities.PrimeCheck;


/**
 * PrimeNumberTest class where Unit test has been implemented.
 */
public class PrimeNumberTest {

	@After
	public void afterEachTest() {
		System.out.println("Test Executed succesfully");
	}

	@Test
	public void primeTestShouldReturnTrue() {
		System.out.println("Running Test :-- primeTestShouldReturnTrue");
		int inputNumber = 7;
		boolean isTrue = PrimeCheck.isPrime(inputNumber);
		assertEquals("The Prime number test for 7 should be true", true, isTrue);
	}

	@Test
	public void primeTestShouldReturnFalse() {
		System.out.println("Running Test :-- primeTestShouldReturnFalse");
		int inputNumber = 9;		
		boolean isFalse = PrimeCheck.isPrime(inputNumber);
		assertEquals("The Prime number test for 9 should be true", false, isFalse);
	}
	
	@Test(expected = NumberFormatException.class)
	public void primeTestShouldThrowException() throws NumberFormatException {
		System.out.println("Running Test :-- primeTestShouldThrowException");
		String input= "TestingFailCase";
		int inputNumber = Integer.parseInt(input);
		PrimeCheck.isPrime(inputNumber);		
	}
	
	@Test(timeout=1000)
	public void shouldReadUserInputsAndCheckPrime() {
		System.out.println("Running Test :-- shouldReadUserInputsAndCheckPrime");
		final ByteArrayInputStream stream = new ByteArrayInputStream(String.format("89 test null 45 -12 0.3 137/23 2147483648 exit").getBytes());
		Scanner scanner = new Scanner(stream);
	    PrimeCheck.readUserInputsAndCheckPrime(scanner);
	}
	
}
