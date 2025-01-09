/*
 * Write a Temperature Conversion program, given the temperature in Fahrenheit as
 * input outputs the temperature in Celsius
 * Hint =>
 * Create a fahrenheit variable and take the user's input
 * User the formulae to convert Fahrenheit to Celsius: (°F − 32) x 5/9 = °C and
 * assign the result to celsiusResult and print the result
 * I/P => fahrenheit
 * O/P => The ____ fahrenheit is _____ celsius
 */

//importing the scanner class
import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    //// Creating a Scanner object
    Scanner input = new Scanner(System.in);

    // Taking input for temperature in Fahrenheit
    System.out.print("Enter the temperature in Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    // Converting Fahrenheit to Celsius
    double celsiusResult = (fahrenheit - 32) * 5 / 9;

    // Printing the result
    System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    // Closing the scanner
    input.close();
  }
}