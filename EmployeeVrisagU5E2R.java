package Unit5;

public class EmployeeVrisagU5E2R {
	
	//creates the private instance variables
	private String name;
	private double salary;
	
	//default constructor with arguments 
	public EmployeeVrisagU5E2R(String name1, double salary1) {
		name = name1;
		salary = salary1;
	}
	
	//method to return name
	public String getName() {
		return name;
	}
	
	//method to return salary
	public double getSalary() {
		return salary;
	}
	
	//method that takes in percent and does appropriate calculations and prints the initial and final values 
	public void raiseSalary(double percent) {
		
		//prints out initial name and salary
		System.out.println("Employee name is " + name+ " and old salary is: " + salary);
		
		//calculation for the new salary with raise
		double raise = percent * 0.01;
		salary = salary + (salary*raise);
		
		//prints out the raise and the final salary with the raise
		System.out.println("The percentage increased is " + percent +" and the new salary is " + salary);
		
	}

}//End class
