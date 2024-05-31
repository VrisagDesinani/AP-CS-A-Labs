package Unit9;

public class VrisagU9E2D {

	public static void main(String[] args) {
		
		//using objects
        Person person = new Person("Joe", "Biden", "DC");
        Student student = new Student("Vrisag", "Desinani", "Aldie", "High School", 2026);
        Instructor instructor = new Instructor("Dr.", "Buskey", "Aldie", "Computer Science");
        
        //using the printing methods from each of the classes
        person.printer();
        student.printer();
        instructor.printer();

	}//End main

}//End class
