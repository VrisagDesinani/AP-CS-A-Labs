package Unit3;
import java.util.Scanner;

public class VrisagU3E8D {
	
	public static void main(String[] args) {
		
		//initializes the scanner and resource class
		Scanner input = new Scanner(System.in);
		VrisagU3E8R v = new VrisagU3E8R();
		
		//gets first angle 
		System.out.println("Enter first angle: ");
		int angle1 = input.nextInt();
		
		//gets first angle 
		System.out.println("Enter second angle: ");
		int angle2 = input.nextInt();
		
		//gets first angle 
		System.out.println("Enter third angle: ");
		int angle3 = input.nextInt();
		
		//calls on methods
		v.checkAcute(angle1, angle2, angle3);
		v.checkObtuse(angle1, angle2, angle3);
		v.checkRight(angle1, angle2, angle3);
		
	}//End main

}//End class
