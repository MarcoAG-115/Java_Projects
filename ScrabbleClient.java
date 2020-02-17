/****************************
 * ScrabbleClient
 * Marco Gonzalez
 * 01-12-2018
 ****************************/
public class ScrabbleClient {
	public static void main (String [ ] args) {
		computeScore newcomputeScore = new computeScore();
		computeScore Method = new computeScore("cat");
		int newScrabbleValue = Method.getScrabbleValue();
		System.out.println(newScrabbleValue);
	}

}
