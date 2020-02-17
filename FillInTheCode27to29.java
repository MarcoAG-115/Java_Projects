import java.util.Scanner;

/**********************************
 * FillInTheCode27-29
 * Marco Gonzalez
 * 10-24-2017
 **********************************/
public class FillInTheCode27to29 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//27
		int i = 0;
		for (i=0; i < 5; i++)
		{
			System.out.println("Hi there");
		}
		
		//28
		int x = 1;
		int result = 0;
		while (x != 0 && x != 100)
		{
			System.out.println("Enter an integer here ");
			x = scan.nextInt();
			if (x == 0 || x == 100){
				result = result + 0;
			}
			else{
				result = result + x;
			}
		}
		System.out.println("The sum is " + result);
		
		//29
		int sum = 0;
		int y;
		for (y =0; y <= 5; y++)
		{
			sum = sum + y;
		}
		System.out.println("The sum is " + sum);
}
}