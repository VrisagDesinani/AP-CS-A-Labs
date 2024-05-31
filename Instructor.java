package Unit9;

public class Instructor extends Person {

	//instantiates the instance variables
	private String subjectTaught;

	//initializes all the variables
	public Instructor(String firstName, String lastName, String homeTown, String subjectTaught) {
		super(firstName, lastName, homeTown);
		this.subjectTaught = subjectTaught;
	}

	//printer method
	public void printer() {
        System.out.println("Instructor: " + firstName + " " + lastName + ", Home town: " + homeTown  + ", teaching " + subjectTaught);
    }

}
