
/*Similarly, write the DoubleOpt program by taking double values and doing the same operations. */

//importing Scanner class
import java.util.Scanner;

public class DoubleOpt {
  public static void main(String[] args) {
    // Creating a Scanner class object
    Scanner input = new Scanner(System.in);

    // Taking inputs for a, b, and c as double
    System.out.print("Enter value for a: ");
    double a = input.nextDouble();
    System.out.print("Enter value for b: ");
    double b = input.nextDouble();
    System.out.print("Enter value for c: ");
    double c = input.nextDouble();

    // Performing operations based on operator precedence
    // In this operation multiplication is done first than addition
    double result1 = a + b * c;
    // In this operation multiplication is done first than addition
    double result2 = a * b + c;
    // In this operation division is done first than addition
    double result3 = c + a / b;
    // In this operation modulus is done first than addition
    double result4 = a % b + c;

    // Printing the results
    System.out.println("The results of Double Operations are:");
    System.out.println("a + b * c = " + result1);
    System.out.println("a * b + c = " + result2);
    System.out.println("c + a / b = " + result3);
    System.out.println("a % b + c = " + result4);

    input.close(); // Close the scanner
  }
}
