import java.util.Scanner;

public class AbundantNumber {
  public static void main(String[] args) {
    // Creating a scanner object to take user input
    Scanner input = new Scanner(System.in);

    // taking the integer input from the user
    System.out.print("Enter a number: ");
    int number = input.nextInt();

    // Creating a variable to store the sum of divisors
    int sum = 0;

    for (int i = 1; i < number; i++) {
      if (number % i == 0) {

        sum += i;
      }
    }

    // Checking the sum of divisors is greater than the number itself or not
    if (sum > number) {
      System.out.println(number + " is an Abundant Number.");
    } else {
      System.out.println(number + " is Not an Abundant Number.");
    }

    // Closing the scanner
    input.close();
  }
}