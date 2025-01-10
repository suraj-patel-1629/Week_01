
/*Create a program to count the number of digits in an integer.
Hint => 
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
 */
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Creating a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // taking the integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Storing the original number for later use
        int originalNumber = number;

        // Initialize a variable count to 0
        int count = 0;

        // Checking if the number is 0
        if (number == 0) {
            count = 1;
        } else {

            while (number != 0) {

                number /= 10;

                // Increasing the digit count
                count++;
            }
        }

        // printing the result
        System.out.println("The number " + originalNumber + " has " + count + " digits.");

        // Closing the scanner
        input.close();
    }
}
