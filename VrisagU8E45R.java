package Unit8;
import java.util.ArrayList;
import java.util.Scanner;

public class VrisagU8E45R {

	//creates all of the arrayLists
	private ArrayList <String> customer = new ArrayList<String>();
	private ArrayList <Double> moneySpent = new ArrayList<Double>();
	private ArrayList <String> bestConfirmedCustomers = new ArrayList<String>();
	private Scanner input = new Scanner(System.in);

	//method to add the sale into arrayLists
	private void addSale(String customerName, double amount) {
		customer.add(customerName);
		moneySpent.add(amount);
	}

	private String nameOfBestCustomer() {
		
		//creates a index variable because the enhanced for loop does not have one 
		int index = 0;
		//makes a variable to hold the greatest number 
		double greatest = 0.0;

		//enhanced for loop to iterate through all elements in customer bills
		for (Double i : moneySpent) {
			
			//if statement to get the greatest amount of money spent
			if (i>greatest) {
				greatest = moneySpent.get(index);
			}

		}

		//enhanced for loop to find the index of the greatest
		for (Double i : moneySpent) {

			//if statement that breaks the for loop if it finds the greatest number
			if (i==greatest) {
				break;
			}

			//index is incremented 
			index++;

		}

		//returns the customer who spent the most 
		return customer.get(index);



	}

	public void transaction(){
		
		//amounts starts at zero
		double amount = 1.0;

		//while loop that loops until user enters value of zero
		while (amount != 0.0) {
			
			//gets customer name and how much they spent 
			System.out.println("What is customer name: ");
			String name = input.next();

			System.out.println("Enter " + name + "'s amount:");
			amount = input.nextDouble();

			//uses the add sale method 
			addSale(name, amount);	

		}

	}

	private ArrayList<String> nameOfBestCustomer(int topN) {
		
	    //makes a copy of the arrayLists to not modify the original arrayList and customer data
	    ArrayList<Double> copyMoneySpent = new ArrayList<>(moneySpent);
	    ArrayList<String> copyCustomer = new ArrayList<>(customer);
	    
	    //for loop that stops at the top number of customers and before the money spent arraylist is empty to avoid out of bounds error
	    for (int i = 0; i < topN && !copyMoneySpent.isEmpty(); i++) {
	    	
	    	//creates index and greatest variable 
	        int index = 0;
	        double greatest = 0.0;

	        //enhanced for loop similar from before to find the greatest purchase and the index
	        for (int j = 0; j < copyMoneySpent.size(); j++) {
	        	
	            if (copyMoneySpent.get(j) > greatest) {
	                greatest = copyMoneySpent.get(j);
	                index = j;
	            }
	        }

	        //adds the name of the current best customer 
	        bestConfirmedCustomers.add(copyCustomer.get(index));

	        //removes them from the copy array list so they aren't considered for the next iteration of best customer
	        copyMoneySpent.remove(index);
	        copyCustomer.remove(index);
	    }

	    //returns the arraylist of best customers 
	    return bestConfirmedCustomers;
	}

	//printer method 
	public void printer() {
		System.out.println("Congrats " + nameOfBestCustomer() + "! You are the best customer!");
		System.out.println("Enter top number of people: ");
		int topNum = input.nextInt();
		System.out.println("The top Customers are" + nameOfBestCustomer(topNum));
	}

}//End class
