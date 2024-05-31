package Unit5;

public class CarVrisagU5E3D {

	//initializes the private instance variables
	private double fEfficiency;
	private double fInTank;

	//default constructor to give values to the instance variables
	public CarVrisagU5E3D(double efficiency){

		fEfficiency = efficiency;
		fInTank = 0;

	}

	//drive method that takes in how much the user wants to drive
	public void drive(double distance) {

		//if there isn't enough fuel to drive inputed distance, then error message will print
		if (distance / fEfficiency > fInTank) {
			System.out.println("Dummy, there isn't enough fuel to drive that far");
		}

		//else code continues as normal and prints final fuel in tank with the amount of distance traveled
		else {

			//calculates final fuel in tank
			fInTank -= distance / fEfficiency;
			System.out.println("Drove " + distance + " miles. Remaining fuel: " + fInTank);
		}

	}

	//returns the gas in tank
	public double getGasInTank() {
		return fInTank;
	}

	//method to add gas to the car
	public void addGas(double gallons) {
		fInTank += gallons;
		System.out.println("Added " + gallons + " gallons of gas. Current fuel level: " + fInTank);
	}


	public static void main(String[] args) {

		//Initializes resource class with respective constructor
		CarVrisagU5E3D r = new CarVrisagU5E3D(25);

		//method to add gas to the car
		r.addGas(10);

		//method to drive the car, if the car does not have enough fuel to drive that distance, error message is printed
		r.drive(150);


	}//End main

}//End class
