package Unit6;
import java.util.Scanner;

public class VrisagU6E2R {

	//creates the array
	private int[] array;

	//method to get the input from the user
	public void input() {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array: ");
		int size = input.nextInt();

		array = new int[size];

		// Loop to input array elements
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1) + ": ");
			array[i] = input.nextInt();
		}
	}

	//method to compute sum and difference
	public void sumAndDiff() {

		//creates the variables 
		int sum = 0;
		int smallest = Integer.MAX_VALUE;

		//loop to compute sum and find the smallest value
		for (int value : array) {
			sum += value;

			if (value < smallest) {
				smallest = value;
			}

			//print current sum and smallest value
			print(sum, smallest);
		}

		//calculate and print the difference
		int difference = sum - smallest;
		System.out.println("\nDifference: " + difference);

		//print final sum and smallest value after the loop completes
		printFinal(sum, smallest);
	}

	//method to print current sum and smallest value
	private void print(int sum, int smallest) {
		System.out.println("Current Sum: " + sum + ", Smallest Value: " + smallest);
	}

	//method to print final sum and smallest value
	private void printFinal(int sum, int smallest) {
		System.out.println("\nFinal Sum: " + sum);
		System.out.println("Final Smallest Value: " + smallest);
	}

	//method to compute alternating sum
	public int alternating() {
		int alternatingSum = 0;

		//loop to compute alternating sum
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				alternatingSum += array[i];
			} 
			else {
				alternatingSum -= array[i];
			}
		}

		return alternatingSum;
	}

}//End class
