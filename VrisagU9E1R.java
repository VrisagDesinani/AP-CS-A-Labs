package Unit9;

import Unit5.VrisagU5E1RBankAccount;
import java.util.Scanner;

public class VrisagU9E1R extends VrisagU5E1RBankAccount {

	//initialize the scanner
	Scanner input = new Scanner(System.in);
	String request = " ";

	public void overdraft() {

		super.deposit(50.0);

		System.out.println("Bank Account Balance: $" + super.balance);

		System.out.println("How much do you wish to widthraw?");
		double withdraw = input.nextDouble();

		if (withdraw > super.balance) {
			System.out.println("Your withdrawal is more than your balance. Do you wish to overdraft up to $200 for a $45 fee? \"Y\" for yes, \"N\" for no.");
			request = input.next();
		}

		else if (withdraw < super.balance) {
			System.out.println("Your balance is: " + (super.balance - withdraw));
		}


		if (request.equalsIgnoreCase("Y")) {
			
			boolean cond = false;
			
			while (!cond) {
			
			if (withdraw > 200.0+super.balance) {
				System.out.println("Invalid overdraft, enter again");
				withdraw = input.nextDouble();
			}
			
			if (withdraw <= 200.0+super.balance) {
				cond = true;
			}
			
			}

				System.out.print("Your new account balance is: " + ((super.balance - withdraw) - 45.0));

		}

		if (request.equalsIgnoreCase("N")) {

			//gets the overdraft from the user
			System.out.println("Your balance is: " + super.balance);


		}


	}

}//End class
