/* Suppose you have to divide 14 pens among 3 students equally. 
Write a program to find how many pens each student will get if the pens must be divided equally. 
Also, find the remaining non-distributed pens.
Hint => 
Use Modulus Operator (%) to find the reminder.
Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___ */

public class PenDistributer {
	public static void main(String args[]) {

		// Defining number of pens are present
		int pen = 14;
		// Defining number of student
		int noOfStudents = 3;
		// Here calculating no of pen each student will get
		int penPerStudent = pen / noOfStudents;
		// how many pen are remaining
		int remainingPen = pen % noOfStudents;
		// Printing output
		System.out.println(
				"The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen);

	}
}