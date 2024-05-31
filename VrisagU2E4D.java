package Unit2;
/*This class will calculate the years, months, days, minutes and seconds a person have
been living on Earth.
*/
//imports
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class VrisagU2E4D { //start class
    public static void main(String[] args) { //start main
        Scanner kb = new Scanner(System.in);
        int daysAlive = 0;
        double minutesAlive = 0.0;
        double hoursAlive = 0.0;
        double secondsAlive = 0.0;
        int month = 0; // this variable must be used when using period to find the number of months alive  
        int monthNumber = 0;

        //get todays date
        LocalDate dateNow = LocalDate.now();

        //ask for a birthday
        System.out.println("Enter your birthday (YYYY-MM-DD): ");
        String birthdayInput = kb.nextLine();
        LocalDate birthday = LocalDate.parse(birthdayInput);

        //calculate the period between today and the user birthday
        Period period = Period.between(birthday, dateNow);

        //get years, months, and days from birthday
        int yearsAlive = period.getYears();
        int monthsAlive = period.getMonths();
        int daysAlive1 = period.getDays();

        //get days alive
        daysAlive = daysAlive1;

        //ask user for the number of months
        System.out.print("Enter the number of months: ");
        month = kb.nextInt();

        /* this forloop and switch statement will allow each month since your last birthday to be correctly 
        counted in the number of days you have been alive. 
        Enter the number month from the next month to the current month. Example, if bday is
        september and today is july, you would enter 10, 11, 12, 1, 2, 3, 4, 5, 6, 7.
        */
        
        for (int i = 0; i < month; i++) {
            System.out.println("Please enter the number of the month: January = 1, Feb = 2, March = 3, ");
            System.out.println("April = 4, May = 5, June = 6, July = 7, Aug = 8, Sep = 9, Oct = 10, Nov = 11, Dec = 12");
            monthNumber = kb.nextInt();

            switch (monthNumber) {
                case 1:
                    daysAlive += 31;
                    break;

                case 2:
                    daysAlive += 28;
                    break;

                case 3:
                    daysAlive += 31;
                    break;

                case 4:
                    daysAlive += 30;
                    break;

                case 5:
                    daysAlive += 31;
                    break;

                case 6:
                    daysAlive += 30;
                    break;

                case 7:
                    daysAlive += 31;
                    break;

                case 8:
                    daysAlive += 31;
                    break;

                case 9:
                    daysAlive += 30;
                    break;

                case 10:
                    daysAlive += 31;
                    break;

                case 11:
                    daysAlive += 30;
                    break;

                case 12:
                    daysAlive += 31;
                    break;

                default:
                    i--;
                    System.out.println("You entered an incorrect number, please try again");
            }
        }// end for

        //calculates days, hours, and minutes 
        hoursAlive = daysAlive * 24.0;
        minutesAlive = hoursAlive * 60.0;
        secondsAlive = minutesAlive * 60.0;
        
        //print the amount of time
        System.out.println("Its been:");
        System.out.println(yearsAlive + " years");
        System.out.println(monthsAlive + " months");
        System.out.println(daysAlive + " days");
        System.out.println(hoursAlive + " hours");
        System.out.println(minutesAlive + " minutes");
        System.out.println(secondsAlive + " seconds");
        System.out.println(" since the day you were born");
        
    }//End main
    
}//End class
