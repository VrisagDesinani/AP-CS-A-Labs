package Unit6;
import java.util.Scanner;

public class VrisagU6E4R {
	
	private Scanner input = new Scanner(System.in);
	
	public void reverse() {
		
		int i=0;
		
		//gets the numbers from the user;
				System.out.println("How many values are you going to enter");
				int setNum = input.nextInt();

				//final number of items in the set are final
				int setNumFinal = setNum;

				//Creates a array thats the says of the number of values the user is going to enter
				int set[] = new int[setNumFinal];

				//while loop to handle and unknown amount of set values
				while (setNum > 0) {

					//gets value from user
					System.out.println("Enter value " + (i+1) + ": ");
					int in = input.nextInt();

					//sorts it into the array
					set[i] = in;

					//counter increases, and the set number decreases by one to end the while loop
					i++;
					setNum--;

				}

		//adds a space 
		System.out.println("\nThe reversed order is: ");
		setNumFinal -=1;
		
		//for loop that starts at the 9th element and reduces to 0 index element
		for (int j = setNumFinal; j>=0; j--){
			//prints the element
			System.out.print(set[j] + " ");	
		}

	}
	
	public static void main(String[] args) {
		VrisagU6E4R r = new VrisagU6E4R();
		r.reverse();
	}


}
