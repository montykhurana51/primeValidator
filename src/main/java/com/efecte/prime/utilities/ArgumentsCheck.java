package com.efecte.prime.utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * The ArgumentsCheck is a utility class which checks if user has provided additional argument (-f) or not.
 * If provided, the argument will append the results to a file instead of standard console logs
 * The file location will be provided by user only
 * for example java -jar primeValidator-1.0.jar -f C:\\primeNumber.txt
 * 
 * 
 * @author  Monty Khurana
 * @version 1.0
 * @since   2018-01-01
 * 
 */
public class ArgumentsCheck {	
   /**
	* This method is used to check if user has provided additional argument (-f) or not while running the program.
	* If provided, the argument will append the results to a file instead of standard console logs
	*
	* @param args String array which will have the user provided argument
	* @return boolean which will return false only when user has provided wrong argument (i.e other than -f)
	* @throws FileNotFoundException 
	*/
	public static boolean hasFileArgument(String[] args) throws FileNotFoundException
	{
		String logFile = null;
		int i = 0;
		while (i < args.length) {			
			if (args[i].equals("-f")) {
				logFile = args[++i];
			} else {
				System.out.println("USAGE: <-f file path>");
				return false;
			}
			i++;
		}		
		if(logFile!=null) System.setOut(new PrintStream((new FileOutputStream(logFile)), true));				
		else System.setOut(System.out);
		return true;
	}
}
