
/* Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___ */
import java.util.Scanner;

public class QuotientAndReminder {
  public static void main(String[] args) {
    // Creating Scanner object to take input from user
    Scanner input = new Scanner(System.in);

    // Taking input from user for First Number
    System.out.print("Enter the first number : ");
    int num1 = input.nextInt();

    // Taking input form user for second number
    System.out.print("Enter the second number: ");
    int num2 = input.nextInt();
    // Calculating quotient and remainder
    int quotient = num1 / num2;
    int remainder = num1 % num2;

    // printing output
    System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
        " of two numbers " + num1 + " and " + num2);
    // closing the Scanner
    input.close();

  }
}