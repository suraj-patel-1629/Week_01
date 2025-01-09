
/*
 * Create a program to find the total income of a person by taking salary and
 * bonus from user
 * Hint =>
 * Create a variable named salary and take user input.
 * Create another variable bonus and take user input.
 * Compute income by adding salary and bonus and print the result
 * I/P => salary, bonus
 * O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR
 * ___
 */

// Importing scanner class
import java.util.Scanner;

public class IncomeCalculator {
  public static void main(String[] args) {
    // Creating a Scanner object
    Scanner input = new Scanner(System.in);

    // Taking input for salary from user
    System.out.print("Enter the salary in INR: ");
    double salary = input.nextDouble();

    // Taking input for bonus from user
    System.out.print("Enter the bonus in INR: ");
    double bonus = input.nextDouble();

    // Calculating total income
    double totalIncome = salary + bonus;

    // Printing the result
    System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +
        ". Hence Total Income is INR " + totalIncome + ".");
    // Closing the scanner
    input.close();
  }
}
