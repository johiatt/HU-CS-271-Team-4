// Java Calculator

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double answer; // Storing the eventual answer as a double, change as needed.
		
		Scanner scanner = new Scanner(System.in); // New scanner for user input
		
		System.out.print("Enter A Mathematical Expression: "); // Prompt user for input
		
		// TO DO: Code to validate/parse/store user input
		
		scanner.close(); // Closing scanner. Move around as necessary.
		
		// TO DO: Code to perform math functions w/ user input
		
		System.out.print("Answer: " + answer); // Print out answer
		

	}
	private static int multiple (int a, int b){
		return a*b;
	}

}
