package Unit5;

public class VrisagU5E5R {

	//instantiating the variables
	private int time;
	private int powerLevel; 

	//default constructor to initialize the variables
	public VrisagU5E5R() {
		time = 0;
		powerLevel = 1; 
	}

	// Method to increase time by 30 seconds
	public void increaseTime() {
		time += 30;
		System.out.println("Time increased to " + time + " seconds.");
	}

	//method to switch between power levels one and two
	public void switchPL() {
		
		//if power level is one and it is switched, it goes to two, else it goes to one
		if (powerLevel == 1) {
			powerLevel = 2;
		} 
		else {
			powerLevel = 1;
		}
		
		//prints power level
		System.out.println("Power level switched to " + powerLevel + ".");
	}

	//method to reset the microwave
	public void reset() {
		time = 0;
		powerLevel = 1; 
		System.out.println("Microwave reset");
	}

	//method to start cooking
	public void start() {
		
		//prints the final statement with time and power level
		System.out.println("Cooking for " + time + " seconds at power level " + powerLevel + ".");
	}

}//End class
