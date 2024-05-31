package Unit7;

public class VrisagU7E6R {

	//Initializes all of the arrays 
	private int [] rowSum;
	private final String[] alphabet = {".", "?", "!", ",", " ", " ", " ", " ", " ", " ", "A", "B", "C", "D", "E", "F", "G", "H", 
			"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	private String[] message;
	
	//Instantiates the matrix with all of the numbers 
	private final int[][] matrix = {
			{98, 90, 25, 92, 23},
			{36, 37, 51, 46, 59},
			{80, 18, 72, 27, 13},
			{53, 42, 29, 100, 103},
			{198, 90, 25, 192, 23},
			{81, 10, 92, 87, 47}, 
			{114, 16, 81, 44, 63},
			{19, 55, 62, 94, 95},
			{30, 61, 84, 25, 14},
			{52, 84, 85, 66, 36},
			{19, 58, 41, 84, 127},
			{61, 78, 47, 72, 56},
			{17, 54, 80, 71, 5},
			{28, 18, 51, 43, 85},
			{317, 54, 80, 71, 5},
			{88, 15, 69, 100, 46},
			{10, 50, 66, 73, 29},
			{61, 78, 47, 72, 156},
			{88, 315, 69, 100, 146},
			{77, 21, 41, 82, 208},
			{10, 30, 36, 23, 29},
			{27, 29, 79, 85, 92},
			{95, 14, 81, 33, 1},
			{61, 52, 97, 10, 603},
			{61, 52, 97, 10, 9},
			{54, 29, 28, 32, 75},
			{42, 73, 73, 71, 164},
			{6, 42, 88, 99, 95},
			{54, 29, 28, 32, 275},
			{61, 52, 97, 10, 503},
			{67, 77, 38, 88, 46}
	};

	//default constructor to give the arrays a size 
	VrisagU7E6R() {
		rowSum = new int [31];
		message = new String [31];
	}

	//used the find the sum of each row
	public void Sums() {

		//sum is set for 0 for now
		int sum = 0;

		//nested for loop to iterate throw one each row at a time
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum+= matrix[i][j];
			}
			
			//once the sum for the row is found, it puts it in the array
			rowSum[i] = sum;
			
			//resets the sum back to zero for the next row 
			sum = 0;
		}

	}
	
	//method to decode the letters from the numbers 
	public void letters() {

		//sets index to zero
		int index = 0;

		//normal for loop to iterate through all the sums while decoding it with %100 and adding it to the message array
		for (int i = 0; i < rowSum.length; i++) {
			index = rowSum[i]%100;
			message[i] = alphabet[index] ;
		}
		
	}

	//method to print the final message 
	public void finalMessage() {
		
		//for loops that go through the different words and adds a space between the words
		for (int i = 0; i < 8; i++) {
			System.out.print(message[i]);
		}

		System.out.print(" ");

		for (int i = 8; i < 18; i++) {
			System.out.print(message[i]);
		}

		System.out.print(" ");
		
		for (int i = 18; i < 21; i++) {
			System.out.print(message[i]);
		}

		System.out.print(" ");

		for (int i = 21; i < 31; i++) {
			System.out.print(message[i]);
		}

	}

}//End class
