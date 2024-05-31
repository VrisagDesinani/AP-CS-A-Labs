package Unit7;

import java.util.Scanner;

public class VrisagU7E4R {

	//initializes all the arrays and scanner
	private int[][] terrain;
	private String[][] floodedTerrain;
	private Scanner input;


	//default constructed to instantiate the arrays and scanner
	public VrisagU7E4R() {
		terrain = new int [10][10];
		floodedTerrain = new String [10][10];
		input = new Scanner(System.in);
	}


	public void assignHeight() {

		//enhanced for loop that populates the array with random numbers 
		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain[i].length; j++) {
				//fills terrain with random height values
				terrain[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
	}


	public void flood() {

		//gets the flooding level from the user
		System.out.println("Enter flooding level");
		int floodingLevel = input.nextInt();

		//nested for loop to address all of the elements in the arrays
		for (int i = 0; i < terrain.length; i++) {
			for (int j = 0; j < terrain[i].length; j++) {

				//if the terrain value is less than or equal to the flooded value, then it gets flooded and is shown with an *
				if (terrain[i][j] <= floodingLevel) {
					floodedTerrain[i][j] = "*";
				}

				//if it terrain value is anything but smaller than the flooding level, then it does not get flooded and is shown with a space
				else {
					floodedTerrain[i][j] = " ";
				}

			}

		}

	}

	//print method that uses enhanced for loops in order to print every element in both arrays
	public void print() {

		System.out.println("Terrain Height values before flooding: ");

		for (int i[] : terrain) {
			for (int j : i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}

		System.out.println("\nFlooded terrain: ");

		for (String i[] : floodedTerrain) {
			for (String j : i) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}



	}

}//End class

