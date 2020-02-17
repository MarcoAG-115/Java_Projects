/*********************************
 * Marco Gonzalez
 * LoopingFillInTheCode
 * 10-16-2017
 *********************************/
public class LoopingFillInTheCode {
	public static void main(String [] args){
	Scanner scan = new Scanner(System.in);
	
	//21
	int x = 0;{
	while (x != 5){ //the loop stops running once a 5 is generated
		x = 3+(int)(Math.random()*5); //if "Math.random()" generates a zero then the minimum will be three and if a 1 is generated then the max will be 7
		if (x == 5){ //Nothing will be displayed if a 5 is generated
			x = 5;
		}
		else{ //any other value will be displayed
			System.out.println(x);
		}
	}

}
}

	//22
	int z = 0;
	System.out.println("Enter an initial integer here "); //user enters initial integer
	int startnum = scan.nextInt();{
	while (z != 20){ //the loop ends once a 20 is entered
		System.out.println("Enter an integer here: "); // the user continues to enter integers
		z = scan.nextInt(); 
		if (z == 20){ //if the submitted integer is 20 nothing is displayed
			z = 20;
		}
		else if (z >= startnum){ //integers greater than or equal to the initial integer are displayed
			System.out.println(z);
		}
		else{ //any other value is not displayed
			z = 0;
		}
	}
	
}
}

	//23
	int enteredInt = 0;
	int sumOfInts = 0;{
		while (enteredInt != -1){
			System.out.println("Enter an integer here (enter -1 to end program): "); //user enters integers until he wants to end the program
			enteredInt = scan.nextInt();
			if (enteredInt == -1){
				enteredInt = -1;
			}
			else{
			sumOfInts = sumOfInts + enteredInt; //all of the submitted integers (with -1 as an exception) are added
			}
		}
		System.out.println("The sum is " + sumOfInts); //once the loop is ended the user receives the total sum of all of the submitted integers
	}

	//24
	int sum = 0;
	int countMultiplesOf7 = 0;
	int count = 1;
	while (count != 5){ //the loop will end once the first four positive multiples of 7 are found
		countMultiplesOf7 = countMultiplesOf7 + 1; //this variable continues to increment until four multiples of 7 are found
		if (countMultiplesOf7 % 7 == 0){ //if the incrementing variable is a multiple of 7 then "count" increases by one and "countMultiplesOf7" is added to sum
			count = count + 1;
			sum = countMultiplesOf7 + sum;
		}
		else{ //if no multiple is found "count" remains the same
			count = count + 0;
		}
	}
	System.out.println("The sum of the first four positive multiples of 7 is "+ sum); //once the loop ends the sum of the four multiples is displayed
	}
	}
	
	//25
	String sentence = "";
	String word;
	while (! word.equals("end")){ //the loop ends when the user enters "end"
		System.out.println("Enter a word to concatenate here: "); //the user enters a word to add on to the "sentence"
		word = scan.nextLine();
		if (word.equals("end")){ //if the word entered is "end" then the "sentence" is not updated
			word = "";
		}
		else{
			sentence = sentence+word; //if the word is not "end" then the "sentence" is updated with the most word submitted 
		}
		}
	System.out.println("The concatenated sentence is "+ sentence); //once the loop is ended the final concatenated "sentence" is displayed
	}
	}
	