/*Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. 
This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/

import java.util.*;
public class DemoArrayIndexOutOfExc{
	public static void arrayExce( String[]arr){
		//explicitily throwing exception 
		
		System.out.println(arr[arr.length]);
		//This is thrwoing exception at runtime because we are element which is not present in array
		
	}
	public static void hadlingExc(String []arr){
		try{
			arrayExce(arr);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Given Index is greater than array size");	
		}
	}
  public static void main(String []args){
	  
	  Scanner input = new Scanner(System.in);
	  
	  String []arr = new String[2];
	  for(int i=0;i<arr.length;i++){
		  arr[i]=input.next();
	  }
	  
	 // arrayExce(arr);
	  hadlingExc(arr);
	  
	  
	  
  }
}