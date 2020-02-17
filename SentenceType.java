import java.util.Scanner;
/************************************************
 * SentenceType
 * Marco Gonzalez
 *09-22-2017
 *This program reads the sentence from the console.
 *It will check the last character in the sentence
 *in order to see if the sentence is declarative,
 *interrogative, or exclamatory.
 ************************************************/

public class SentenceType {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//variables are set equal to possible last characters in a sentence
		String dec = ".";
		String inter = "?";
		String exl = "!";
		
		//User is told to write a sentence which is set equal to "sent"
		System.out.println("Write a sentence: ");
		String sent = scan.nextLine();
		
		//The length of the sentence is found in order to allow the program to find the last character of any sentence
		int sentLength = sent.length();
		int last = sentLength - 1;
		String lastChar = sent.substring(last);
		
		//lastChar is compared to ".", "?", and "!"
		boolean test1 = lastChar.equals(dec);
		boolean test2 = lastChar.equals(inter);
		boolean test3 = lastChar.equals(exl);
		
		//The conditional statements check which punctuation matches with the last character
		if (test1 == true){
			System.out.println("The sentence is a declarative sentence.");
		}
		else if (test2 == true){
				System.out.println("The sentence is an interrogative sentence.");
		}
		else{
			System.out.println("The sentence is an exclamatory sentence.");
		}
	}
}

