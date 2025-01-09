
/* Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
Hint => 
Create a celsius variable and take the temperature as user input
Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheit Result  and print the result
I/P => celcius
O/P =>  The ____ celsius is _____ fahrenheit
*/

//importing Scanner class
import java.util.Scanner;

public class TemperatureConversion {
  public static void main(String[] args) { 
    // Creating the scanner class object
    Scanner input = new Scanner(System.in);

    // Taking input for temperature in Celsius from user
    System.out.print("Enter the temperature in Celsius: ");
    double celsius = input.nextDouble();

    // Converting Celsius to Fahrenheit
    double fahrenheitResult = (celsius * 9 / 5) + 32;

    // Printing the result
    System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

    input.close(); // Closing the scanner
  }
}