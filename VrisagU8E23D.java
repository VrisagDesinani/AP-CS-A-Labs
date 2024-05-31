package Unit8;

public class VrisagU8E23D {

	public static void main(String[] args) {
		
		//creates the first sequence
	    VrisagU8E23R a = new VrisagU8E23R();
	    a.add(1);
	    a.add(4);
	    a.add(9);
	    a.add(16);
	    
	    //creates the second sequence
	    VrisagU8E23R b = new VrisagU8E23R();
	    b.add(9);
	    b.add(3);
	    b.add(4);
	    b.add(9);
	    b.add(11);
	    
	    //uses and prints the methods from the resource object
	    VrisagU8E23R r = a.append(b);
	    System.out.println("Appended seqence: " + r);
	    
	    VrisagU8E23R merge = a.merge(b);
	    System.out.println("The merged array is: " + merge);
	    
	    VrisagU8E23R mergedSorted = a.mergeSorted(b);
	    System.out.println("The sorted merged array is: " + mergedSorted);

	}//End main

}//End class
