import java.util.Scanner;


public class passingGrade {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a grade");
		int grade = scan.nextInt();
		
		String message;
		
		if(grade >= 60){
			message ="You passed";
		}
		else {
			message = "You failed";
		}
		System.out.println(message);
}
}
