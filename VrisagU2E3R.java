package Unit2;



public class VrisagU2E3R {
	
	
	//method for calculate the number
	public static void randomNum() {
		
		//the random number for the first three digits 
		int first = (int) (100+(Math.random()*899));
		
		//the random number for the second two digits 
		int second = (int) (10+(Math.random()*89));
		
		//the random number for the third four digits 
		int third = (int) (1000+(Math.random()*8999));
		
		//puts the numbers together with the dash and prints
		System.out.println(first+ "-" + second + "-" + third);
		
	}
	
	

}//End main 
