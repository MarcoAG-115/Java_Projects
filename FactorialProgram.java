import java.util.Scanner;

/*******************************
 * FactorialProgram
 * Marco Gonzalez
 * 10-20-2017
 * This program calculates 
 * the factorial of an input under 10.
 ********************************/
public class FactorialProgram {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//program tells user to enter an int under 10 to calculate the factorial for
		System.out.println("Enter an integer under 10 here ");
		int fact = scan.nextInt();
		
		//the variables used in the following loop and if-else statement are initialized
		int i;
		int pro = 1;
		String x;
		
		//the loop finds the total product (factorial) of the all the numbers less than "fact" but greater than 0
		for (i = 1; i <= fact; i++ )
		{
			pro = pro*i;
		}
		
		//the if-else statement determines the equation that corresponds to the entered value
		if (fact == 9){
			x = "9*8*7*6*5*4*3*2*1";
		}
		else if (fact == 8){
			x = "8*7*6*5*4*3*2*1";
		}
		else if (fact == 7){
			x = "7*6*5*4*3*2*1";
		}
		else if (fact == 6){
			x = "6*5*4*3*2*1";
		}
		else if (fact == 5){
			x = "5*4*3*2*1";
		}
		else if (fact == 4){
			x = "4*3*2*1";
		}
		else if (fact == 3){
			x = "3*2*1";
		}
		else if (fact == 2){
			x = "2*1";
		}
		else if (fact == 1){
			x = "1";
		}
		else{
			x = "0";
		}
		
		//the input, the equation, and product are displayed
		System.out.println(fact + " ! = " + x + " = " + pro);
	}
}
