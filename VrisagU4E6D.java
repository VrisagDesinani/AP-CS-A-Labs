package Unit4;

public class VrisagU4E6D {

	public static void main(String[] args) {
		
		//Initializes the num
		int num = 0;
		int num1 = 0;
		

		//for loop for all 31 powers
		for (int i = 31; i>=1; i--) {
			
			//does the operation
			num1 =  (int) Math.pow(2, i);
			
			//prints the final values
			System.out.println("2 to the power of "+i+" is: " + num1);
			
		}
		
		//for loop for all 31 powers
		for (int i = 1; i<=31; i++) {
			
			//does the operation
			num = (int) Math.pow(2, i);
			
			//prints the final values
			System.out.println("2 to the power of "+i+" is: " + num);
			
		}
		
		

	}//End main

}//End class
