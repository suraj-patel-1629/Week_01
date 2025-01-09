/* Create a program to convert distance in kilometers to miles.
Hint => 
Create a variable km and assign type as double as in double km;
Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
Use Scanner Object to take user input for km as in km = input.nextInt();
Use 1 mile = 1.6 km formulae to calculate miles and show the output
I/P => km
O/P => The total miles is ___ mile for the given ___ km
*/

import java.util.Scanner;

public class DistanceCalculator {
	public static void main(String[] args) {
		// creating the Scanner class object for taking input
		Scanner scanner = new Scanner(System.in);
		// Taking distance from the user
		System.out.println("Enter the distance in km ");
		double kilometer = scanner.nextDouble();

		// converting kilometer to miles
		double kmToMiles = kilometer * 0.621371;

		// printing the result
		System.out.println("The total miless is " + kmToMiles + " mile for the given " + kilometer + " km");

	}

}