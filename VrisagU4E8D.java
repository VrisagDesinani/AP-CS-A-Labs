package Unit4;
import java.util.Scanner;

public class VrisagU4E8D {

	public static void main(String[] args) {
		
		//Initializes the scanner
		Scanner input = new Scanner(System.in);

		//gets number from user
		System.out.println("Enter an integer: ");
		int num = input.nextInt();

		//sets up for the future prime values 
		System.out.print("The prime numbers up to " + num + " are: ");
		
		//for loop that repeats for all numbers up to the input from user
		for (int i = 2; i <= num; i++) {
			
			//if the number is prime, then it is added to the list of prime numbers to the input
			if (isPrime(i)) {
				System.out.print(i + ", ");
			}
			
		}



	}//End main

	
	//method to check if a number is prime 
	public static boolean isPrime(int num) {

		//0 and 1 are automatically not prime
		if (num<=1) {
			
			//returns false because it is not prime
			return false;

		}
		
		//for loop to check if the number is prime
		for (int i=2;i<=num/2;i++) {
			
			//check all of the factors
			if((num%i)==0) {
				
				//if a factor is satisfied then it returns false 
				return false;
				
			}

		}
		
		// if none of cases are satisfied then it is a prime number
		return true;
	}

}
