package Unit2;
import java.awt.Rectangle;

public class VrisagU2E2D {


	public static void main(String[] args) {
		
		//declares a rectangle and its width and height
		Rectangle rect = new Rectangle(10,15);
		
		//gets the width and height from the declaration
		double width = rect.getWidth();
		double height = rect.getHeight();
		
		//calculates the perimeter
		double perimeter = 2*(width+height);
		
		//prints the perimeter
		VrisagPrint.printPerimeter(perimeter);
		
	}//End main 
	


}//End class
