package Unit5;
import java.util.Scanner;

public class VrisagU5E1DBATester {

	public static void main(String[] args) {
		
		//initializes the resource class
		VrisagU5E1RBankAccount r = new VrisagU5E1RBankAccount();
		
		//methods with their respective arguments
		r.deposit(2500);
		r.withdraw(600);
		r.withdraw(700);
		
		//prints the final balance using the return method
		System.out.println("The balance of your account is: " + r.finalBalance());

	}//End main

}//End class
