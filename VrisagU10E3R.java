package Unit10;
import java.util.ArrayList;

public class VrisagU10E3R {

	//method to find spellings for a given number
	public ArrayList<String> findSpellings(String number) {
        ArrayList<String> result = new ArrayList<>();
        findSpellingsRecursive(number, "", 0, result);
        return result;
    }

	//method to find spellings
    public void findSpellingsRecursive(String number, String current, int index, ArrayList<String> result) {
    	
        if (index == number.length()) {
            result.add(current);
            //used prevent and index out of range error
            return;
        }

        char digit = number.charAt(index);
        char[] letters = getLetters(digit);

        //nested recursive and enhanced for loop to get every possible combination
        for (char letter : letters) {
            findSpellingsRecursive(number, current + letter, index + 1, result);
        }
    }

    //gets the lettered at certain numbers 
    public char[] getLetters(char digit) {
    	 if (digit == '2') {
             return new char[]{'a', 'b', 'c'};
         } 
    	 else if (digit == '3') {
             return new char[]{'d', 'e', 'f'};
         } 
    	 else if (digit == '4') {
             return new char[]{'g', 'h', 'i'};
         } 
    	 else if (digit == '5') {
             return new char[]{'j', 'k', 'l'};
         } 
    	 else if (digit == '6') {
             return new char[]{'m', 'n', 'o'};
         } 
    	 else if (digit == '7') {
             return new char[]{'p', 'q', 'r', 's'};
         } 
    	 else if (digit == '8') {
             return new char[]{'t', 'u', 'v'};
         } 
    	 else if (digit == '9') {
             return new char[]{'w', 'x', 'y', 'z'};
         } 
    	 else {
             return new char[]{};
         }
    }

    //printer method to print out the combinations
    public void printSpellings(String number, ArrayList<String> spellings) {
        System.out.print("Spellings for " + number + ": ");
        for (int i = 0; i < spellings.size(); i++) {
       
            System.out.print(spellings.get(i) + ", ");
        }
        System.out.println();
    }
    
}//End class
