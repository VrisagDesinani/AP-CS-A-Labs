package Unit4;
import java.util.Scanner;
public class VrisagU4E7R {

	//Initializes the variables all the methods the class has access too
	double setNumFinal;
	double[] set;
	double mean;
	int setNum;

	//method to get the numbers from the user
	public void num() {

		//Initializes the scanner and variables for the class
		Scanner input = new Scanner(System.in);
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


	}

	//method to calculate mean 
	public void mean() {

		//for loop to get the sum of all the values in the set
		for (int i = 0; i < set.length; i++) {

			mean += set[i];

		}

		//divides the sum by the set number
		mean = (mean/setNumFinal);

		//prints the mean
		System.out.println("The mean is: " + mean );

	}

	public void stanDev() {

		//creates the variance variable
		double variance = 0;

		//for loop to get the variance for each set element
		for (int i = 0; i < set.length; i++) {

			double deviation = set[i] - mean;
			variance += deviation * deviation;
		}

		//calculates final standard deviation
		double stanDev = Math.sqrt(variance / setNumFinal);

		//prints standard deviation
		System.out.println("The standard deviation is: " + stanDev);
	}



}//End class
