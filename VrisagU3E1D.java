package Unit3;

//imports scanner
import java.util.Scanner;

public class VrisagU3E1D {

	public static void main(String[] args) {
		
		//initializes the scanner
		Scanner input = new Scanner(System.in);
		
		//gets the number from the user
		System.out.println("Enter a number from 0 to 2 billion: ");
		int num = input.nextInt();
		
		//if the number is negative then it converts it back to a positive
		if (num < 0) {
			num = num*(-1);
		}
		
		//if the number is less than 10 it has one digit
		if (num<10) {
			System.out.println("The number has one digit");
		}
		
		//if the number is more than or equal to 10 but less than 100, then it has two digits 
		else if (num>=10 && num<100) {
			System.out.println("The number has two digits");
		}
		
		//if the number is more than or equal to 100 but less than 1000, then it has three digits 
		else if (num>=100 && num<1000) {
			System.out.println("The number has three digits");
		}
		
		//if the number is more than or equal to 1000 but less than 10000, then it has four digits 
		else if (num>=1000 && num<10000) {
			System.out.println("The number has four digits");
		}
		
		//if the number is more than or equal to 10000 but less than 100000, then it has five digits 
		else if (num>=10000 && num<100000) {
			System.out.println("The number has five digits");
		}
		
		//if the number is more than or equal to 100000 but less than 1000000, then it has six digits 
		else if (num>=100000 && num<1000000) {
			System.out.println("The number has six digits");
		}
		
		//if the number is more than or equal to 1000000 but less than 10000000, then it has seven digits 
		else if (num>=1000000 && num<10000000) {
			System.out.println("The number has seven digits");
		}
		
		//if the number is more than or equal to 10000000 but less than 100000000, then it has eight digits 
		else if (num>=10000000 && num<100000000) {
			System.out.println("The number has eight digits");
		}
		
		//if the number is more than or equal to 100000000 but less than 1000000000, then it has nine digits 
		else if (num>=100000000 && num<1000000000) {
			System.out.println("The number has nine digits");
		}
		
		//else the number has ten digits 
		else {
			System.out.println("The number has ten digits");

		}
		
		

	}//End Main

}//End Class
