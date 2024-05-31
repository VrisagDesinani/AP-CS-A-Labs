package Unit2;

public class VrisagU2E1R {
	
	//initializes length and width
	double length;
	double width;

	//default constructor
	public VrisagU2E1R() {
		length = 0.0;
		width = 0.0;
	}
	
	//default constructor with one argument
	public VrisagU2E1R(double side) {
	    length = side;
		width = side;
	}
	
	//default constructor with two arguments 
	public VrisagU2E1R(double side1, double side2) {
	    length = side1;
		width = side2;
	}
	
	//constructor with no arguments that calculates the area and returns it  
	public double area(){
		double area = length * width;
		return area;
		
	}
	
	//constructor with 1 argument that calculates the area and returns it  
	public double area1(double width1) {
		double area = width1*width1;
		return area;
		
	}
	
	//constructor with 2 arguments that calculates the area and returns it  
	public double area2(double width1, double width2) {
		double area = width1 * width2;
		return area;
	}
	
	

}//End Class