package Unit10;

public class VrisagU10E2R {

	//creates the rectangle and height instance variables
	int sideLength = 5;
	int area;

	
	//recursive method to get area
    public void getArea() {
        
    	area = sideLength*sideLength;
    	System.out.print(area + ", ");
    	sideLength-=1;
    	if (sideLength > 0) {
    		getArea();
    	}
    	
    }

}//End class
