# primeValidator

Import and Execution Instructions for primeValidator Project
General Information
1) The Project primeValidator is a Java maven project which is used to check if a given user input is a prime number or not
2) Maven is used as a build tool for this project. 
3) The project can be imported within Eclipse using import as Maven project option.
 
4) PrimeNumber.java is the main java file where the execution will start
5) ArgumentsCheck.java is a utility class which will check if user has provided additional argument (for appending results into a file instead of console logs) or not
6) PrimeCheck.java is also a utility class which has methods for reading continuous user inputs and for checking if an input is prime or not
7) PrimeNumberTest.java is the file where unit test cases has been implemented. 

Building the Project
1) Right click on project's pom.xml and go to Run As option. Then chose maven clean option to clear the existing target directory.
2) Right click again on project's pom.xml and go to Run As option. Then chose maven build option and mention "clean package" in Goals and click Run. Run option will compile the project, run the test cases and build the package
3) After step 2, go to project root, right click and click Refresh Option. Now target directory will be visible inside the project.
4) Inside target directory, there are primeValidator-1.0. jar

Running the Test cases
1) Inside Eclipse IDE, go to project root and traverse through src -> test -> java -> com -> efecte -> prime -> validator -> PrimeNumberTest.java
2) Right click on PrimeNumberTest.java and go to Run As option. Now choose Junit test. It will run the junit test cases and show if its success or failure.

Running the Project
PrimeValidator project can be run in two ways.
1) Inside Eclipse IDE, go to project root and traverse through src -> main -> java com -> efecte -> prime -> validator -> PrimeNumber.java. Right click on PrimeNumber.java and go to Run As option. Now choose Java Application. It will run the main method which will ask for user's input.

2) If user wants to put additional argument via Eclipse then traverse through src -> main -> java com -> efecte -> prime -> validator -> PrimeNumber.java. Right click on PrimeNumber.java and go to Run As option. Now choose Run Configurations. In Left side, click on the configuration under Java application and then in right side, under Arguments section mention –f filename.txt in Program arguments. Click Apply and Run. 

3) We can run the project from command line as well. Go to Project directory in your file system, traverse to the target directory (or if you already pasted primeValidator-1.0.jar file in your other directory in file system then go there) and please run below command for running the project:-

	java -jar primeValidator-1.0.jar

   Use below command with file argument

	java -jar primeValidator-1.0.jar –f yourTextFileWithLocation.txt
