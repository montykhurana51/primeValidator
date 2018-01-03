package com.efecte.prime.utilities;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * The PrimeCheck is a utility class which has primarily below methods
 * isPrime method checks if the input is prime number or not.
 * readUserInputsAndCheckPrime method which will read user inputs via scanner api and validates them
 * 
 * @author Monty Khurana
 * @version 1.0
 * @since 2018-01-01
 * 
 */
public class PrimeCheck {
	
	/**
	 * This method is the used for reading user inputs with scanner api and validates inputs
	 * This method reads user input continuously and terminates only when user inputs 'exit'
	 * This method will internally call isPrime for valid integers only
	 *
	 * @param scanner This is the first parameter to readUserInputsAndCheckPrime which will scan the user provided inputs
	 */
	public static void readUserInputsAndCheckPrime(Scanner scan)
	{
		String inputString;
		int inputNumber;
		while (!scan.hasNext("exit")) {
			System.out.println("Input Number ");
			if (scan.hasNextInt()) {
				inputNumber = scan.nextInt();
				System.out.println(inputNumber);
				if(inputNumber>=0){
					isPrime(inputNumber);
				} else {
					System.out.println(inputNumber + " is negative. please enter a positive integer");
				}
			} else if(scan.hasNextBigInteger()){
				BigInteger input = scan.nextBigInteger();
				System.out.println(input);	
				System.out.println("Outside Integer Range! ");
			}
			else {
				inputString = scan.next();
				System.out.println(inputString);
				System.out.println("Please enter a valid positive integer! ");
			}
		}
	}
	
	
	
	/**
	 * This method is the actual implementation which checks if a number is prime or not.
	 *
	 * @param inputNumber This is the first parameter to isPrime which is the user provided input
	 * @return boolean true/false This is the output param of type boolean 
	 * which returns false if number is not prime or true otherwise
	 */
	public static boolean isPrime(int inputNumber) throws NumberFormatException {
		if (inputNumber == 1 || inputNumber == 0) {
			System.out.println(inputNumber + " is not prime");			
		} else if (inputNumber > 1) {
			// we will check till the square root of the input number.
			// because if we are not able to get a number before the square root
			// then there will be no number which can divide the inputNumber
			// after the square root as well.
			int maxLookup = (int) Math.sqrt(inputNumber);
			for (int iterator = 2; iterator <= maxLookup; iterator++) {
				if (inputNumber % iterator == 0) {
					System.out.println(inputNumber + " is not prime. It is divisible by " + iterator);
					return false;
				}
			}
			System.out.println(inputNumber + " is prime");
			return true;
		} 
		return false;
	}
}
