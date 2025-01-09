
/*Create a program to divide N number of chocolates among M children.
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___ */
// importing the scanner class
import java.util.Scanner;

public class ChoclateDiv {
  public static void main(String[] args) {
    // Creating a Scanner object
    Scanner input = new Scanner(System.in);

    // Taking input for the number of chocolates and children
    System.out.print("Enter the number of chocolates: ");
    int numberOfChocolates = input.nextInt();
    System.out.print("Enter the number of children: ");
    int numberOfChildren = input.nextInt();

    // Calculating chocolate that a per children will get
    int chocolatesPerChild = numberOfChocolates / numberOfChildren;
    // calculating remaining chocolate
    int remainingChocolates = numberOfChocolates % numberOfChildren;

    // Printing the results
    System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
        " and the number of remaining chocolates are " + remainingChocolates + ".");
    // Closing the scanner
    input.close();
  }
}
