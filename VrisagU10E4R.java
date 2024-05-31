package Unit10;
import java.util.Scanner;

public class VrisagU10E4R {
	
	
	 public int calculateFactorial(int n) {
		 
		 	//case to terminate the loop
	        if (n == 0 || n == 1) {
	            return 1; 
	        } 
	        
	        //factorial calculations
	        else {
	            return n * calculateFactorial(n - 1); // Recursive call to calculate factorial
	        }
	 }
	 
	 //printer method
	 public void printer() {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int num = input.nextInt();
		 System.out.println("The factorial is: " + calculateFactorial(num));
	 }

}//End class
