package Unit2;
import java.util.Scanner;

public class VrisagU2E6D {



	public static void main(String[] args) {
		
		//creates the scanner and calls my resource class. It also creates an undeclared integer called output
		Scanner input = new Scanner(System.in);
		VrisagU2E6R VrisagU2E6R = new VrisagU2E6R();
		int output;

		// calls on methods that calculates the length and finds the substring
		int length = VrisagU2E6R.calcLength();
		String subString = VrisagU2E6R.subString();

		//asks user for first string
		System.out.println("Enter the first string: ");
		String str1 = input.nextLine();

		//asks user for second string
		System.out.println("Enter the second string: ");
		String str2 = input.nextLine();

		//calls on methods to see if the strings are the same and how their length relation
		Boolean checkEqual = VrisagU2E6R.checkStrings(str1, str2);
		int comparison = VrisagU2E6R.compareStrings(str1,str2);


		//sends all of the info to the print to send back to the console to print
		VrisagU2E6R.print(length, subString, checkEqual, comparison);

	}

}
