package Unit3;

public class VrisagU3E8R {
	
	//method checks if a triangle is obtuse
	public void checkObtuse(int angle1, int angle2, int angle3) {
		
		//if any of the triangle angles are more than 90, then it is an obtuse
		if ( angle1 > 90 || angle2 > 90 || angle3 > 90) {
			System.out.println("This triangle is obtuse");
		}
	}
	
	//method checks if an triangle is acute
	public void checkAcute(int angle1, int angle2, int angle3) {
		
		//if all of the angles are less than 90, then it is acute
		if ( angle1 < 90 && angle2 < 90 && angle3 < 90) {
			System.out.println("This triangle is acute");
		}
	}
	
	//method that checks if it is a triangle is a right triangle
	public void checkRight(int angle1, int angle2, int angle3) {
		
		//if any of the sides is 90, then it is a right triangle
		if ( angle1 == 90 || angle2 == 90 || angle3 == 90) {
			System.out.println("This triangle is a right triangle");
		}
	}
	
}//End class
