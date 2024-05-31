package Unit5;

public class VrisagU5E6R {

	//instantiates the instance variables
	private int dVotes;
	private int rVotes;
	private boolean votingStatus;
	
	//default method to initialize the instance variables
	public VrisagU5E6R() {
		dVotes = 0;
		rVotes = 0;
		votingStatus = true;
		
	}
	
	//method to clear the machine, resets all the votes
	public void clear() {
        dVotes = 0;
        rVotes = 0;
        System.out.println("Voting machine state cleared.");
    }
	
	//method to increase democrat vote by one and report to the user
	public void voteD() {
		dVotes++;
		System.out.println("Voted for Democrat");
	}
	
	//method to increase republican vote by one and report to the user
	public void voteR() {
		rVotes++;
		System.out.println("Voted for Republican");
	}
	
	//method to get the final amounts
	public void getTallies() {
        System.out.println("Democrat Votes: " + dVotes);
        System.out.println("Republican Votes: " + rVotes);
    }
	
	//method for the while loop conditional
	public boolean vStat(String s) {
		
		//if user input is q then the status will turn false which stops the while loop
		if (s.equals("q")) {
			votingStatus = false;
		}
		
		//returns the boolean
		return votingStatus;
		
	}

}//End class
