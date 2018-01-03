package com.efecte.prime.validator;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.efecte.prime.utilities.ArgumentsCheck;
import com.efecte.prime.utilities.PrimeCheck;

/**
 * The PrimeNumber program reads input from user and prints if the input is
 * prime number or not. The Program reads user input continuously and terminates
 * only when user inputs 'exit'. The Program also provides optional feature of
 * providing additional argument (-f) which will append the results to a file
 * instead of standard console logs. The file location will be provided by user
 * for example java -jar primeValidator-1.0.jar -f C:\\primeNumber.txt
 * 
 * 
 * @author Monty Khurana
 * @version 1.0
 * @since 2018-01-01
 * 
 */
public class PrimeNumber {
	/**
	 * This is the main method which makes use of following methods for checking if a number is prime or not
	 * 
	 * hasFileArgument method from ArgumentsCheck class which checks if user has specifies file argument or not
	 * readUserInputsAndCheckPrime method to from PrimeCheck class which is used to read the user inputs via scanner api,
	 * which will then internally calls isPrime method to check if a number is prime or not
	 * 
	 * @param args used for taking optional argument for file from user.
	 * @exception FileNotFoundException,NumberFormatException and Exception.
	 */
	public static void main(String[] args) {			
		Scanner scan = new Scanner(System.in);
		boolean isArgOK;
		try {
			isArgOK = ArgumentsCheck.hasFileArgument(args);
			if (isArgOK) {
				System.out.println("Enter any positive Integer to start with or enter 'exit' for terminating the program");	
				PrimeCheck.readUserInputsAndCheckPrime(scan);
			}
		} catch (FileNotFoundException fileException) {
			fileException.printStackTrace();
		} catch (NumberFormatException numberFormatException) {
			numberFormatException.printStackTrace();
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			scan.close();
		}
	}
}
