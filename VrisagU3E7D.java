package Unit3;
import java.util.Scanner;

public class VrisagU3E7D {

	//initializes the random digits 
	String randDig1;
	String randDig2;
	String randDig3;
	String randDig4;
	
	public static void main(String[] args) {
		
		//initializes the scanner 
		Scanner input = new Scanner(System.in);
		
		//finds a random 4 digit number 
		int random = (int) (999+(Math.random()*9000));
		
		//gets a four digit number from the user 
		System.out.println("Enter 4 digit number");
		String userNum = input.next();	
		
		//converts the random number to a strong 
		String strRandom = Integer.toString(random);
		
		//gets the 1st, 2nd, 3rd, and 4th digit from the number the user provide 
		String userDig1 = strRandom.substring(0, 1);
		String userDig2 = strRandom.substring(1, 2);
		String userDig3 = strRandom.substring(2, 3);
		String userDig4 = strRandom.substring(3, 4);
		
		//gets the 1st, 2nd, 3rd, and 4th digit from the random number
		String randDig1 = userNum.substring(0, 1);
		String randDig2 = userNum.substring(1, 2);
		String randDig3 = userNum.substring(2, 3);
		String randDig4 = userNum.substring(3, 4);
		
		//compares if the first digit of users number is the same as the random digit 
		if (userDig1.equals(randDig1) == false) {
			randDig1 = "X";
		}
		
		//compares if the second digit of users number is the same as the random digit 
		if (userDig2.equals(randDig2) == false) {
			randDig2 = "X";
		}

		//compares if the third digit of users number is the same as the random digit 
		if (userDig3.equals(randDig3) == false) {
			randDig3 = "X";
		}
		
		//compares if the fourth digit of users number is the same as the random digit 
		if (userDig4.equals(randDig4) == false) {
			randDig4 = "X";
		}
		
		//if all the digits are equal, then the number is correct 
		if (userDig1.equals(randDig1) == true && userDig2.equals(randDig2) == true && userDig3.equals(randDig3) == true && userDig4.equals(randDig4) == true  ) {
			System.out.println("Congrats, you got the number correct ");
		}
		
		//prints out the final number with the X replaced in places where the user got the digit wrong 
		System.out.println(randDig1 + randDig2 + randDig3 + randDig4);
		
	}//End class

}// End main
