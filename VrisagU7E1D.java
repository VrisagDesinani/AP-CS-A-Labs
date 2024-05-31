package Unit7;

public class VrisagU7E1D {

	public static void main(String[] args) {
		
		VrisagU7E1R r = new VrisagU7E1R();
		
		//code is what contains the area code
		String code = r.input();
		
		//uses the method from the driver class
		r.lookup(code);

	}//End Main 

}//End class 
