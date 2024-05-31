package Unit2;

//import scanner
import java.util.Scanner;


public class VrisagU2E5D {

	public static void main(String[] args) {
		
		//import scanner
		Scanner input = new Scanner(System.in);
		
		//this collects the radius from the user 
		System.out.println("Enter radius of the sphere: ");
		double radius = input.nextDouble();
		
		//this does the operations 
		double surfaceArea = (4 * Math.PI* Math.pow(radius, 2));
		double volume = ((4.0/3.0) * Math.PI* Math.pow(radius, 3)); 
		
		//this prints the surface area and volume, printf is used to format the value to 3 decimal places 
		System.out.printf("The volume of the sphere is: %.3f\n" , volume);
		System.out.printf("The surface area of the sphere is: %.3f\n " , surfaceArea);
		
	}//End main

}//End class
