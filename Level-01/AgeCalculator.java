/*
 * Write a program to find the age of Harry if the birth year is 2000. Assume
 * the Current Year is 2024
 * I/P => NONE
 * O/P => Harry's age in 2024 is ___
 */

public class AgeCalculator {
  public static void main(String[] args) {
    // Defining the name of the person
    String name = "Harry";
    // Defining the birthYear of the person
    int birthYear = 2000;
    // Defining the currentYear
    int currentYear = 2024;

    // printing the name current age of the person
    System.out.println(name + "'s age in " + currentYear + " is : " + (currentYear - birthYear));
  }
}