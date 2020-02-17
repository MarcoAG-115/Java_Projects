import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/***********************************************************************************
 * BookStore
 * Marco Gonzalez
 * 02-02-2018
 * The class establishes an ArrayList and includes methods to display library
 *  and search for each book
 ***********************************************************************************/
public class BookStore {
	
	
	// Initialize Variables
	private Book b1;
	private Book b2;
	private Book b3;
	private Book b4;
	private Book b5;
	private Book b6;
	private Book x;
	
	// Default Constructor
	public BookStore () {
	
		Book b1 = new Book("Astrophysics for People in a Hurry", "Neil deGrasse Tyson", "$8.91" );
		Book b2 = new Book("Steve Jobs", "Walter Isaacson", "$12.99" );
		Book b3 = new Book("The Road", "Cormac McCarthy", "$11.99" );
		Book b4 = new Book("Fahrenheit 451", "Ray Bradbury", "$11.99" );
		Book b5 = new Book("Brave New World", "Aldous Huxley", "$9.99" );
		Book b6 = new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "$11.99" );
		
		ArrayList<Book> library = new ArrayList<Book>();
	
		library.add(b1);
		library.add(b2);
		library.add(b3);
		library.add(b4);
		library.add(b5);
		library.add(b6);
		
		String [] list = {"Astrophysics for People in a Hurry", "Steve Jobs", "The Road", "Fahrenheit 451", "Brave New World", "Do Androids Dream of Electric Sheep?"};
		
	}
	
	// Method: toString
	public String toString () {
		return "Astrophysics for People in a Hurry, Steve Jobs, The Road, Fahrenheit 451, Brave New World, Do Androids Dream of Electric Sheep?" ;
	}
	
	
	//Method: searchForTitle
	public String searchForTitle (String keyword) {
		String [] list = {"Astrophysics for People in a Hurry", "Steve Jobs", "The Road", "Fahrenheit 451", "Brave New World", "Do Androids Dream of Electric Sheep?"};
		for (String num : list){
			String b = num.substring(0,2);
			String c = num.substring(0,3);
			String d = num.substring(0,4);
			String e = num.substring(0,5);
			if (((keyword.equalsIgnoreCase(num) == true) && (keyword.equalsIgnoreCase("Astrophysics for People in a Hurry"))) || ((keyword.equalsIgnoreCase(b) == true) && (keyword.equalsIgnoreCase("As"))) || ((keyword.equalsIgnoreCase(c) == true) && (keyword.equalsIgnoreCase("Ast"))) || ((keyword.equalsIgnoreCase(d) == true) && (keyword.equalsIgnoreCase("Astr"))) || ((keyword.equalsIgnoreCase(e) == true) && (keyword.equalsIgnoreCase("Astro")))){
				return "These are your results: " + "Astrophysics for People in a Hurry" + ", "+ "Neil deGrasse Tyson" + ", "+"$8.91";
			}
			else if (((keyword.equalsIgnoreCase(num) == true) && (keyword.equalsIgnoreCase("Steve Jobs"))) || ((keyword.equalsIgnoreCase(b) == true) && (keyword.equalsIgnoreCase("St"))) || ((keyword.equalsIgnoreCase(c) == true) && (keyword.equalsIgnoreCase("Ste"))) || ((keyword.equalsIgnoreCase(d) == true) && (keyword.equalsIgnoreCase("Stev"))) || ((keyword.equalsIgnoreCase(e) == true) && (keyword.equalsIgnoreCase("Steve")))){
				return "These are your results: " + "Steve Jobs"+", "+ "Walter Isaacson"+", "+ "$12.99";
			}
			else if (((keyword.equalsIgnoreCase(num) == true) && (keyword.equalsIgnoreCase("The Road"))) || ((keyword.equalsIgnoreCase(b) == true) && (keyword.equalsIgnoreCase("Th"))) || ((keyword.equalsIgnoreCase(c) == true) && (keyword.equalsIgnoreCase("The"))) || ((keyword.equalsIgnoreCase(d) == true) && (keyword.equalsIgnoreCase("The "))) || ((keyword.equalsIgnoreCase(e) == true) && (keyword.equalsIgnoreCase("The R")))){
				return "These are your results: " + "The Road"+ ", " + "Cormac McCarthy"+ ", "+ "$11.99";
			}
			else if (((keyword.equalsIgnoreCase(num) == true) && (keyword.equalsIgnoreCase("Fahrenheit 451"))) || ((keyword.equalsIgnoreCase(b) == true) && (keyword.equalsIgnoreCase("Fa"))) || ((keyword.equalsIgnoreCase(c) == true) && (keyword.equalsIgnoreCase("Fah"))) || ((keyword.equalsIgnoreCase(d) == true) && (keyword.equalsIgnoreCase("Fahr"))) || ((keyword.equalsIgnoreCase(e) == true) && (keyword.equalsIgnoreCase("Fahre")))){
				return"These are your results: " + "Fahrenheit 451"+", " +"Ray Bradbury"+ ", " +"$11.99";
			}
			else if (((keyword.equalsIgnoreCase(num) == true) && (keyword.equalsIgnoreCase("Brave New World"))) || ((keyword.equalsIgnoreCase(b) == true) && (keyword.equalsIgnoreCase("Br"))) || ((keyword.equalsIgnoreCase(c) == true) && (keyword.equalsIgnoreCase("Bra"))) || ((keyword.equalsIgnoreCase(d) == true) && (keyword.equalsIgnoreCase("Brav"))) || ((keyword.equalsIgnoreCase(e) == true) && (keyword.equalsIgnoreCase("Brave")))){
				return "These are your results: " + "Brave New World"+ ", "+ "Aldous Huxley"+ ", "+ "$9.99";
			}
			else if (((keyword.equalsIgnoreCase(num) == true) && (keyword.equalsIgnoreCase("Do Androids Dream of Electric Sheep?"))) || ((keyword.equalsIgnoreCase(b) == true) && (keyword.equalsIgnoreCase("Do"))) || ((keyword.equalsIgnoreCase(c) == true) && (keyword.equalsIgnoreCase("Do "))) || ((keyword.equalsIgnoreCase(d) == true) && (keyword.equalsIgnoreCase("Do A"))) || ((keyword.equalsIgnoreCase(e) == true) && (keyword.equalsIgnoreCase("Do An")))){
				return "These are your results: " + "Do Androids Dream of Electric Sheep?"+ ", " + "Philip K. Dick"+ ", "+ "$11.99";
			}
			else{
				return  "Could not find anything. "+ "Suggestion: "+ "Astrophysics for People in a Hurry" + ", "+ "Neil deGrasse Tyson" + ", "+"$8.91";
			}
			
		}
		return "";
	}
}
	
		
		