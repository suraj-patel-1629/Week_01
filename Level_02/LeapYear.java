
/*Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators
*/
import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        // Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking user input for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // checking year us leap year or not
        if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
