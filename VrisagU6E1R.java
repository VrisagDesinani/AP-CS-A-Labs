package Unit6;

public class VrisagU6E1R {

	//creates the array with values already in it
	private int arr[] = {1,2,3,4,5,6,7,8,9,10};


	public void evenIndex() {

		//for loop that stars at one and adds one so it starts at the second element 
		for (int i = 1; i<10; i++){

			//prints out the element
			System.out.print(arr[i] + " ");

			//used to skip and element so it can go past the odds
			i+=1;

		}


	}

	public void evenElement() {

		//creates a space
		System.out.println();

		//for loop that starts at 0 and ends at 10
		for (int i = 0; i<10; i++){

			//if the element is a factor of 2 then it will print
			if (arr[i] % 2 == 0)
				//prints the element
				System.out.print(arr[i] + " ");
		}

	}

	public void reverse() {

		//adds a space
		System.out.println();

		//for loop that starts at the 9th element and reduces to 0 index element
		for (int i = 9; i>=0; i--){
			//prints the element
			System.out.print(arr[i] + " ");	
		}

	}

	public void firstAndLast() {

		//prints the elements at index 0 and 9, which is the 1st and 10th element
		System.out.println("\nFirst element is " + arr[0]);
		System.out.println("Last element is " + arr[9]);

	}

}//End class