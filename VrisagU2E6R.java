package Unit2;



public class VrisagU2E6R {
	
	//Initializes the string "light" 
	String light = "whatisthelightyouseeeveryday";
	int strLength;
	
	//method to calculate the length
		public int calcLength() {
			//finds the length of the string
			int strLength = light.length();
			//returns the length of the string
			return strLength;
		}
	
	//method to find the substring
	public String subString() {
		//this finds the length from the 5th character to the 7th
		String subLength = light.substring(5,8);
		//returns the substring
		return subLength;
	}
	
	//method to see if the two strings are the same
	public boolean checkStrings(String str1, String str2 ) {
		
		//the statement that checks if two strings are equal
		boolean check = str1.equals(str2);
		//return check
		return check;
	}
	
	//method to compare the length of strings 
	public int compareStrings(String str3, String str4) {
		
		//statement to see if the lengths of strengths are equal, more, or less
		int compare = str3.compareTo(str4);
		//returns the output of the previous statement
		return compare;
	}
	
	//method to print the string
	public void print(int length, String sub, Boolean equal, int comparison) {
	
		//prints out the statements
		System.out.println("The string is: " + light);
		System.out.println("The length of the string is: " + length);
		System.out.println("The characters from 5 to 7 are: " + sub);
		
		//if the output of the compare strings is 0, then the strings are the sane 
		if (comparison == 0) {
			System.out.println("String one is equal to string two in length");

		}
		
		//if the output is negative, then the string one is less than string two 
		else if (comparison<0) {
			System.out.println("String one is less than string two in length");

		}
		
		//any other possibility results in string one being bigger than string two 
		else {
			System.out.println("String one is more than string two in length");

		}
		
	}
	
	
	
	
	
	

}//End class
