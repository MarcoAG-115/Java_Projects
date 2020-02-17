import java.util.Scanner;
/************************************
 * BinaryToDecimalConverter
 * Marco Gonzalez
 * 11 / 06 / 2017
 * This program receives a string 
 * representing a binary number 
 * as an input and converts it 
 * to decimal form.
 ************************************/

public class BinaryToDecimalConverter {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// The user is asked to enter a binary number which the program stores in the variable "binary"
		
		System.out.println("Enter a binary number here ");
		String binary = scan.nextLine();
		
		// Variables used in the upcoming loop are initialized and some are given values
		
		int exp = binary.length() ;
		String num;
		double decimal = 0;
		double twoExp = 1;
		
		// The loop goes through each element in the binary number and finds its decimal value
		// The loop checks for "0"s and "1"s and adds the decimal values to "decimal"
		
		for (int i = 0; i < binary.length(); i++)
		{
			num = binary.substring(i, i+1);
			if (num.equals("0")){
				twoExp = (0*Math.pow(2,(exp-1)-i));
				decimal = decimal + twoExp;
			}
			else if (num.equals("1")){
				twoExp = (1*Math.pow(2, (exp-1)-i));
				decimal = decimal + twoExp;
			}
		}
		
		// The program displays the entered binary number and its decimal value
		
		System.out.println("The number " + binary + " converted to decimal form is " + decimal + ".");
	}
}
