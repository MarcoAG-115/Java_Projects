/*******************************************
 * GameClass
 * Marco Gonzalez
 * 03-15-2018
 * This class stands in as the superclass in
 *  which the trivia class inherits from. 
 *  Together both classes create a game 
 *  that awards the ultimate money prize 
 *  if a certain number of correct answers 
 *  is met.
 *******************************************/
public class GameClass {
	
	private String description = "Enter 'Yes' or 'No' to answer the question. Answer correctly and earn $1,000, and get closer to winning the ULTIMATE PRIZE!";
	
	public GameClass (String newDescription){
		setDescription(newDescription);
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String newDescription){
		description ="Enter 'Yes' or 'No' to answer the question. Answer correctly and earn $1,000, and get closer to winning the ULTIMATE PRIZE!";;
	}
	
	public String toString(){
		return ("Game Description:  "+ description);
	}
}
