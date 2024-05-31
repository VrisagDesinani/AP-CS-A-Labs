package Unit7;

public class VrisagU7E7R {
	
	//initialize my array
	private int [][] arr;
	
	//default constructor to give the dimensions of my array
	VrisagU7E7R(){
		arr = new int [3][4];
	}
	
	
	public void populate() {
		
		//nested for loop that traverses through the terms in row major and gives it a random number from 1 to 20
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				 arr[i][j] = (int) ((Math.random() * 20) +1);
			}
		}
	}
	
	
	public void print() {
		
		//first prints the original array
		System.out.println("The original array is: "); 
		
		//row major nested enhanced for loop
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + ", ");
			}
			//space in order to retain the array shape
			System.out.println();
		}
		
		//prints the inverted array
		System.out.println("\nThe inverted array is: "); 
		
		//column major nested for loop to "inverse" the data values 
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + ", ");
			}
			System.out.println();
		}
		
		
	}
	
	

}//End class
