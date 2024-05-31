package Unit9;

public class Student extends Person {

	//instantiates the instance variables
	private String degreeType;
	private int graduationYear;

	public Student(String firstName, String lastName, String homeTown, String degreeType, int graduationYear) {

		//initializes all the variables
		super(firstName, lastName, homeTown);
		this.degreeType = degreeType;
		this.graduationYear = graduationYear;
	}


	//printer method
	public void printer() {
		System.out.println("Student: " + firstName + " " + lastName + ", Home town: " + homeTown + ", studying " + degreeType + ", graduating in " + graduationYear);
	}

}//End class
