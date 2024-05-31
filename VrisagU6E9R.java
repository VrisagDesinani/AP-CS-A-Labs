package Unit6;

import java.util.Scanner;

public class VrisagU6E9R {

	//instantiates the scanner and boolean to see if the stalls are occupied or not
	private Scanner input = new Scanner(System.in);
	boolean[] stalls;

	public void stallNum() {

		System.out.println("Enter number of stalls: ");
		int stallNum = input.nextInt();

		// Initialize the array to represent if a stall is taken
		stalls = new boolean[stallNum];

	}

	public void occupyStalls() {

		for (int i = 0; i < stalls.length; i++) {

			//variables to find the longest sequence of unoccupied stalls
			int maxLength = 0;
			int startIndex = -1;

			//for loop check every stall
			for (int j = 0; j < stalls.length; j++) {

				//if the stall is not occupied
				if (!stalls[j]) {
					int currentLength = 0;

					//while loop to find the length of the current unoccupied sequence
					while (j < stalls.length && !stalls[j]) {
						currentLength++;
						j++;
					}

					//if the current sequence is longer than the previous longest sequence then the code performs
					if (currentLength > maxLength) {
						maxLength = currentLength;
						startIndex = j - currentLength; 
					}
				}
			}

			//occupies the middle of the longest sequence of unoccupied stalls
			int middleOfLongestSequence = startIndex + maxLength / 2;
			stalls[middleOfLongestSequence] = true;

			print();
		}
	}

	//method to print out the bathroom
	public void print() {

		//print x if the stall is occupied, - otherwise
		for (boolean stall : stalls) {
			if (stall) {
				System.out.print("x");
			}

			else {
				System.out.print("-");
			}
		}

		System.out.println();

	}

}//End class
