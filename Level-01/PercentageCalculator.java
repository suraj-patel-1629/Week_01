/* Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ */

public class PercentageCalculator {

  public static void main(String[] args) {
    // Defining the name of the student
    String name = "Sam";
    // Defining results of each subjects
    int marksInMaths = 94;
    int marksInPhysics = 95;
    int marksInChemistry = 96;
    // Calculating the average of students marks
    double averageMarks = (double) (marksInMaths + marksInPhysics + marksInChemistry) / 3;
    // printing the output
    System.out.println(name + "'s average mark in PCM is : " + averageMarks);

  }

}
