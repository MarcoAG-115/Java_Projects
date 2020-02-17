/*******************************************************
 * Recursive Method
 * Marco Gonzalez
 * 02-16-2018
 * The class contains two recursive methods. 
 * 1. This method uses recursion to find if the one 
 * 		of the parameters is a multiple of the second 
 * 		parameter. 
 * 2. This method uses recursion to check a password 
 * 		for characters that are digits ranging from 0 to 09.
 *********************************************************/
public class RecursiveMethod {
	
	//TEST
	public static void main(String[] args){
		int x = 4;
		int y = 18;
		String z = findMultiple (x , y);
		System.out.println(z);
		
		String i = "Password123";
		String j = checkPassword(i);
		System.out.println(j);
	}
	
	// 1. Finding Multiples
	public static String findMultiple (int a, int b){
		if (a > b){ // If "a" is not less than "b" then the method is called again except with "a" being decreased by one
			return findMultiple( a-1, b);
		}
		else{
			if (b % a == 0){ // If "a"  is less than "b" then the program checks to see if "a" is a multiple of "b"
				return a +" is a multiple of " + b; // If "a" is a multiple of "b" then the method returns that a is a multiple of b
			}
			else{
				return findMultiple( a-1,  b); // If a is not a multiple of b then the method is called again except a is decreased by one
			}
		}
	}
	
	// 2. Checking for Digits in Password
	public static String checkPassword (String a ){
		if ((a.substring(a.length()-1)).equals("0")){ //The method checks to see if the last character in the string is equal to a number from 0-9
			return "Password is acceptable.";
		}
		if ((a.substring(a.length()-1)).equals("1")){
			return "Password is acceptable.";
		}
		if ((a.substring(a.length()-1)).equals("2")){
			return "Password is acceptable.";
		}
		if ((a.substring(a.length()-1)).equals("3")){
			return "Password is acceptable.";
		}
		if ((a.substring(a.length()-1)).equals("4")){
			return "Password is acceptable.";
		}
		if ((a.substring(a.length()-1)).equals("5")){
			return "Password is acceptable.";
		}
		if ((a.substring(a.length()-1)).equals("6")){
			return "Password is acceptable.";
		}
		if ((a.substring(a.length()-1)).equals("7")){
			return "Password is acceptable.";
		}
		if ((a.substring(a.length()-1)).equals("8")){
			return "Password is acceptable.";
		}
		if ((a.substring(a.length()-1)).equals("9")){
			return "Password is acceptable.";
		}
		if (a.substring(0,1).equals((a.substring(0,a.length()-1)))){ // If all the characters in the string have been checked then the method will return that the password is unacceptable
			return "Password must include a digit from 0-9.";
		}
		else{
			return checkPassword((a.substring(0,a.length()-1-1))); // The method recalls itself except the original parameter is decreased by removing the character that was already checked
		}
	}
}


