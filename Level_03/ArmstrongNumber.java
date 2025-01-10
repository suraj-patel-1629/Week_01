import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Creating a scanner object to take user input
        Scanner input = new Scanner(System.in);

        // taking input number from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Storing the original number for comparison later
        int originalNumber = number;

        int sum = 0;

        while (number != 0) {
            // the last digit of the number using modulus operator
            int digit = number % 10;

            // Calculating the cube of the digit and add it to the sum
            sum += digit * digit * digit;

            // Removing the last digit from the number
            number /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Closing the scanner
        input.close();
    }
}
