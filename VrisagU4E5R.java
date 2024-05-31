package Unit4;
import java.util.Scanner;

public class VrisagU4E5R {
	
	//Initializes the scanner 
	Scanner input = new Scanner(System.in);
	
	//methods that reads input
	public String input() {
		
		//gets input from the user and returns it
		System.out.println("Enter a word");
		String word = input.next();
		
		return word;
	
	}
	
	//method to print the word backwards
	public void backword(String input) {
		
		//print statement
		System.out.print("The string backwords is: ");
		
		//for loop that goes backwards to get the substring backwards
		for (int i = input.length() - 1; i >= 0; i--) {
			
			//adds on the previous print statement
            System.out.print(input.charAt(i));
		}
		
		//adds a space for the next method
		System.out.println();
		
	}
	
	//method to get all the substrings 
	public void allSub(String word) {
		
		//for loop for all the letters of word
	    for (int len = 1; len <= word.length(); len++) {
	    	//nested loop to get all the combinations
	        for (int i = 0; i + len <= word.length(); i++) {
	        	
	        	//gets the substring and prints it
	            String sub = word.substring(i, i + len);
	            System.out.println(sub);
	            
	        }
	    }
	}


	
	
}//End class
