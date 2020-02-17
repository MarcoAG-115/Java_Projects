/**
 * This is a class that tests the Deck class.
 */
public class DeckTester2 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue","red"};
		int[] pointValues = {11, 12, 13};
		Deck2 x = new Deck2(ranks, suits, pointValues);
		System.out.println(x);
		
		String[] ranks1 = {"one", "two", "three"};
		String[] suits1 = {"clubs","diamonds"};
		int[] pointValues1 = {2, 3, 4};
		Deck2 y = new Deck2(ranks, suits, pointValues);
		System.out.println(y);
		
		String[] ranks2 = {"four", "five", "six"};
		String[] suits2 = {"hearts","spades"};
		int[] pointValues2 = {5, 6, 7};
		Deck2 z = new Deck2(ranks, suits, pointValues);
		System.out.println(z);
	}
}
