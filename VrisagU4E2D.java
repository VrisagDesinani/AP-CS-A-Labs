package Unit4;
import java.util.Scanner;

public class VrisagU4E2D {

	public static void main(String[] args) {

		//declares or initalizes all the variables and arrays
		Scanner input = new Scanner(System.in);
		int evenCount = 0;
		int oddCount = 0;
		int[] values = new int[10];
		int[] cTotal =  new int [10];
		int cumulative = 0;
		int[] adjTotal = new int [10];



		//for the following actions can be run for 10 numbers
		for (int i = 0; i < 10; i++) {

			//gets the numbers from the user and stores them in an array
			System.out.println("Enter number " + (i + 1) + ": ");
			values[i] = input.nextInt();

			//if the value is divisible by two then it is even, else it is odd, then the respective counter is increased
			if (values[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}

			//calculates the cumulative values and stores them into a separate array
			cumulative += values[i];
			cTotal[i] = cumulative;

			//checks for duplicate numbers that are right next to each other
			if (i > 0 && values[i] == values[i - 1] && adjTotal[i - 1] != values[i]) {
				adjTotal[i] = values[i];
			}

		}




		//prints out number of even and odd
		System.out.println("There are " + evenCount + " even numbers and " + oddCount + " odd numbers");

		//prints out the cumulative totals
		System.out.println("The cumulative totals are: ");

		//prints all the values from the cumulative array
		for (int i = 1; i<10; i++) {
			System.out.print(cTotal[i] + " ");
		}

		//prints the string with the adjacent duplicated removed
		System.out.println("\nWith the adjacent duplicates removed: ");

		//for loop to extract all th values 
		for (int i = 0; i < 9; i++) {
			if (adjTotal[i] != 0) {
				System.out.print(adjTotal[i] + " ");
			}
		}




	}//End main

}//End class
