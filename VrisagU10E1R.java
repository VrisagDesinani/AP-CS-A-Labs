package Unit10;

public class VrisagU10E1R {
	
	//creates the rectangle and height instance variables
	int width = 10;
	int height = 3;
	int area;

	//recursive method that adds on to areas
    public void getArea() {
        
    	area = width*height;
    	System.out.print(area + ", ");
    	width-=1;
    	if (width > 0) {
    		getArea();
    	}
    	
    }
    

}//End class
