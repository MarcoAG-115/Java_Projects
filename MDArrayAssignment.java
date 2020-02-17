import java.util.Scanner;

/********************************************
 * MDArrayAssignment
 * Marco Gonzalez
 * 01-19-2018
 * The array takes 2 inputs for the number 
 * of rows and the number columns of an 
 * array and prints an array with the sum 
 * of the row and column for each element 
 * of the array.
 *********************************************/
public class MDArrayAssignment {
		public static void main (String[ ] args) {
			Scanner scan = new Scanner(System.in);

			// array is initialized
			int[][] array;
			
			// user is prompted for a value to assign to "x" and "y" or rows and columns
			System.out.println("Enter a value for rows here: ");
			int x = scan.nextInt();
			
			System.out.println("Enter a value for columns here: ");
			int y = scan.nextInt();

			// array is given its dimensions
			array = new int [x] [y];
			
			// the for loops fill out the array with the sum of the row and column at each element
			for(int i = 0; i < y; i++){
				for(int j = 0; j < x; j++){
					int z = i+j;
					array[i][j] = z;
					System.out.println(array[i][j]);
				}
				System.out.println( );
			}
		}
	}

