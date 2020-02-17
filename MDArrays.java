import java.util.Scanner;


public class MDArrays {
	public static void main (String[ ] args) {
		Scanner scan = new Scanner(System.in);
		//Declaring multidimensional arrays
		//dataType [ ] [ ] arrayName;
		//double [ ] dailyTemps;
		
		//Instantiating multidimensional arrays
		//arrayName = new dataType [row] [col]
		//dailyTemps = new double [52] [7];
		
		//Assigning values
		//dataType [ ] [ ] arrayName = { {value00 , value01 , ... },
		//														{value10 , value11 , ...}, ...};
		
		// int [ ] [ ] numbers = { { 12, 6, 999 } , { 74,  6766 } };
		
		//accessing array elements
		//arrayName [rowIndex] [colIndex]
		//Where rowIndex, colIndex are integers
		//last row, last column
		//arrayName [arrayName.length-1] [arrayName.length-1].length-1]
		//Number of rows --> arrayName.length
		//Number of columns --> arrayName[i].length ("i" is the row index)
		//printing multidimensional array
		
		// for(int i = 0; i < numbers.length; i++){
		// 	for(int j = 0; j < numbers[i].length; j++){
		//	    System.out.println(numbers[i][j]);
		//	}
		//	System.out.println( );
		//}
		//System.out.println(numbers.length);
		
		System.out.println("Enter a value for n: ");
		int n = scan.nextInt();
		n = n+1;
		
		int [] array1 = new int [n];
		for (int i = 0; i < n; i++){
			int x = (int)Math.pow(11,i);
			array1[i] = x;
		}
		
		int [][] array2 = new int [n][n];
		for (int j = 0; j<n;j++){
			 array2[j][0] = array1[j];
			System.out.println(array2[j][0]);
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
