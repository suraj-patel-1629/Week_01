
/* Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
 */
import java.util.Scanner;

public class MaxHandShake {
  public static void main(String[] args) {
    // creating the Scanner class object for taking input
    Scanner input = new Scanner(System.in);
    // Taking the input from user how many student are there
    System.out.print("Enter the number of students: ");

    int noOfStudent = input.nextInt();
    // calculating the how many handshakes are possible
    int maximumHandshake = (noOfStudent * (noOfStudent - 1)) / 2;
    // printing the output
    System.out.println("The maximum number of handshakes among " + noOfStudent + " students is: " + maximumHandshake);

  }

}