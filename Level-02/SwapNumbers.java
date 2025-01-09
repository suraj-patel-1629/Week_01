/*
 * Create a program to swap two numbers
 * Hint =>
 * Create a variable number1 and take user input.
 * Create a variable number2 and take user input.
 * Swap number1 and number2 and print the swapped output
 * I/P => number1, number2
 * O/P => The swapped numbers are ___ and ___
 */

// importing the scanner class
import java.util.Scanner;

public class SwapNumbers {
  public static void main(String[] args) {
    // Creating the Scanner object
    Scanner input = new Scanner(System.in);

    // Taking input form user for two numbers
    System.out.print("Enter the first number number1 : ");
    int number1 = input.nextInt();
    System.out.print("Enter the second number number2 : ");
    int number2 = input.nextInt();

    // Swapping the numbers with the help of temp variable
    int temp = number1;
    number1 = number2;
    number2 = temp;

    // Printing the swapped numbers
    System.out.println("The swapped numbers are: " + number1 + " and " + number2 + ".");
    // Closing the scanner
    input.close();
  }
}
