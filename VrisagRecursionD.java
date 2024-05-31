package Unit10;
import java.util.ArrayList;


public class VrisagRecursionD {
	
	

	public static void main(String[] args) {
		
		VrisagRecursionR r = new VrisagRecursionR();
		ArrayList<Integer> arr = new ArrayList <Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		//r.printInts(2, 10);
		r.strChange("Hello");
		
		System.out.println("\nThe sum is: " + r.sumArray(arr));
	}

}

