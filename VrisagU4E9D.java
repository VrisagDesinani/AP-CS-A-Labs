package Unit4;
import java.util.Scanner;

public class VrisagU4E9D {

	public static void main(String[] args) {
		
		//Initializes scanner and the input
		Scanner input = new Scanner(System.in);
		int i = 1;
		
		
		//gets the initial amount and half life from the user
		System.out.println("Enter the intial amount of radioactive materials: ");
		int in = input.nextInt();
		
		System.out.println("Enter the half life in years: ");
		int half = input.nextInt();
		
		
		
		//while loop that repeats until the amount reaches zero
		while (in>0) {
			
			//divides the initial by 2
			in = (int) (in * 0.5);
			
			//after the half life, the amount after the half like is: 
			System.out.println("The amount of substance remaining after " + (i*half) + " years is: " + in);
			
			//increases the amount of times half like is applied by one
			i++;
			
		}
		

	}//End main

}//End class
