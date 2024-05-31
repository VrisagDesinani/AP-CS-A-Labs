package Unit10;
import java.util.ArrayList;
import java.util.Scanner;

public class VrisagU10E5R {

    private final ArrayList<String> Names;
    private final ArrayList<String> Numbers;

    public VrisagU10E5R() {
        // Initialize and populate the lists with dummy data
        Names = new ArrayList<>();
        Numbers = new ArrayList<>();

        Names.add("Joe");
        Numbers.add("555-1234");

        Names.add("John");
        Numbers.add("555-1235");

        Names.add("Bob");
        Numbers.add("555-1236");

        Names.add("Mark");
        Numbers.add("555-1237");

        Names.add("Michael");
        Numbers.add("555-1238");

        Names.add("Mary");
        Numbers.add("555-1239");

        Names.add("Jane");
        Numbers.add("555-1240");

        Names.add("Peter");
        Numbers.add("555-1241");

        Names.add("Parker");
        Numbers.add("555-1242");

        Names.add("Lebron");
        Numbers.add("555-1243");

        //sorts the names list because binary search only works if it is sorted
        sortNames();
    }

    //method to manually sort the names list for binary search
    private void sortNames() {
    	
    	//sorting algorithm
        for (int i = 1; i < Names.size(); i++) {
            String currentName = Names.get(i);
            String currentNumber = Numbers.get(i);
            int j = i - 1;
            while (j >= 0 && Names.get(j).compareTo(currentName) > 0) {
                Names.set(j + 1, Names.get(j));
                Numbers.set(j + 1, Numbers.get(j));
                j--;
            }
            Names.set(j + 1, currentName);
            Numbers.set(j + 1, currentNumber);
        }
    }


    //method for name lookup using binary search
    public String lookupByName(String name) {
    	
        int index = binarySearch(Names, name);
        if (index >= 0) {
            return Numbers.get(index);
        } else {
            return "Name not found";
        }
    }

    //binary search implementation
    private int binarySearch(ArrayList<String> list, String key) {
    	
    	//creates the lowest and highest index
        int low = 0;
        int high = list.size() - 1;
        
        while (low <= high) {
        	
        	//splits it in half
            int mid = low + (high - low) / 2;
            
            //gets the value if the number is less than or more than the midpoint
            int cmp = list.get(mid).compareTo(key);
            
            //if less
            if (cmp < 0) {
                low = mid + 1;
            }
            
            //if greater
            else if (cmp > 0) {
                high = mid - 1;
            } 
            
            //if neither than the result is the midpoint
            else {
                return mid;
            }
            
        }
        
        //returns 0 if algorithm doesnt work
		return 0;
        
    }

    //method for reverse lookup by phone number
    public String reverseLookupByPhoneNumber(String phoneNumber) {
        int index = Numbers.indexOf(phoneNumber);
        if (index != -1) {
            return Names.get(index);
        } else {
            return "Phone number not found";
        }
    }

    //method to display result of name lookup
    public void displayName(String name, String phoneNumber) {
        System.out.println("Lookup result for name '" + name + "': " + phoneNumber);
    }

    //method to display result of reverse lookup by phone number
    public void displayNumber(String phoneNumber, String name) {
        System.out.println("Reverse lookup result for phone number '" + phoneNumber + "': " + name);
    }
    
    //printer method
    public void printer() {
    	
    	Scanner input = new Scanner(System.in);
        System.out.print("Do you want to enter a name or number. 'Name' for name and 'number' for reverse number lookup: ");
        String cond = input.nextLine(); 
        
        if (cond.equalsIgnoreCase("name")) {
            System.out.println("Enter a name to lookup number (use capital letter to start)");
            String name = input.nextLine();
            String phoneNumberByName = lookupByName(name);
            displayName(name, phoneNumberByName);
        }
        else if (cond.equalsIgnoreCase("number")) {
            System.out.println("Enter a number to reverse lookup");
            String number = input.nextLine(); 
            String nameByPhoneNumber = reverseLookupByPhoneNumber(number);
            displayNumber(number, nameByPhoneNumber);
        }
        else {
            System.out.println("Not a valid response");
        }
        
    }
    
}//End class
