/* Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/

import java.util.Scanner;

public class SideOfSquare {
	public static void main(String[] args) {
		// creating the Scanner class object for taking input
		Scanner input = new Scanner(System.in);
		// taking perimeter from the user as input
		System.out.print("Enter the perimeter of Square : ");
		double perimeter = input.nextInt();
		// finding the side of square with the help perimeter
		double sideOfSquare = perimeter / 4;
		// Printing output
		System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeter);

	}

}