import java.util.Scanner;

/*******************
 * Pair Programming Project
 * Marco & Naomi Gonzalez
 * 10-02-2017
 * This program serves as a calculator 
 * that solves for the following operators:
 * + , - , * , / , and ^.
 * The program describes the operation
 * and displays the solution.
 **************************/
public class PairProgrammingProject {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// program tells user to enter inputs
		System.out.println("Enter operation- ");
		String operator = scan.nextLine();
		
		System.out.println("Enter first input- ");
		int first = scan.nextInt();
		
		System.out.println("Enter second input- ");
		int second = scan.nextInt();
		
		// the conditional checks to see if the inputs are invalid
		if ((first < 0 || first > 9) || (second < 0 || second > 9)){
			System.out.println("Invalid Number");
		}
		else{
		String a;
		String b;
		
		// this conditional assigns a string to a and b depending on the two values entered
		if (0 == first){
			a = "Zero";
		}
		else if (1 == first){
			a = "One";
		}
		else if (2 == first){
			 a = "Two";
		}
		else if (3 == first){
			 a = "Three";
		}
		else if (4 == first){
			 a = "Four";
		}
		else if (5 == first){
			 a = "Five";
		}
		else if (6 == first){
			 a = "Six";
		}
		else if (7 == first){
			 a = "Seven";
		}
		else if (8 == first){
			 a = "Eight";
		}
		else{
			 a = "Nine";
		}
		
		if (0 == second){
			 b = "Zero";
		}
		else if (1 == second){
			 b = "One";
		}
		else if (2 == second){
			 b = "Two";
		}
		else if (3 == second){
			 b = "Three";
		}
		else if (4 == second){
			 b = "Four";
		}
		else if (5 == second){
			 b = "Five";
		}
		else if (6 == second){
			 b = "Six";
		}
		else if (7 == second){
			 b = "Seven";
		}
		else if (8 == second){
			 b = "Eight";
		}
		else{
			 b = "Nine";
		}
	
		// the program checks to see which operator was entered
		boolean test1 = operator.equals("+");
		boolean test2 = operator.equals("-");
		boolean test3 = operator.equals("*");
		boolean test4 = operator.equals("/");
		boolean test5 = operator.equals("^");
		
		// the conditional allows the program to check if the operation is possible and solves it if it is possible
		if (second == 0 && test4 == true){
			System.out.println("Division by zero is not allowed");
		}
		else{
			if (test1 == true){
				System.out.println(a + " plus "+ b + " is " + (first+second));
			}
			else if (test2 == true){
				System.out.println(a + " minus "+ b + " is " + (first-second));
			}
			else if (test3 == true){
				System.out.println(a + " multiplied by "+ b + " is " + (first*second));
			}
			else if (test4 == true){
				System.out.println(a + " divided by "+b + " is " + (first/second));
			}
			else{
				System.out.println(a + " to the power of "+b + " is " + (Math.pow(first, second)));
			}
		}
	}

}
}
// Questions:
// What were some challenges you encountered as the Driver? - As the driver, we would occasionally confuse the other person by using techniques that they would not use.
// What were some challenges you encountered as the Navigator? - Once, the navigator was unable to convey what he wanted the driver to type.
// What are some positive ways that each person contributed in your group? - We were able to come up with solutions / ideas at a faster rate, so most obstacles we encountered were quickly solved. Each person provided additional insight in different areas: one for nested loops and another for methods.
// Which role did you prefer when pair programming? - We each preferred to be the drivers because it was sometimes difficult to fully understand what the navigator wanted to do.
