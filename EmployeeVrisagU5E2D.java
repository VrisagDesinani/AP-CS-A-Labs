package Unit5;

public class EmployeeVrisagU5E2D {

	public static void main(String[] args) {
		
		//initializes the resource class with respective constructors 
		EmployeeVrisagU5E2R r = new EmployeeVrisagU5E2R("Vrisag", 100000);
		
		//calls on the methods with respective constructors 
		r.getName();
		r.getSalary();
		r.raiseSalary(4);
		
	}//End main

}//End class
