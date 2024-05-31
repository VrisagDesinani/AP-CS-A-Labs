package Unit3;
import java.util.Scanner;
import java.util.Arrays;

public class VrisagU3E6D {

	public static void main(String[] args) {
		
		//initializes the scanner and array
		Scanner input = new Scanner(System.in);
		String[] words = new String[3];
		
		//gets first word and puts it in array
		System.out.println("Enter first word: ");
		words[0] = input.next();
		
		//gets second word and puts it in array
		System.out.println("Enter second word: ");
		words[1] = input.next();
		
		//gets third word and puts it in array
		System.out.println("Enter third word: ");
		words[2] = input.next();
		
		//sorts the array based on their first letter 
		Arrays.sort(words);
		
		//prints out the final ordered sequence
		System.out.println(Arrays.toString(words));

	}//End main

}//End class
