package Unit5;
import java.util.Scanner;
import java.util.Arrays;

public class VrisagU5E4R {

	//instantiates all of the variables 
	private Scanner input =  new Scanner (System.in);
	private double set[];
	private double range;
	private double product;
	private int setNum;
	private double setNumFinal;
	private double diff;
	private long sum;

	//default constructor to  initialize values
	public VrisagU5E4R() {

		range = 0;
		product = 1;
		setNum = 0;
		setNumFinal = 0;
		diff = 0; 
		sum = 0;

	}

	public void range() {

		int i = 0;

		//gets the numbers from the user;
		System.out.println("How many values are you going to enter");
		setNum = input.nextInt();

		//final number of items in the set are final
		setNumFinal = setNum;

		//Creates a array thats the says of the number of values the user is going to enter
		double[] set1 = new double[(int) setNumFinal];

		//while loop to handle and unknown amount of set values
		while (setNum > 0) {

			//gets value from user
			System.out.println("Enter value " + (i+1) + ": ");
			double in = input.nextDouble();

			//sorts it into the array
			set1[i] = in;

			//counter increases, and the set number decreases by one to end the while loop
			i++;
			setNum--;

		}

		//clones the final array of values into the instance set so all methods are able to use the array
		set = set1.clone();		
		Arrays.sort(set);

		//gets the sum of the range of numbers
		for (int j = 0; j<setNumFinal; j++) {
			sum += set[j];
		}

	}

	public void difference() {

		//for loop to find the difference of the range of numbers 
		for (int i = 0; i<setNumFinal; i++) {
			diff -= set[i];
		}	

	}

	public void product() {

		//for loop to find the product of the range of numbers
		for (int i = 0; i<setNumFinal; i++) {
			product *= set[i];
		}	

	}

	//print method
	public void print() {

		//prints out the sum, difference, and product
		System.out.println("The sum of the range of numbers is: " + sum);
		System.out.println("The difference of the range of numbers is: " + diff);
		System.out.println("The product of the range of numbers is: " + product);

	}


}//End class
