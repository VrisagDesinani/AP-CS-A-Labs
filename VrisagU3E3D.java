package Unit3;
import java.util.Scanner;

public class VrisagU3E3D {

	public static void main(String[] args) {
		
		//Initializes the input
		Scanner input = new Scanner(System.in);
		
		
		//asks user to enter degrees 
		System.out.println("Enter the number of degrees ");
		int degrees = input.nextInt();
		
		
		//uses if else to find the direction and wind direction
		if (degrees == 0 || degrees == 360) {
			System.out.println("Direction is N, and Wind Direction is S");
		}
		
		else if (0 < degrees && degrees < 10) {
			System.out.println("Direction is NbE, and Wind Direction is SbW");
		}
		
		else if (10 <= degrees && degrees < 20) {
			System.out.println("Direction is NNE, and Wind Direction is SSW");
		}
		
		else if (20 <= degrees && degrees < 30) {
			System.out.println("Direction is NEbN, and Wind Direction is SSW");
		}
		
		else if (40 <= degrees && degrees < 50) {
			System.out.println("Direction is NE, and Wind Direction is SW");
		}
		
		else if (60 <= degrees && degrees < 70) {
			System.out.println("Direction is NEbE, and Wind Direction is SWbW");
		}
		
		else if (70 <= degrees && degrees < 80) {
			System.out.println("Direction is ENE, and Wind Direction is WSW");
		}
		
		else if (80 <= degrees && degrees < 90) {
			System.out.println("Direction is EbN, and Wind Direction is WbS");
		}
		
		else if (90 <= degrees && degrees < 100) {
			System.out.println("Direction is E, and Wind Direction is W");
		}
		
		else if (100 <= degrees && degrees < 110) {
			System.out.println("Direction is EbS, and Wind Direction is WbN");
		}
		
		else if (110 <= degrees && degrees < 120) {
			System.out.println("Direction is ESE, and Wind Direction is WNW");
		}
		
		else if (120 <= degrees && degrees < 130) {
			System.out.println("Direction is SEbE, and Wind Direction is NWbW");
		}
		
		else if (140 <= degrees && degrees < 150) {
			System.out.println("Direction is SE, and Wind Direction is NW");
		} 
		
		else if (150 <= degrees && degrees < 160) {
			System.out.println("Direction is SEbS, and Wind Direction is NWbN");
		}
		
		else if (160 <= degrees && degrees < 170) {
			System.out.println("Direction is SSE, and Wind Direction is NNW");
		}
		
		else if (170 <= degrees && degrees < 180) {
			System.out.println("Direction is SbE, and Wind Direction is NbW");
		}
		
		else if (180 <= degrees && degrees < 190) {
			System.out.println("Direction is S, and Wind Direction is N");
		}
		
		
		else if (190 <= degrees && degrees < 200) {
		    System.out.println("Direction is SbW, and Wind Direction is NbE");
		}
		
		else if (200 <= degrees && degrees < 210) {
		    System.out.println("Direction is SSW, and Wind Direction is NNW");
		}
		
		else if (210 <= degrees && degrees < 220) {
		    System.out.println("Direction is SbS, and Wind Direction is NbN");
		}
		
		else if (220 <= degrees && degrees < 230) {
		    System.out.println("Direction is WSW, and Wind Direction is ENE");
		}
		
		else if (230 <= degrees && degrees < 240) {
		    System.out.println("Direction is WbS, and Wind Direction is EbN");
		}
		
		else if (240 <= degrees && degrees < 250) {
		    System.out.println("Direction is W, and Wind Direction is E");
		}
		
		else if (250 <= degrees && degrees < 260) {
		    System.out.println("Direction is WbN, and Wind Direction is EbS");
		}
		
		else if (260 <= degrees && degrees < 270) {
		    System.out.println("Direction is WNW, and Wind Direction is ESE");
		}
		
		else if (270 <= degrees && degrees < 280) {
		    System.out.println("Direction is WbW, and Wind Direction is EbE");
		}
		
		else if (280 <= degrees && degrees < 290) {
		    System. out.println("Direction is W, and Wind Direction is E");
		}
		
		else if (290 <= degrees && degrees < 300) {
		    System.out.println("Direction is WbN, and Wind Direction is EbS");
		}
		
		else if (300 <= degrees && degrees < 310) {
		    System.out.println("Direction is WSW, and Wind Direction is ENE");
		}
		
		else if (310 <= degrees && degrees < 320) {
		    System.out.println("Direction is WbS, and Wind Direction is EbN");
		}
		
		else if (320 <= degrees && degrees < 330) {
		    System.out.println("Direction is SbW, and Wind Direction is NbE");
		}
		
		else if (330 <= degrees && degrees < 340) {
		    System.out.println("Direction is SSW, and Wind Direction is NNW");
		}
		
		else if (340 <= degrees && degrees < 350) {
		    System.out.println("Direction is SbS, and Wind Direction is NbN");
		}
		
		

	}//End main

}//End Class
