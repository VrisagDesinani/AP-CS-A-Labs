package Unit5;

public class VrisagU5E1RBankAccount {
	
	//creates a private instance variable balance 
	protected double balance;
	
	//default constructor
	public VrisagU5E1RBankAccount(){
		balance = 0;
	}
	
	//a one argument constructor
	public VrisagU5E1RBankAccount(double bal1){
		balance = bal1;
	}
	
	//method to add the deposit to the account
	public void deposit(double deposit1) {
		balance+=deposit1;
	}
	
	//method to subtracts the withdrawal to the account
	public void withdraw(double withdraw1) {
		balance-=withdraw1;
	}
	
	//returns the final balance
	public double finalBalance() {
		return balance;
	}
	
}//End class
