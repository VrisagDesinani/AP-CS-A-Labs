package Unit4;
import java.util.Scanner;
import java.util.Arrays;

public class VrisagU4E4D {

	public static void main(String[] args) {

		//initializes the scanner, variables, and arrays
		Scanner user = new Scanner(System.in);
		double temp[] = new double[12];
		String month[] = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		double avg = 0.0;

		//for loop for all of the months
		
		for (int i = 0; i<12; i++) {
			
			//gets all of the months data from the user
			System.out.println("Enter " + month[i] + "'s " + "temperature: ");
			temp[i] = user.nextDouble();

			//gets the sum of all the months 
			avg += temp[i];
			
		}

		//sorts the array from smallest to largest 
		Arrays.sort(temp);

		//prints the lowest and highest temperatures 
		System.out.println("The lowest temperature is: " + temp[0]);
		System.out.println("The highest temperature is: " + temp[11]);

		//calculates the average for the months 
		System.out.println("The average for all the months is " + (avg/12));


	}//End main

}//End class
