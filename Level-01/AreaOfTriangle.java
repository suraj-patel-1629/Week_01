/* Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		// creating the Scanner class object for taking input
		Scanner input = new Scanner(System.in);
		// Taking the base of triangle as input from the user
		System.out.print("Enter the base : ");
		int base = input.nextInt();
		// Taking the height of triangle as input from the user
		System.out.print("Enter the height : ");
		int height = input.nextInt();

		// calculating the area of triangle
		float areaOfTriangle = 0.5f * (float) (base * height);
		// calculating the area of triangle in inches
		float areaInInches = areaOfTriangle / (2.54f * 2.54f);
		// printing the output
		System.out.println(
				"The area of Triangle in Square Inches " + areaInInches + " and Square centimeter is " + areaOfTriangle);

	}

}