// Java Calculator

import java.util.Scanner;
import java.lang.*;

/**
 *
 */
public class Calculator {
	private static double answer = 0; // Storing the eventual answer as a double, change as needed.
	private static boolean previous = false; //True, if we use previous result as a first argument of expressions

	private static Scanner scanner;

	public static void main(String[] args) {
		boolean exit = false;

		scanner = new Scanner(System.in); // New scanner for user input
		if (args.length == 0) {
			String input;
			do {
				try {
					if (!previous) {
						System.out.print("Current result: [0.0]\nEnter First Argument: ");
						input = scanner.next();
						answer = Double.parseDouble(input); // TODO: replace with input check for arguments
						previous = true;
					}

					System.out.printf("Current result: [%f]\nEnter A Mathematical Expression (\"h\" for help): ", answer); // Prompt user for input
					input = scanner.next();
					String operation = input;//TODO: Add mathematical expression input check

					double argument2;

					switch (operation.toLowerCase()) {
						case "+": {
							add();
							break;
						}
						case "-": {
                            System.out.printf("Enter Second Argument: %f - ", answer);
							argument2 = getArgument();
							answer = subtract(answer, argument2);
							previous = true;
							break;
						}
						case "*": {
							multiply();
							break;
						}
						case "/": {
							divide();
							break;
						}
						case "p": {
							power();
							break;
						}
						case "c": {
							previous = false;
							break;
						}
						case "q": {
							exit = true;
							break;
						}
						case "h": {
							System.out.println("\t\"c\" to erase answer. \"q\" to exit.\n" +
									"\tSupported operations:\n " +
															"\t\t\t\t\t\"+\",\"-\",\"*\",\"/\"\n" +
															"\t\t\t\t\t\"p\" - power");
							break;
						}
						default: {
							System.out.println(input + " is unsupported operation");
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("Input is not a number");
				}
			} while (!exit);
			System.out.println("Bye!");
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

	private static double getArgument() throws NumberFormatException{
		return Double.parseDouble(scanner.next());
	}


	/**
	 * Updates the global variable answer to answer * second argument from user
	 * input
	 */
	private static void multiply() {
		System.out.printf("Enter Second Argument: %f * ", answer);
		previous = true;
		answer = answer * getArgument();
	}

	/**
	 * Updates the global variable answer to answer / second argument from user
	 * input
	 */
	private static void divide() {
		System.out.printf("Enter Second Argument: %f / ", answer);
		previous = true;
		double localVariable = getArgument();
		if (localVariable == 0) {
			System.out.println("Math Error");
		} else {
			answer = answer / localVariable;
		}
	}


	/**
	 * Changes global variable answer to answer + second argument from input
	 */
	private static void add () {
		System.out.printf("Enter Second Argument: %f + ", answer);
		previous = true;
		answer = answer + getArgument();
	}

	/**
	* Squares a number
	* @param a The number to be squared.
	* @return results of the square
	*/
	private static double squaure ( double a ) {
		return Math.pow(a,2);
	}

	/**
	* Method to find the factorial of a number
	* @param a Number to perform the factorial of
	* @return result of the factorial, a!
	**/
	private static int factorial ( int a ) {
		if(a == 0)
			return 1;

		return a*factorial(a-1);

	}
	
	/**
	* Method to answer to a certain power.
	**/
	private static void power (){
		System.out.printf("Enter Power Argument: %f ^ ", answer);
		previous = true;
		answer = Math.pow(answer,getArgument());
	}
  /**
  * Method to subtract two numbers
  * @param a Starting number
  * @param b How much first number will be reduced
  * @return result of the subtraction
  *
  **/
  private static double subtract (double a, double b){
    return (a-b);
  }

}
