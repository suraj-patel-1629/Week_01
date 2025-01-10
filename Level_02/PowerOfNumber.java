
/*
 Create a program to find the power of a number.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power.
In each iteration of the loop, multiply the result with the number and assign the value to the result.
Finally, print the result

 */
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Creating a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking the number and power inputs from the user
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Initializing result as 1
        int result = 1;

        // Loop from 1 to power
        for (int i = 1; i <= power; i++) {
            // Multiplying result by number in each iteration
            result *= number;
        }

        // printing the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
