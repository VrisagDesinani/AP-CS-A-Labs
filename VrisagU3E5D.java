package Unit3;
import java.util.Scanner;

public class VrisagU3E5D {
	
	public static void main(String[] args) {
		
		//initializes tax double and Scanner
		double tax;
		Scanner input = new Scanner(System.in);
		
		//gets salary from user
		System.out.println("Enter your salary");
		Double salary = input.nextDouble();
		
		//if states to use salary range to find what tax
		if (salary < 50000) {
			 tax = 0.01;
		}
		
		else if (salary < 50000 && salary <= 75000) {
			tax = 0.02;
		}
		
		else if (salary < 75000 && salary <= 100000) {
			tax = 0.03;
		}
		
		else if (salary < 100000 && salary <= 25000) {
			tax = 0.04;
		}
		
		else if (salary < 250000 && salary <= 50000) {
			tax = 0.05;
		}
		
		else {
			tax = 0.06;
		}
		
		//this is salary after tax
		double taxedSalary = salary - (salary*tax);
		
		//prints tax and the taxed salary
		System.out.println("The tax for you is: " + tax);
		System.out.println("Your salary with the tax is: " + taxedSalary);
		
		
	}//End main

}//End class
