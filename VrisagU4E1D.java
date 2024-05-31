package Unit4;
import java.util.Scanner;

public class VrisagU4E1D {

	public static void main(String[] args) {

		//initializes all of the variables and scanner
		double initial;
		double interest;
		double finalInvest = 0;
		int years = 0;
		Scanner input = new Scanner(System.in);

		//gets initial investment from user
		System.out.println("Enter inital investment: ");
		initial = input.nextDouble();

		//gets the interest rate from user
		System.out.println("Enter the interest rate: ");
		interest = input.nextDouble();

		//the while loop is active till the the final investment reaches two million
		while (finalInvest <= 2000000) {

			//calculation for the investment
			finalInvest = initial + (initial * interest);
			initial = finalInvest;

			//every loop the years increases by on
			years++;


		}

		//prints out final result
		System.out.println("The number of years it takes to reach 2 million is: " + years);


	}//End main

}//End class
