import java.util.Scanner;

/***************************************
 * SimpleCalculator
 * Marco Gonzalez
 * 09-25-2017
 * The program takes two double values 
 * and performs the math operation 
 * that the user inputs.
 ***************************************/
public class SimpleCalculator {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//The program will ask for the first value, the operation, and the second value
		//these values and string are assigned to variables
		System.out.println("Enter the operation you wish to perfrom: ");
		String operation = scan.nextLine();
		
		System.out.println("Enter your first value: ");
		double firstValue = scan.nextDouble();
		
		System.out.println("Enter the second value: ");
		double secondValue = scan.nextDouble();
		
		//The program observes which operation the user chose
		boolean test1 = operation.equalsIgnoreCase("ADD");
		boolean test2 = operation.equalsIgnoreCase("SUBTRACT");
		boolean test3 = operation.equalsIgnoreCase("MULTIPLY");
		boolean test4 = operation.equalsIgnoreCase("DIVIDE");
		
		//The program performs the operation that was chosen by reviewing which test was true.
		//The chosen operation is displayed.
		if (test1 == true){
			double answer = firstValue + secondValue;
			System.out.println(answer);
		}
		else if (test2 == true){
			double answer = firstValue - secondValue;
			System.out.println(answer);
		}
		else if (test3 == true){
			double answer = firstValue*secondValue;
			System.out.println(answer);
		}
		else if (test4 == true){
			double answer = firstValue/secondValue;
			System.out.println(answer);
		}
		else{
			System.out.println("Error");
		}
	}	
}
