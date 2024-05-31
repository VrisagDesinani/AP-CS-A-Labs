package Unit8;
import java.util.ArrayList;


public class VrisagU8E1R {
	
	//creates an arraylist called food
	private ArrayList <String> food = new ArrayList<String>();
	
	public void add() {
		food.add("Burger");
		food.add("Pizza");
		food.add("Wings");
		food.add("Ice Cream");
		food.add("Pasta");
	}
	
	//method to remove the second item
	public void remove2nd() {
		food.remove(1);
	}
	
	//method to replace the third item with USS
	public void replace() {
		food.set(2, "USS");
	}
	
	//sorts the arraylist by alphabetical order
	public void sort() {
		
		//creates a variable the stores a food size in a constant variable
		final int n = food.size();

		//insertion sort algorithm
	    for (int i = 1; i < n; ++i) {
	    	
	    	//key is 2nd element and j index before that
	        String key = food.get(i);
	        int j = i - 1;

	        //move elements of food that are greater than key, to one position ahead of their current position
	        while (j >= 0 && food.get(j).compareTo(key) > 0) {
	            food.set(j + 1, food.get(j));
	            j = j - 1;
	        }
	        
	        //sets the value at index
	        food.set(j + 1, key);
	    }
	    
	}
	
	//print method to print the array
	public void print() {
		System.out.println(food);
	}

}
