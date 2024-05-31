package Unit5;
import java.util.Scanner;

public class VrisagU5E6D {

	public static void main(String[] args) {

		//initializes the resource class, scanner, and the string
		VrisagU5E6R r = new VrisagU5E6R();
		Scanner input = new Scanner(System.in);
		String stat = "";

		//clears the machine ahead of time
		r.clear();

		//while loop with method as conditional
		while (r.vStat(stat)) {

			//gets user input 
			System.out.println("Enter your vote ('D' for Democrat, 'R' for Republican, 'q' to quit): ");
			stat = input.next();

			//uses the user input for the vote or quit
			if (stat.equals("R")) {
				r.voteD();
			}

			else if (stat.equals("D")) {
				r.voteR();
			}


		}

		//once finished it tallies up, reports it, and clears the machine for next time
		r.getTallies();
		r.clear();

	}//End main

}//End class
