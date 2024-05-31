package Unit2;


public class VrisagU2E1D {
	

	public static void main(String[] args) {
		
		//declares all the shapes and arguments
		VrisagU2E1R shape1 = new VrisagU2E1R();
		VrisagU2E1R shape2 = new VrisagU2E1R(3.0);
		VrisagU2E1R shape3 = new VrisagU2E1R(3.0, 2.0);
		
		//declares the print 
		VrisagPrint print = new VrisagPrint();
		
		//calculates the area for each of the shapes
		double area1 = shape1.area();
		double area2 = shape2.area();
		double area3 = shape3.area();
		
		//prints the area for each of the shapes 
		VrisagPrint.printArea(area1);
		VrisagPrint.printArea(area2);
		VrisagPrint.printArea(area3);
		
		
	}//End main 

}//End class
