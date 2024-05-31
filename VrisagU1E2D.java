package Unit1;

/*
 Write a class called YourNameU1E2R.This assignment will consist of you leaning more about the modulus operator and how it is used. 
a.       On line 1 enter import java.util.Scanner
On l;ine 2 empty line
On line 3 public class YourNameU1E2R
On line 4, empty line
On line 5 Scanner kb = new Scanner(System.in);
The write the following method
public void pause(){
      int stop = kb.nextInt();
   }

B. Create 4 int variables. These need to be declared and initialized as instance variables. 
(example names smallEvenInt, largeEvenInt, smallOddInt, largeOddInt)
C.  Assign a small even number to one int and small odd number to one double. (2-5)
D. Write a method called smallEvenIntMod. 
Write code that will take the even int % 1 (intMod1 = evenInt % 1).
Duplicate the previous line using 2, 3, 4, 5, 6 and 10, 15, and 20. Print the results using the println statement. 
Example 
           System.out.println("smallEvenInt "+smallEvenInt+" % 1 is " + intMod1);
 Analyze the data and write a summary. There are two aspects of modulus I am looking for: 
1. What evenInt % a smaller number does. 
2. What evenInt % a larger number does and WHY?
E.     Write a method called smallOddIntMod
Duplicate the previous line using 2, 3, 4, 5, 6 and 10, 15, and 20. Print the results using the println statement. 
Example 
           System.out.println("smallOddInt "+smallOddInt+" % 1 is " + intMod1);
 Analyze the data and write a summary. There are two aspects of modulus I am looking for: 
1. What oddInt % a smaller number does. 
2. What oddInt % a larger number does and WHY?
F.     Assign a large even number to the variable for a large even int and large odd int. (60 - 90)
G. Write a method called LargeEvenIntMod. 
Write code that will take the even int % 1 (intMod1 = evenInt % 1).
Duplicate the previous line using 2, 3, 4, 5, 6 and 10, 15, and 20. Print the results using the println statement. 
Example 
           System.out.println("largeEvenInt "+largeEvenInt+" % 1 is " + intMod1);
 Analyze the data and write a summary. There are two aspects of modulus I am looking for:
1. What evenInt % a smaller number does. 
2. What evenInt % a larger number does and WHY?
H.     Write a method called largeOddIntMod
Duplicate the previous line using 2, 3, 4, 5, 6 and 10, 15, and 20. Print the results using the println statement. 
Example 
           System.out.println("largeOddInt "+largelOddInt+" % 1 is " + intMod1);
 Analyze the data and write a summary. There are two aspects of modulus I am looking for:
1. What oddInt % a smaller number does. 
2. What oddInt % a larger number does and WHY?
H.       Questions to answer
 i.      Why are some of the answers 0?
Ii. Why are some of the answers 1?
                         iii.      Why are some of the answers the int number you are dividing by?
	Iv. How can the modulus operator be used to determine if a number is odd or even?
Write the class YourNameU1E2D. Call each method from YourNameU1E2R.

 */

public class VrisagU1E2D {

	//instantiating the variables 
	int even1;
	int odd1;
	double even2;
	double odd2;

	//main method 
	public static void main(String[] args) {

		//this gives the variables a value
		int even1 = 2;
		int odd1 = 3;
		double even2 = 4.4;
		double odd2 = 5.5;


		//this prints the modulas for each of the values 
		System.out.println("Number "+even1 +"'s modulas are: " + even1%1 + ", " + even1%2 + ", " + even1%3 + ", " + even1%4 + ", " + even1%5 + ", " + even1%10 + ". ");
		System.out.println("Number "+odd1 +"'s modulas are: " + odd1%1 + ", " + odd1%2 + ", " + odd1%3 + ", " + odd1%4 + ", " + odd1%5 + ", " + odd1%10 + ". ");
		System.out.println("Number "+even2 +"'s modulas are: " + even2%1 + ", " + even2%2 + ", " + even2%3 + ", " + even2%4 + ", " + even2%5 + ", " + even2%10 + ". ");
		System.out.println("Number "+odd2 +"'s modulas are: " + odd2%1 + ", " + odd2%2 + ", " + odd2%3 + ", " + odd2%4 + ", " + odd2%5 + ", " + odd2%10 + ". ");

		//f.
		System.out.println("When putting in the small numbers, I sometimes get modulas that are repeated. This is because if the number is smaller than the denominator, then the numerator will always be the output");

		//g.
		System.out.println("When putting in the big numbers, the numbers are rarely ever repeated. This is because the numerator is always bigger than the denominator, and a different value will be likely."); 

		//h.
		System.out.println("i. The int answers are the remainders when the number is divided by the two integers");
		System.out.println("ii. For example %1 always gives me an answer of zero because there is no remainder when something is divided by one");
		System.out.println("iii. The double answers are the same as the int answers but the value always ends with a decimal or .0");
		System.out.println("iv. The double answers mean that if a the numerator of the modulas is smaller than the denominator, then the result will be the numerator");
		System.out.println("v. The similarities between ints and doubles is that the number before the decimal point will always be the same, no matter if it is int or double");
		System.out.println("vi. The difference between ints and doubles is that ints cannot have decimal points while doubles can.");



		//for loop is created
		for (int i=2; i<102; i++) {

			//if you divide i by 1 and get zero as the remainder, which will always happen, on a new line say i is a multiple of one
			if(i%1==0) { 
				System.out.print("\n" + i + " is a multiple of 1");
			}

			//if you divide i by 2 and get zero as the remainder, add on to the print saying that 2 is a multiple
			if(i%2==0) {
				System.out.print(", 2");
			}

			//if you divide i by 3 and get zero as the remainder, add on to the print saying that 3 is a multiple
			if(i%3==0) {
				System.out.print(", 3");
			}

			//if you divide i by 4 and get zero as the remainder, add on to the print saying that 4 is a multiple
			if(i%4==0) {
				System.out.print(", 4");
			}

			//if you divide i by 4 and get zero as the remainder, add on to the print saying that 4 is a multiple
			if(i%5==0) {
				System.out.print(", 5");
			}




		} // end for loop

		System.out.println("\nThis tells us that the == operator does not assign a value, but rather check if the left side of the == and the right side of the == are the same thing");

	} // end main 

} // end class 
