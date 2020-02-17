import javax.swing.JOptionPane;
/***********************************************************************************
 * Book
 * Marco Gonzalez
 * 02-02-2018
 * The class uses BookStore to allow the user to search for a book, that is listed,
 *  in order to see the price and author
 ***********************************************************************************/
public class BookSearchEngine {
	public static void main (String [ ] args) {
		BookStore newBookStore = new BookStore();
		BookStore Method = new BookStore();
		String newList = Method.toString();
		System.out.println("Library: " + newList);
		String keyword = JOptionPane.showInputDialog("Enter a keyword or title: ");
		String newSearch = Method.searchForTitle(keyword);
		System.out.println(newSearch);
	}
}


