package Unit8;
import java.util.ArrayList;

public class VrisagU8E23R {

	//all the methods up to toString() are given from the assignment 
	private ArrayList<Integer> values;

	public VrisagU8E23R() {
		values = new ArrayList<Integer>(); 
	}


	public void add(int n) {
		values.add(n);
	}

	public String toString() {
		return values.toString();
	}

	public VrisagU8E23R append(VrisagU8E23R other) {

		//creates the object to add the values 
		VrisagU8E23R r = new VrisagU8E23R();

		//adds elements to the current sequence
		for (int i : this.values) {
			r.add(i);
		}

		//adds elements to the other sequence
		for (int j : other.values) {
			r.add(j);
		}

		//returns that object with the two sequences merged 
		return r;
	}

	public VrisagU8E23R merge(VrisagU8E23R other) {

		VrisagU8E23R r = new VrisagU8E23R();

		//creates the index's different sequences 
		int thisIndex = 0; 
		int otherIndex = 0; 

		//while loop to iterate through both sequences 
		while (thisIndex < this.values.size() || otherIndex < other.values.size()) {

			//adds the element if it added already
			if (thisIndex < this.values.size()) {
				r.add(this.values.get(thisIndex));
				thisIndex++;
			}

			//adds the element if it added already
			if (otherIndex < other.values.size()) {
				r.add(other.values.get(otherIndex));
				otherIndex++;
			}
		}

		//returns the object
		return r;
	}


	public VrisagU8E23R mergeSorted(VrisagU8E23R other) {
		
		VrisagU8E23R r = new VrisagU8E23R();

		ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();

		//copy elements from this object
		for (int i = 0; i < this.values.size(); i++) {
			sortedArrayList.add(this.values.get(i));
		}

		// Copy elements from other object
		for (int i = 0; i < other.values.size(); i++) {
			sortedArrayList.add(other.values.get(i));
		}

		//sorting the merged list using bubble sort
		int n = sortedArrayList.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (sortedArrayList.get(j) > sortedArrayList.get(j + 1)) {
					// Swap elements
					int tmp = sortedArrayList.get(j);
					sortedArrayList.set(j, sortedArrayList.get(j + 1));
					sortedArrayList.set(j + 1, tmp);
				}
			}
		}

		// Add sorted elements to result object
		for (int i = 0; i < sortedArrayList.size(); i++) {
			r.add(sortedArrayList.get(i));
		}

		return r;
	}

}//End class


