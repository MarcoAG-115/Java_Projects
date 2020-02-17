import java.util.Scanner;

/*****************************
 * MakingChange
 * Marco Gonzalez
 * 12-11-2017
 * A random dollar amount (between 1 to 10) and cent amount (between .00 to .99).
 * The user will be allowed to enter a cash amount to pay.
 * The program will calculate the amount of change that needs to be given to the user.
 ******************************/
public class MakingChange {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
	int dollar =(int)( Math.random( )*10+1); //a random integer between 1 and 10 is generated
	double cent = Math.round(Math.random( )*100.0)/100.0; //a random double between .00 and .99 is generated
	
	double firstTotal = dollar + cent; //the two randomly generated numbers are added
	
	System.out.println("The amount owed is: $" + firstTotal + " ."); //the amount owed is displayed
	
	System.out.println("Enter the dollar amount to be paid."); //the user is asked to enter an integer to represent the dollar amount that will be tendered
	int payDollar = scan.nextInt(); 
	
	System.out.println("Enter the coinage amount to be paid."); //the user is asked to enter a double to represent the coin amount that will be tendered
	double payCent = scan.nextDouble();
	
	int changeDollar = payDollar - dollar; //the amount owed is subtracted from the amount paid
	double changeCent = Math.round((payCent - cent)*100.0)/100.0; 
	
	double total = changeDollar + changeCent;
	
	if (total < firstTotal){ //the program notifies the user if they still owe money or what they will receive for change
		double amountNeeded = Math.abs(total);
		System.out.println("You require $" + amountNeeded + " to complete your purchase.");
	}
	else{
		System.out.println("Your change will be: $" + total + " .");
	}
	}
}
