/*Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___ */

// importing scanner class 
import java.util.Scanner;

public class WeightConvertor {
  public static void main(String[] args) {
    // Creating a Scanner object
    Scanner input = new Scanner(System.in);

    // Taking input from user for weight in pounds
    System.out.print("Enter the weight in pounds: ");
    double weightInPounds = input.nextDouble();

    // Converting weight from pounds to kilograms
    double weightInKilograms = weightInPounds / 2.2;

    // Printing the result
    System.out.println("The weight of the person in pounds is " + weightInPounds +
        " and in kilograms is " + weightInKilograms + ".");
    // Closing the scanner
    input.close();
  }
}
