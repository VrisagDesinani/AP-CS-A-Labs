package Unit7;

public class VrisagU7E5R {

	//creates two arrays 
	int [][] originalArray;
	int [][] finalArray;

	VrisagU7E5R(){
		//gives the size to both arrays 
		originalArray = new int [3][3];
		finalArray = new int [3][3];
	}

	public void populate() {

		//nested for loop to get all of the elements 
		for (int i = 0; i < originalArray.length; i++) {
			for (int j = 0; j < originalArray[i].length; j++) {
				//fills matrix with random numbers
				originalArray[i][j] = (int) ((Math.random() * 8) +1);
			}
		}
	}
	
	public void sums() {
		
	    //nested for loop to address all elements in the array
	    for (int row = 0; row < originalArray.length; row++) {
	        for (int col = 0; col < originalArray[row].length; col++) {
	        	
	        	//creates a sum variable
	            int sum = 0;

	            //if the sum and column are less than the end of the matrix then the right and top elements will be added to the sum
	            if (col < originalArray[row].length - 1) {
	                sum += originalArray[row][col + 1];
	            }

	            if (row < originalArray.length - 1) {
	                sum += originalArray[row + 1][col];
	            }

	            //if the sum and column are greater than zero then bottom and left elements will be added to the sum 
	            if (col > 0) {
	                sum += originalArray[row][col - 1];
	            }

	            if (row > 0) {
	                sum += originalArray[row - 1][col];
	            }

	            //puts the sum of the neighbors into the final array
	            finalArray[row][col] = sum;
	        }
	    }
	}

	public void print() {

		System.out.println("Original Array: ");
		
		//nested for loop to print out every element in the array
		for (int i = 0; i < originalArray.length; i++) {
			for (int j = 0; j < originalArray[i].length; j++) {
				System.out.print(originalArray[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nFinal Array: ");
		
		//nested for loop to print out every element in the array
		for (int i = 0; i < finalArray.length; i++) {
			for (int j = 0; j < finalArray[i].length; j++) {
				System.out.print(finalArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}//End class
