package Unit3;
import java.util.Scanner;


public class VrisagU3E4R {

	//imports scanner for all methods to use 
	Scanner input = new Scanner(System.in);
	
	
	//method to figure out what state of matter water is
	public void calcState(){
		
		//gets temperature from water 
		System.out.println("Enter temperature of water: ");
		int temp = input.nextInt();

		//if temp is between 100 and zero its liquid 
		if ( temp < 100 &&  temp > 0) {
			System.out.println("The water is liquid");
		}

		//if temp is more than 100 then it is gas 
		else if (temp >= 100) {
			System.out.println("The water is gas");
		}

		//else it is solid 
		else {
			System.out.println("The water is solid");
		}

	}

	//method to calculate the altitude 
	public void calcAlt() {

		//Initializes bp for the method 
		double bp;
		
		while (true) {
			
			//gets what units the user will enter 
			System.out.println("Will you enter altiude in \"feet\", \"meters\", or \"q\" to quit");
			String response = input.next();

			//if response is q, then loop ends and code stops
			if (response.equals("q")) {
				break;
			}
			
			//gets the alt from user
			System.out.println("Enter altitude in the units you have provided ");
			Double alt = input.nextDouble();
			
			//if the alt is less than 0 then it makes user enter again
			if (alt < 0) {
				System.out.println("Invalid Altitude, enter again ");
			}


			//if the units is feet, then the if will be applied 
			if (response.equals("feet")) {
				
				//finds the change in boiling point 
				double bpChange = alt/1000; 
				
				//subtracts the change from overall boiling point 
				bp = 212-bpChange;
				 
				//prints out final boiling point 
				System.out.println("The boiling point is: " + bp );
				
			}
			
			if (response.equals("meters")) {

				//finds the change in boiling point
				double bpChange = alt/300; 
				
				//subtracts the change from overall boiling point 
				bp = 100-bpChange;
				 
				//prints out final boiling point 
				System.out.println("The boiling point is: " + bp );
				
			}


			

		}//End while loop

	}

}//End class
