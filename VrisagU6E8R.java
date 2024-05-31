package Unit6;

public class VrisagU6E8R {

	public void diceRoll() {

		//initializes the random method and creates an array of 20 values
		int diceValues[] = new int[20];

        // Generate a sequence of random dice tosses
        for (int i = 0; i < 20; i++) {
            diceValues[i] = (int) (Math.random() * 6) + 1;
        }


		//creates the variables needed to find the longest run
		int currentRun = 1;
		int longestRun = 1;
		int longestRunIndex = 0;

		//print the dice values with marking the longest run
		for (int i = 1; i < diceValues.length; i++) {
			if (diceValues[i] == diceValues[i - 1]) {
				currentRun++;
			} 
			
			else {
				// Check if the current run is longer than the longest run
				if (currentRun > longestRun) {

					//makes the current longest, the longest for now
					longestRun = currentRun;

					//gets the index of the longest run so parenthesis could latter be added 
					longestRunIndex = i - currentRun;
				}
				//resets the current run after run is complete
				currentRun = 1;
			}
		}

		//check the last run
		if (currentRun > longestRun) {
			longestRunIndex = diceValues.length - currentRun;
		}

		//print the dice values with marking the longest run
		for (int i = 0; i < diceValues.length; i++) {
			if (i == longestRunIndex) {
				System.out.print("(");
			}
			System.out.print(diceValues[i]);

			if (i == longestRunIndex + longestRun - 1) {
				System.out.print(") ");
			} 

			else {
				System.out.print(" ");
			}
		}
	}

}
