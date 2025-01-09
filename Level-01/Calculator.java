/* Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. 
The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
*/

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// creating the Scanner class object for taking input
		Scanner input = new Scanner(System.in);
		// Taking input from user for number1a
		System.out.println("Enter the first number : ");
		int number1 = input.nextInt();
		// Taking input from user for number2
		System.out.println("Enter the first number : ");
		int number2 = input.nextInt();

		// printing the add, sub, mul, divide result in output
		System.out.println("The addition, substraction, multiplication and division value of 2 numbers " + number1 + " and "
				+ number2 + " is " + (number1 + number2) + ", " + (number1 - number2) + ", " + (number1 * number2) + " and "
				+ (number1 / number2));

	}

}