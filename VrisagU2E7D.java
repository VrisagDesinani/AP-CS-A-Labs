package Unit2;

public class VrisagU2E7D { 

	public static void main(String[] args) { 


		//display minimum & max integer value
		System.out.println("Minimum Integer Value is: " + Integer.MIN_VALUE);
		System.out.println("Maximum Integer Value is: " + Integer.MAX_VALUE);


		//create an int object and double object
		Integer intObject = 0;
		Double doubleObject = 123.456;

		//create two different strings 
		String str1 = "888";
		String str2 = "20";

		//convert the strings to integers and add them
		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		int sum = int1 + int2;
		System.out.println("Sum of integers is: " + sum);


		//square the larger integer
		int intSquared = int2 * int2;
		//convert the squared integer to a string using toString
		String stringSquared = Integer.toString(intSquared);


		//print the numbers in positions 1 and 2 using substring
		String pos1 = stringSquared.substring(0, 1);
		String pos2 = stringSquared.substring(1, 2);
		System.out.println("The digits at positions 1 and 2 are: " + pos1 + ", " + pos2);


		//convert  double into a string
		String doubleToString = Double.toString(doubleObject);

		//if to print the last two digits
		if (doubleToString.contains(".")) {

			//find the index of the decimal point
			int decimalIndex = doubleToString.indexOf(".");
			
			//take out the characters after the decimal point
			String decimalDigits = doubleToString.substring(decimalIndex + 1);
			
			//extract the last two characters
			String lastTwoDigits = decimalDigits.substring(decimalDigits.length() - 2);
			
			//print the first two digits after the decimal point
			System.out.println("Last two digits after the decimal point are: " + lastTwoDigits);

		}

	} //End main

} //End class
