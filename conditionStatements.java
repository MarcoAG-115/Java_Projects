
import java.util.Scanner;
public class conditionStatements {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter your test grade.");
		int grade = scan.nextInt();
		
		System.out.println("Enter your extra credit.");
		int extracredit = scan.nextInt();
		
		if (extracredit > 0){
			grade += extracredit;
		}
		System.out.println("Your final grade is "+grade);
	}
}
