import java.util.Scanner;

/********************************
 * MDArray Problems
 * Marco Gonzalez
 * 01-22-2018
 ********************************/
public class MDArrayProblems {
	Scanner scan = new Scanner(System.in);
	
	//1(a)
	
	int [] array = {1,2,3};
	int sum = 0;
	for (int i = 0; i < array.length; i++){
		sum = array[i] + sum;
	}
	System.out.println(sum);
	
	//TEST RESULTS
	// 6

	//--------------------------------------
	
	//1(b)
	
	int [][] t = {{10,20,30},{1,2,3}};
	
	int [] sum = new int[t.length];
	
	for (int j = 0; j<t.length-1; j++){
		for (int u = 0; u < t[j].length; u++){
			sum[j] = t[j][u] + t[j+1][u];
			System.out.println(sum[j]);
		}
	}
	System.out.println();
	
	//TEST RESULTS
	// 11
	// 22
	// 33

	//-----------------------------------------
	
	//2(a)
	
	String str = "cat";
	int n = str.length();
	int x = (n*(n+1))/2;
	String [] array = new String[x];
	
	for (int i = 0; i < n; i++){
		array[i] = str.substring(i,i+1);
		System.out.println(array[i]);
	}
	
	
	array[n] = str;
		for (int j = 0; j < n-1; j++){
			array[j] = str.substring(j,j+2);
			System.out.println(array[j]);
		}
	System.out.println();
	
	//TEST RESULTS
	// c
	// a
	// t
	// ca
	// at
	
	//---------------------------------------------
	
	//3
	
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
	
	//TEST RESULTS
	// Enter a value for n: 4
	//	1
	//	11
	//	121
	//	1331
	//	14641


}
