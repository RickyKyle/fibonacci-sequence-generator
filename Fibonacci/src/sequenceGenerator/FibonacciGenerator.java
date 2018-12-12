package sequenceGenerator;

import java.util.Scanner;

public class FibonacciGenerator {

	public static void main(String[] args) {

		// Create scanner object for user input.
		Scanner scanner = new Scanner(System.in);
		
		// Declare and initialise variables.
		int totalFiboNums = 0;
		int fibbo1 = 1;
		int fibbo2 = 0;
		int fibbo3 = 0;
		
		// Prompt user for input. 
		System.out.println("How many fibonnaci numbers (3 - 47) would you like "
				+ "to generate?");
		totalFiboNums = scanner.nextInt();
		
		// Validation
		while (totalFiboNums > 47 || totalFiboNums < 1) {
			System.out.println("Please enter a number between 1 and 47:");
			totalFiboNums = scanner.nextInt();
		}

		// Iterate through a FOR loop of length input by user, calculating the 
		// next fibonacci number and outputting the result. 
		for (int loop = 0; loop < totalFiboNums; loop++) {
			System.out.print(fibbo3 + " ");
			fibbo3 = fibbo1 + fibbo2;
			fibbo1 = fibbo2;
			fibbo2 = fibbo3;
		}
		
		scanner.close();

	}

}
