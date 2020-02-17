import java.util.Scanner;

/*******************
 * FindSmallest
 * Marco Gonzalez
 *09-22-2017
 *Find the smallest of three integers input by the user
 *******************/
public class FindSmallest {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//User is asked to input three integers, which are initialized
		System.out.println("Enter an integer:");
		int intOne = scan.nextInt();
		System.out.println("Enter an integer:");
		int intTwo = scan.nextInt();
		System.out.println("Enter an integer:");
		int intThree = scan.nextInt();
		
		//conditional statements compare each integer and then choose the smallest
		if (intOne > intThree && intTwo > intThree){
			System.out.println(intThree + " is the smallest integer.");
		}
		else if (intOne > intTwo && intThree > intTwo){
			System.out.println(intTwo + " is the smallest integer.");
		}
		else{
			System.out.println(intOne + " is the smallest integer.");
		}
			
	}
}
