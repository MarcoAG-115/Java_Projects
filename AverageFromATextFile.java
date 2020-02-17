/******************************************
 * Marco Gonzalez
 * 10-13-2017
 * AverageFromATextFile
 * This program reads any double values 
 * that exist within a text file and 
 * outputs the average of the total 
 * of the double values.
 *******************************************/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AverageFromATextFile {
	public static void main(String[] args) throws IOException{
		
		// sets up class and scanner to allow the program to look with the text file
		File inputFile = new File("input.txt");
		Scanner input = new Scanner(inputFile);
		
		// initializes variables that are used within the while loop
		double numValues = 0;
		double DoubleValues = 0;
		
		// the while loop continues adding the double values and counts the # of double values until the end of the file is reached
		while (input.hasNext()){
			DoubleValues += input.nextDouble();
			numValues++;
		}
		// the average is calculated and displayed
		double average = (double) DoubleValues/numValues;
		System.out.println("The average for input.txt is " + average);
	

	}
}
