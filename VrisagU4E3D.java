package Unit4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class VrisagU4E3D {

	public static void main(String[] args) {
		
		//Initializes the scanner and a variable
		Scanner input = new Scanner(System.in);
		char ch;

		//gets the string from the user
		System.out.println("Enter your string ");
		String text = input.next();
		
		//finds the text length and creates an array
		int textLength = text.length();
		int[] pos = new int [textLength];
		
		//prints
		System.out.print("\nThe uppercase letters of the string are: ");
		
		//finds the uppercase letter and using the print statement, adds the letter to the print above ^
		for (int i = 0; i<textLength; i++ ) {

			ch = text.charAt(i);

			if (Character.isUpperCase(ch)) {
				System.out.print(ch+ " ");
			}

		}

		//uses the substring method to find the second letter of the string 
		String sub = text.substring(1, 2);
		System.out.println("\nThe second letter of the string is: " + sub);
		
		//adds a space between the lines
		System.out.print("\n");
		
		
		
		//for loop to check every letter in the string
		for (int i = 0; i<textLength; i++ ) {	
			
			//gets a single letter out
			String ch1 = text.substring(i, i+1);
			//checks if the extracted letter is a vowel
			if (ch1.equals("A") || ch1.equals("a") ||ch1.equals("E") ||ch1.equals("e") ||ch1.equals("I") ||ch1.equals("i") ||ch1.equals("O") ||ch1.equals("o") ||ch1.equals("U") ||ch1.equals("u")) {

				//if it is a vowel then it puts a # as a placeholder
				System.out.print("#");
				
				
				
				pos[i] = i;

			}

			else {
				//if not it just prints the normal letter
				System.out.print(ch1);
			}


		}

		

		System.out.println("\nThe positions of the vowels are: ");
		
		for (int i = 0; i<textLength; i++ ) {	
			
			//gets a single letter out
			String ch1 = text.substring(i, i+1);
			//checks if the extracted letter is a vowel
			if (ch1.equals("A") || ch1.equals("a") ||ch1.equals("E") ||ch1.equals("e") ||ch1.equals("I") ||ch1.equals("i") ||ch1.equals("O") ||ch1.equals("o") ||ch1.equals("U") ||ch1.equals("u")) {
				
				System.out.print(i + " ");
				
			}

			


		}


	}//End main

}//End class


