/* Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */

import java.util.Scanner;

public class HeightInFeetAndInches {
	public static void main(String[] args) {
		// creating the Scanner class object for taking input
		Scanner input = new Scanner(System.in);
		// Taking the height form the user in centimeter
		System.out.print("Enter the height in centimeters : ");
		int heightInCm = input.nextInt();

		// converting the height of the user from centimeter to feet
		double feet = (double) (heightInCm) / (2.54 * 12);
		// converting the height of the user from centimeter to inches
		double inches = (double) (heightInCm) / 2.54;
		// printing output
		System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);

	}

}