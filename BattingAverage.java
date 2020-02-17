/******
 * BattingAverage
 * Marco Gonzalez
 * 09-21-2017
 * This program will ask for the number of hits and at-bats. 
 * The batter's hitting percentage is calculated and compared to .300, 
 * in order to see if they qualify for the All Star Game.
 */
// scanner utilized for reading inputted values or strings
import java.util.Scanner;


public class BattingAverage {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//the program tells the user to input the # of hits
		System.out.println("Enter the number of hits.");
		int hits = scan.nextInt();
		
		//the program tells the user to input the # of at-bats
		System.out.println("Enter the number of at-bats.");
		int atBats = scan.nextInt();
		
		//the hitting percentage is found as a decimal
		double hitPercent = (double) hits / atBats;
		
		//conditional statement checks if the hitting percentage is good or bad
		if (hitPercent > .300 && hitPercent < 1 && hitPercent > 0){
			System.out.println("You are eligible for the All Stars Game.");
		}
		else if (hitPercent <= .300){
			System.out.println("You are not eligible for the All Stars Game.");
		}
		else{
			System.out.println("Error");
		}
		
	}
}
