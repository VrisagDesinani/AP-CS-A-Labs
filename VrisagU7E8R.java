package Unit7;

public class VrisagU7E8R {
	
		//initializes the original array
		int [][] originalArray;
		
		VrisagU7E8R(){
			//instantiates the array with a size of 3x3
			originalArray = new int [3][3];
		}
		
		public void populate() {
			
			//enhanced for loop that finds the amount of elements in a row, then prints each column within that row
	        for (int i = 0; i < originalArray.length; i++) {
	            for (int j = 0; j < originalArray[i].length; j++) {
	            	//fills matrix with random numbers
	                originalArray[i][j] = (int) ((Math.random() * 8) +1);
	            }
	        }
		}
	
	    public void reverseArray() {
	    	
	    	//prints the original array before any modifications 
	    	System.out.println("Original Array:");
	    	for (int[] row : originalArray) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    	
	        //for loop that is used to go through all the elements 
	        for (int[] row : originalArray) {
	        	
	        	//creates the start and end variables 
	            int start = 0;
	            int end = row.length - 1;

	            //while loop that swaps elements from start to end
	            while (start < end) {
	                
	            	//a temporary variable is used to hold the value so we don't lose it when swapping
	                int temp = row[start];
	                
	                //swaps around the variables
	                row[start] = row[end];
	                row[end] = temp;

	                //move stard and end variables towards each other
	                start++;
	                end--;
	            }
	        }
	    }

	    public void printFinal() {
	    	
	    	//prints our the final reversed array with enhanced for loop
	    	System.out.println("\nReversed Array:");
	        for (int[] row : originalArray) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }

}//End class
