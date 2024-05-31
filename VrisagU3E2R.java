package Unit3;
import java.util.Scanner;

public class VrisagU3E2R {

	//instantiates the variables
	double wage;
	double hours;
	double money;
	
	//Default constructor to initialize the variables
	VrisagU3E2R(){
		wage = 0;
		hours = 0;
		money = 0;
	}
	


	//method to calculate their total salary
	public void checkHours() {
		
		//initializes the scanner
		Scanner input = new Scanner(System.in);
		
		//Gets the wage per hour from user
		System.out.println("Enter wage per hour: ");
		wage = input.nextDouble();
		
		//gets hours from user
		System.out.println("Enter hours: ");
		hours = input.nextDouble();
		
		//method is declared
		VrisagU3E2R hr = new VrisagU3E2R();
		
		
		
		//if the person works for 40 hours or less, then the wage us normally calculated
		if (hours <= 40) {
			 money = hours * wage;
			
		}
		
		//if the person works for more than forty hours, it calculates the first forty hours, and all hours after are paid at %150
		else if (hours > 40) {
			 money = (40 *  wage) + ((hours - 40) * ((3*wage)/2));
			 
		}
		
		//prints final salary
		System.out.println("Your total salary is: $" + money);
		
		
	}
	
	
		
	
}//End Class
