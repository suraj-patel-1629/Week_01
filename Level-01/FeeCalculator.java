/*Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___
*/

import java.util.Scanner;

public class FeeCalculator {
	public static void main(String[] args) {
		// creating the Scanner class object for taking input
		Scanner input = new Scanner(System.in);

		// Taking the fee of the student form the user
		System.out.print("Enter the fee : ");
		int fee = input.nextInt();
		// taking form user a discount percentage
		System.out.print("Enter the discount percentage : ");
		double discountPercent = input.nextDouble();
		// calculating the discount
		double discount = (double) (fee) * discountPercent / 100;
		// calculating the final fee that need to pay by student after discount
		double finalDiscount = (double) (fee) - discount;
		// printing the output
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalDiscount);

	}

}
