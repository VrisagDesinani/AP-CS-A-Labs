//practice exercise
package Unit1;

/*
 1.       Write a class called YourNameU1E1R. This assignment will consist of you learning more about the print and println statements. 
The class will do the following:
a.       Write a method called print. This method will use the System.out.print, and print the following 5 times: ” Do or do not do, there is no try”.
b.    Write a method called printLine. This method will use the System.out.println, and print the following 5 times: “Tell me and I forget. Teach me and I remember. Involve me and I learn.”
c.   Write a method called finalPrint. This method will print an  explanation of the difference between print and println
D. Write a class called YourNameU1E1D. This class will create an object for YourNameU1E1R and call each of the methods in YourNameU1E1R.

 */

public class VrisagU1E1D {

	public static void main(String[] args) {

		//the for loop prints the following quote 5 times 
		for (int i = 0; i < 5; i++) { 
			System.out.print("Do or do not do, there is no try");

		} //End of for loop


		//the for loop prints the following quote 5 times 
		for (int i = 0; i < 5; i++) {
			System.out.println("Tell me and I forget. Teach me and I remember. Involve me and I learn.");

		} //End of for loop 


		
		System.out.println("The differnce between print and println is that print allows you to write text on the same line while println goes to the next line.");
		
		System.out.println("The difference between println and printf is that println prints a line of text while printf formats the text.");

		


	} //End Main

}//End Class
