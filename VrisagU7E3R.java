package Unit7;
import java.util.Scanner;

public class VrisagU7E3R {

	//initializes a scanner
    Scanner input = new Scanner(System.in);
    
    //creates the seating array which cannot be changed 
    private final String[][] seating = {
            {"10", "10", "10", "10", "10", "10", "10", "10", "10", "10"},
            {"10", "10", "10", "10", "10", "10", "10", "10", "10", "10"},
            {"10", "10", "10", "10", "10", "10", "10", "10", "10", "10"},
            {"10", "10", "20", "20", "20", "20", "20", "20", "10", "10"},
            {"10", "10", "20", "20", "20", "20", "20", "20", "10", "10"},
            {"10", "10", "20", "20", "20", "20", "20", "20", "10", "10"},
            {"20", "20", "30", "30", "40", "40", "30", "30", "20", "20"},
            {"20", "30", "30", "40", "50", "50", "40", "30", "30", "20"},
            {"30", "40", "50", "50", "50", "50", "50", "50", "40", "30"}
    };

    public void checkAvailability() {

    	//creates and price and conditional variable
        String price = "";
        Boolean cond = true;
        
        //nested enhanced for loop to print all all of the values in the seating array
    	for (String[] i : seating) {
    		for (String j : i) {
    			System.out.print(j + " ");
    		}
    		System.out.println();
    	}
        
       

        //while loop to run until the conditional is false 
        while (cond) {
        	
        	System.out.println("Do you want to enter seat price or location. Enter \"price\" or \"location\". Enter \"q\" to quit");
        	String type = input.next();
        	
        	//if the input is q then the while loop breaks
            if (type.equals("q")) {
                cond = false;
                break;
            }
        	
        	if (type.equals("price")) {
        	
        	System.out.println("Enter a seat price or \"q\" to exit");
        	//gets the price from user
            price = input.next();
            
            
          
            //creates the another boolean to see for booking the seats 
            boolean seatBooked = false;

            //nested for loop to iterate though every element
            for (int i = 0; i < seating.length; i++) {
                for (int j = 0; j < seating[i].length; j++) {
                	//if the seating price is available with price specified then it replaced that seat with an * to show it has been taken
                    if (seating[i][j].equals(price)) {
                        seating[i][j] = "0";
                        System.out.println("Seat booked! To book another seat type a price, below is the seating ");
                        seatBooked = true;
                        //exit the inner loop once a seat is booked
                        break;  
                    }
                }
                
                //if seat has been booked then outer loop is exited
                if (seatBooked) {
                    break;  
                }
                
            }
            
            //if the seat hasn't been booked then either it is not available or the price entered is incorrect
            if (!seatBooked) {
                System.out.println("This is not an eligible seat or the price range is full, try again");
            }
            
            }
        	
        	else if (type.equals("location")) {
        		
        		System.out.println("What row number. 1 is the first row and 9 is the last");
        		int row = input.nextInt();
        		System.out.println("What columnnumber. 1 is the first column and 10 is the last");
        		int col = input.nextInt();
        		
        		seating[row-1][col-1] = "0";
        		
        		System.out.println("Here are your seats so far: ");
        		
        	}
        	
        	else {
        		System.out.println("Input was not valid, enter again");
        	}
        	
        	
        	 //nested enhanced for loop to print all all of the values in the seating array
        	for (String[] i : seating) {
        		for (String j : i) {
        			System.out.print(j + " ");
        		}
        		System.out.println();
        	}
        	
            
        }
           
         

        
    }
    
    
}//End class
