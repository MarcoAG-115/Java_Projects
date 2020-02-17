import java.util.Scanner;
/******************************************
 * MexicoPopulation
 * Marco Gonzalez
 * 10-31-2017
 * This program will ask the user
 * for a double input that represents
 * the target population in the millions,
 * and will print out the year in which
 * the population of Mexico will reach
 * or exceed that number.
 *******************************************/

public class MexicoPopulation {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// The program tells the user to enter a target population double value

		System.out.println("Enter a double value representing the Mexican population in the millions here ");
		double InPop = scan.nextDouble();
		
		//The constants are initialized and given values
		
		final double OUTPOP = 123.8;
		final int YEARS = 2014;
		final double GROWTH = .5;
		
		//The variables used within the while loop are given initialized and given an initial value
		
		int year = 0;
		double FinPop = 123.8;
		
		//The while loop utilizes the constants to continue increasing the population until it reaches the target population. The program counts the number of years each iteration.
		
		while (FinPop < InPop)
		{
			FinPop = FinPop + (GROWTH*OUTPOP);
			year = year + 1;
		}
		
		//The final year is solved for, and the final year and population are displayed
		
		year = year + YEARS;
		System.out.println("The year will be "+ year + " when the population reaches "+FinPop+"." );
	}
}
