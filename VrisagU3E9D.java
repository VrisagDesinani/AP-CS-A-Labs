package Unit3;
import java.util.Scanner;

public class VrisagU3E9D {

	public static void main(String[] args) {
		
		//initializes the scanner
		Scanner input = new Scanner(System.in);

		//gets number from user
		System.out.println("Enter number: ");
		int num = input.nextInt();

		//makes the string and sets an emptly value
		String roman = "";


		/*if a number a less than a value, then the values roman numeral equalivalent would be added to the chain,
		after, the value of the roman numeral would be subtracted from the orginal value of the number given
		*/
		
		while (num >= 1000) {
			roman += "M";
			num -= 1000;
		}
		while (num >= 900) {
			roman += "CM";
			num -= 900;
		}
		while (num >= 500) {
			roman += "D";
			num -= 500;
		}
		while (num >= 400) {
			roman += "CD";
			num -= 400;
		}
		while (num >= 100) {
			roman += "C";
			num -= 100;
		}
		while (num >= 90) {
			roman += "XC";
			num -= 90;
		}
		while (num >= 50) {
			roman += "L";
			num -= 50;
		}
		while (num >= 40) {
			roman += "XL";
			num -= 40;
		}
		while (num >= 10) {
			roman += "X";
			num -= 10;
		}

		while (num==9) {
			roman += "IX";
			num = 0;
		}

		while (num==8) {
			roman += "VIII";
			num = 0;
		}

		while (num==7) {
			roman += "VII";
			num = 0;
		}

		while (num==6) {
			roman += "VI";
			num = 0;
		}

		while (num==5) {
			roman += "V";
			num = 0;
		}

		while (num==4) {
			roman += "IV";
			num = 0;
		}

		while (num==3) {
			roman += "III";
			num = 0;
		}

		while (num==2) {
			roman += "II";
			num = 0;
		}

		while (num==1) {
			roman += "I";
			num = 0;
		}



		//if the number value reaches zero (all roman numerals ave been filled) then it will be printed 
		if (num==0) {
			System.out.println("The roman numeral is: " + roman);

		}





	}//End main

}//End class
