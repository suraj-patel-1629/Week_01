/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___ */

import java.util.Scanner;

public class SimpleInterestCalculator {
  public static void main(String[] args) {
    // Creating a Scanner object
    Scanner input = new Scanner(System.in);

    // Taking input for Principal, Rate, and Time
    System.out.print("Enter the Principal amount: ");
    double principal = input.nextDouble();
    System.out.print("Enter the Rate of Interest in %: ");
    double rate = input.nextDouble();
    System.out.print("Enter the Time in years: ");
    double time = input.nextDouble();

    // Calculating Simple Interest
    double simpleInterest = (principal * rate * time) / 100;

    // Printing the result
    System.out.println("The Simple Interest is " + simpleInterest +
        " for Principal " + principal + ", Rate of Interest " + rate + "%, and Time " + time + " years.");
    // Closing the scanner
    input.close();
  }
}
