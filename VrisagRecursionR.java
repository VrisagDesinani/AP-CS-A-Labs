package Unit10;
import java.util.ArrayList;

public class VrisagRecursionR {
	
	int sum = 0;
	
	public void printInts(int j, int k) {
		System.out.println(j);
		if (j < k) {
			printInts(j+1,k);
		}
	}
	
	public void strChange(String str) {
		
		if (str.length() > 0) {
			strChange(str.substring(1));
			System.out.print(str.substring(0, 1));
			
		}
	}
	
	public int sumArray (ArrayList<Integer> arr) {
		
		
		ArrayList<Integer> copyArr = new ArrayList <Integer>(arr);
		
		
		if (copyArr.size() > 0) {
			
			sum += copyArr.get(0);
			copyArr.remove(0);
			
			sumArray(copyArr);
			
		}
		
		return sum;
		
				
	}
	
}
