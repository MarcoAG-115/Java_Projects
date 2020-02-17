/***********************************************************************************
 * Book
 * Marco Gonzalez
 * 02-02-2018
 * The class takes "title", "author", and "price" as inputs and returns their values
 ***********************************************************************************/
public class Book {
	
	// Initialize Variables
	private String title; 
	private String author; 
	private String price; 
	
	//Default Constructor
	public Book ( ) {
		title = "";
		author = "";
		price = "";
	}
		
	//Overload Constructor
	public Book ( String startTitle, String startAuthor, String startPrice) {
		title = startTitle;
		author = startAuthor;
		price = startPrice;
	}
		
	//Accessor Method
	
	public String getTitle( ) {
		return title;
	}
	public String getAuthor( ) {
		return author;
	}
	public String getPrice( ) {
		return price;
	}
	
	//Mutator Method
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}
	public void setPrice(String newPrice) {
		price = newPrice;
	}
		
	//Method
	public String toString () {
		return "Title: " + title + ", Author: " + author + ", Price: " + price;
	}	
		
		
}
