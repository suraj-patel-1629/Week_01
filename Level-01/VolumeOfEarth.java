/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____*/

public class VolumeOfEarth {
	public static void main(String[] args) {
		// Defining the radius of Earth in km
		double radiusInKm = 6378;
		// converting the radius into miles
		double radiusInMiles = 6378 * 0.621371;
		// Calculating the volume of the earth in km
		double volumeInKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusInKm, 3);
		// Calculating the volume of the earth in miles
		double volumeInMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);
		// Printing output
		System.out
				.println("The volume of earth in cubic kilometers is " + volumeInKm + " and cubic miles is " + volumeInMiles);

	}

}