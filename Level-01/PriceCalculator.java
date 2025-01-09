/* Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___*/

import java.util.Scanner;

public class PriceCalculator {

	public static void main(String[] args) {
		// creating the Scanner class object for taking input
		Scanner input = new Scanner(System.in);
		// taking the unit price of the item from the user as input
		System.out.println("Enter the unit price of the item INR : ");
		double unitPrice = input.nextDouble();
		// taking quantity from the user to be bought
		System.out.println("Enter the quantity to be bought: ");
		int quantity = input.nextInt();
		// calculating total price required
		double totalPrice = unitPrice * quantity;

		// printing the output
		System.out.println("The total purchace price is INR " + (float) totalPrice + " if the quantity is " + quantity
				+ " and unit price is INR " + unitPrice);

	}

}
