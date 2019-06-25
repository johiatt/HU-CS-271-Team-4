// Java Calculator

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		double answer = 0; // Storing the eventual answer as a double, change as needed.
		boolean previous = false; //True, if we use previous result as a first argument of expressions

		Scanner scanner = new Scanner(System.in); // New scanner for user input

		if (args.length == 0) {
			String input;
			do {

				System.out.print("Enter A Mathematical Expression (\"C\" to erase answer. supported \"+\",\"-\",\"*\",\"/\"): "); // Prompt user for input
				input = scanner.next();
				String operation = input;//TODO: Add mathematical expression input check

				double argument1, argument2;


				switch (operation) {
					case "+": {
						if (previous) {
							argument1 = answer;
						} else {
							System.out.print("Enter First Argument: ");
							input = scanner.next();
							argument1 = Double.parseDouble(input); // TODO: replace with input check for arguments
						}
						System.out.print("Enter Second Argument: ");
						input = scanner.next();
						argument2 = Double.parseDouble(input); // TODO: replace with input check for arguments
						answer = add(argument1, argument2);
						System.out.println("Answer: " + answer); // Print out answer
						previous = true;
						break;
					}
					case "C":{}
					case "c":{
						previous = false;
						break;
					}
					default: {
						System.out.println(input + " is unsupported operation");
					}
				}

			} while (!input.equals(""));

			scanner.close(); // Closing scanner. Move around as necessary.

		} else {
			System.out.println("Expression evaluation is not supported!");
			System.exit(0); // Delete this string if expressions are supported
			if (args.length == 1) {
				String expression = args[0];
				//TODO: Evaluation of expressions
			} else {
				//TODO: Create function that prints "how to use"
			}
		}
		

	}
	private static int multiple (int a, int b){
		return a*b;
	}
	private static double divide (int a, int b){
		return (a/b);
	}
	private static double subtract (double a, double b) {
		return (a-b);
	}

    /**
     * Adds two double numbers
     *
     * @param a First parametr to add
     * @param b Second parametr to add
     * @return result of a+b
     */
	private static double add (double a, double b) {
		return a+b;
	}
	
	/**
	* Squares a number
	* @param a The number to be squared.
	* @return results of the square
	*/
	private static double squaure ( double a ) {
		return Math.pow(a,2);	
	}

}
