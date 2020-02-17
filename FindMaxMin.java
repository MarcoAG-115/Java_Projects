import java.util.Scanner;
/***********************************************
 * FindMaxMin
 * Marco Gonzalez
 * 11 / 02 / 2017
 * This program has the user enter 6 integers
 *  to create an array with 6 elements. 
 *  The program finds and displays 
 *  the smallest and greatest values in the array.
 *************************************************/


public class FindMaxMin {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//an array capable of storing 6 values is created and initialized
		
		int [] array = new int [6];
		
		//the loop assigns the values entered by the user every iteration until the array is filled
		
		for (int i  = 0; i < array.length; i++)
		{
			System.out.println("Enter next value here ");
			array[i] = scan.nextInt();
		}
		
		//the variable "max" is initialized and set equal to zero
		//the loop runs through an element per iteration and uses an "if" statement to test & check the elements to find the greatest value
		
		int max = 0;
		for (int i  = 0; i < array.length; i++)
		{
			if (array[i] > max){
				max = array[i];
			}
		}
		
		//the variable "min" is initialized and set equal to the first element in the array
		//this loop performs the same function as the previous loop except it checks the elements to find the smallest value
		
		int min = array[1];
		for (int i  = 0; i < array.length; i++)
		{
			if (array[i] < min){
				min = array[i];
			}
		}
		
		//the max and min are displayed
		
		System.out.println("The max is " + max + " and the min is " + min + ".");
		
		
	}
}
