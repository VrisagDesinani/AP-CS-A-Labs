package Unit10;

import java.util.ArrayList;

public class VrisagU10E3D {
	
	 public static void main(String[] args) {
		 
		 	//creates the resource object and uses the methods
		 	VrisagU10E3R r = new VrisagU10E3R();
		 	
		 	ArrayList<String> spellings = r.findSpellings("5282");
		    r.printSpellings("5282", spellings);
		    
	    }//End main

}//End class
