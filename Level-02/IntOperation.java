
/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discount Precent
O/P => The results of Int Operations are —-, -—, and —-
 */

// importing the Scanner class
import java.util.Scanner;

public class IntOperation {
  public static void main(String[] args) {
    // creating a scanner class object for taking input from user
    Scanner input = new Scanner(System.in);

    // Taking inputs for a, b, and c
    System.out.print("Enter value for a: ");
    int a = input.nextInt();
    System.out.print("Enter value for b: ");
    int b = input.nextInt();
    System.out.print("Enter value for c: ");
    int c = input.nextInt();

    // Performing operations based on operator precedence
    // In this operation multiplication is done first than addition
    int result1 = a + b * c;
    // In this operation multiplication is done first than addition
    int result2 = a * b + c;
    // In this operation division is done first than addition
    int result3 = c + a / b;
    // In this operation modulus is done first than addition
    int result4 = a % b + c;

    // Printing the results
    System.out.println("The results of Int Operations are:");
    System.out.println("a + b * c = " + result1);
    System.out.println("a * b + c = " + result2);
    System.out.println("c + a / b = " + result3);
    System.out.println("a % b + c = " + result4);

    input.close(); // Closing the scanner
  }
}
