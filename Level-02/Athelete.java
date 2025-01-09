/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km */

import java.util.Scanner;

public class Athelete {
  public static void main(String[] args) {
    // Creating a Scanner object
    Scanner input = new Scanner(System.in);

    // Taking input for the sides of the triangular park
    System.out.print("Enter the first side of the triangular park in meters: ");
    double side1 = input.nextDouble();
    System.out.print("Enter the second side of the triangular park in meters: ");
    double side2 = input.nextDouble();
    System.out.print("Enter the third side of the triangular park in meters: ");
    double side3 = input.nextDouble();

    // Calculating the perimeter of the triangular park
    double perimeter = side1 + side2 + side3;

    // Calculating the number of rounds needed to complete 5 km
    double totalDistance = 5000;
    double rounds = totalDistance / perimeter;

    // Printing the result
    System.out
        .println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");
    // Closing the scanner
    input.close();
  }
}
