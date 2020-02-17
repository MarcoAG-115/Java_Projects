import java.util.Scanner;

/*****************************
 * computeScore
 * Marco Gonzalez
 * 01-09-2018
 * This method takes a user-entered word
 *  and outputs the value
 *   of the word according to Scrabble
 *****************************/
public class computeScore {
//Instance Variables
		private String word;
		
//Default Constructor
		public computeScore (){
			word = "";
		}
//Overload Constructor
		public computeScore (String startWord) {
			word = startWord;
		}
//Accessor Method
		public String getWord( ) {
			return word;
		}
		
//Mutator Method
		public void setWord( String newWord) {
			word = newWord;
		}
		
//Method
		public int getScrabbleValue ( ) {
		//Variables are initialized and given values
		int L = word.length()-1;
		int score = 0;
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		//An array containing the values per element is created
		int[] values = {1 , 3 , 3 , 2 , 1 , 4 , 2 , 4 , 1 , 8 , 5 , 1 , 3 , 1 , 1 , 3 , 10 , 1 , 1 , 1 , 1 , 4 , 4 , 8 , 4 , 10, 1 , 3 , 3 , 2 , 1 , 4 , 2 , 4 , 1 , 8 , 5 , 1 , 3 , 1 , 1 , 3 , 10 , 1 , 1 , 1 , 1 , 4 , 4 , 8 , 4 , 10};
		
		//The for loop runs through every letter in the entered word and looks for it in the "alphabet" string
		//The location of the letters in "alphabets" matches the location of its value in the "values" array
		//The values of each element are added until each letter is given a value
		for (int i = 0; i <= L; i++ ){
			char letter = word.charAt(i);
			int element = alphabet.indexOf(letter);
			int x = values[element];
			score = score + x;
		}
		
		//The total is displayed
		return score;
	}	
}
