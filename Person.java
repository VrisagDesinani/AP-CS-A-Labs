package Unit9;


public class Person {
	
	protected String firstName;
	protected String lastName;
	protected String homeTown; 
	
	public Person(String firstName, String lastName, String homeTown) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.homeTown = homeTown; 
	}
	
	public void printer() {
        System.out.println("Person: " + firstName + " " + lastName + ", Home town: " + homeTown);
    }

}
