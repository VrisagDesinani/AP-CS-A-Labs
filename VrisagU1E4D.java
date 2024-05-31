package Unit1;
import java.util.Scanner;

/*
 Write a Class called YourNameU1E4R. This assignment will consist of converting wind speeds into different measurement units. You will continue working with methods, the Scanner class, using formulas and outputting data to the screen. You will need to research to find what 1 knot - mph ect…
Write a method that will convert wind speed from knots to:
 miles per hour. 
Kilometers per hour
Meters per second
Write a method that will convert wind speed from miles per hour to:
 Knots per hour. 
Kilometers per hour
Meters per second
Write a method that will convert wind speed from kilometers per hour to:
 Knots per hour. 
Miles per hour
Meters per second
D. Write a method that will ask the following questions:
What is the starting unit of measurement (knots, MPH, KM)
What is the current wind speed?
Then call the appropriate method. 
WE WILL WRITE THIS METHOD TOGETHER. You might have to remind me. 

E. Write a method called print and print out the wind speeds. 
 
F. Also submit your three test cases. 

G.  Write YourNameU1E4D and call the methods from YourNameU1E4R

 */

public class VrisagU1E4D {

	//creating the variables 
	double num1;
	double num2;
	

	public static void main(String[] args) {

		//this gives the variable a temporary number
		double num1 = 0;
		double num2 = 0;

		//this creates the scanner which receives the user input
		Scanner user = new Scanner(System.in);


		//tells user what to do 
		System.out.println("Enter two numbers: ");

		//uses scanner to get numbers from the user
		num1 = user.nextDouble();
		num2 = user.nextDouble();

		
		//if the number has does not have a decimal, then the point 0 would not be included, else proceed as normal with double
		if ((num1%num2)==0) {

			//casts back into an int because there is no decimal point
			int quotient =   (int) (num1/num2);

			//does the operations 
			int sum = (int) (num1 + num2);
			int diff = (int) (num1 - num2);
			int prod = (int) (num1 * num2);

			//prints out all of the operations 
			System.out.println("The sum is: " + sum);
			System.out.println("The difference is: " + diff);
			System.out.println("The product is: " + prod);
			System.out.println("The quotient is: " + quotient);
			
		} 

		else {

			//this the division, the double is used because there is a decimal
			double quotient =  num1/num2;

			//does the operations 
			int sum = (int) (num1 + num2);
			int diff = (int) (num1 - num2);
			int prod = (int) (num1 * num2);

			//prints out all of the operations 
			System.out.println("The sum is: " + sum);
			System.out.println("The difference is: " + diff);
			System.out.println("The product is: " + prod);
			System.out.println("The quotient is: " + quotient);
			
		} //end of if else statement



	} //end main






} //end class
