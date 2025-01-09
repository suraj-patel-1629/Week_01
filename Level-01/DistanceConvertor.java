/* Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___*/

public class DistanceConvertor {
  public static void main(String[] args) {
    // Defining the distance in kilometer
    double distanceInKilometer = 10.8;
    // converting distance into miles
    double distanceInMiles = 10.8 * 1.6;
    // Printing Result
    System.out.println("The distance " + distanceInKilometer + "km in miles is : " + distanceInMiles);

  }
}
