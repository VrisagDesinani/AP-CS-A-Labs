package Unit1;
import java.util.Scanner;

/*
 Write a Class called YourNameU1E3R This assignment will allow you to practice using casting, when to use casting, and better understadnn how casting works. 
Write a method called add. Take in two numbers from the keyboard that will sum the numbers.
Write a method called subtract. Take in two numbers from the keyboard that will find the difference of the numbers. 
Write a method called multiply. Take in two numbers from the keyboard that will find the product of the numbers.
Write a method called divide. Take in two numbers from the keyboard that will find the quotient of the numbers. If the answer is zero (0), use casting to fix the error. 

       Use these test cases (100, 20), (30, 5) (6, 20), (32,64), and (24,42).
If you used casting, write to the screen how casting worked to solve the issue.
Write to the screen, should a programmer use int or double for any of the operators (+, -, *, /)?
Write the class YourNameU1E3D and call YourNameU1E3R.

 */

public class VrisagU1E3D {

	//creating the variables 
	int num1;
	int num2;
	Scanner user = new Scanner(System.in);

	public static void main(String[] args) {

		//this gives the variable a temporary number
		int num1 = 0;
		int num2 = 0;

		//this creates the scanner which receives the user input
		Scanner user = new Scanner(System.in);


		//tells user what to do 
		System.out.println("Enter two numbers: ");

		//uses scanner to get numbers from the user
		num1 = user.nextInt();
		num2 = user.nextInt();

		//casting to convert into a decimal 
		double num3 = (double) num1/num2;
		
		//does the operations 
		int sum = num1 + num2;
		int diff = num1 - num2;
		int prod = num1 * num2;

		//prints operations
		System.out.println("The sum is: " + sum);
		System.out.println("The difference is: " + diff);
		System.out.println("The product is: " + prod);
		System.out.println("The quotient is: " + num3);
		
		
		//c.
		System.out.println("Casting helped resolve this issue because since a double was used for the division, decimals could now be used which results in an accurate answer.");
		
		//d.
		System.out.println("A programmer should use double for this one so that there are no answers wrong."); 
		

	} //End class






} //End main
