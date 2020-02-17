/*******************************************
 * Trivia
 * Marco Gonzalez
 * 03-15-2018
 * This class stands in as the subclass in
 *  which the game class inherits to. 
 *  Together both classes create a game 
 *  that awards the ultimate money prize 
 *  if a certain number of correct answers 
 *  is met. In the game, the user gains 
 *  money per correct answer. If the user 
 *  answers a certain number of questions 
 *  correctly, then they win the ultimate 
 *  prize along with their cumulative score.
 *******************************************/
public class Trivia extends GameClass {
	
	private int ultimate = 1000000;
	private int question = 5;
	private String instruct = "";

	// Overload Constructor
	public Trivia ( String newDescription, String startInstruct ){
		super(newDescription);
		instruct = startInstruct;
	}
	
	
	// toString Method
	public String toString(){
		if (instruct.equalsIgnoreCase("Instructions")){
			return super.toString()+"; To win $" + ultimate + " answer " + question + " questions.";
		}
		else{
			return "";
		}
	}
	

}

