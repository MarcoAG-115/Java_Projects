/**************************************
 * Vacation
 * Marco Gonzalez
 * 04-02-2018
 * The class consist of a method
 *  that reads if the trip is over or
 *   under budget. Another attribute
 *    dictates the destination.
 ***************************************/
public abstract class vacation {

	private double budget;
	private String destination;
	
	public vacation(){
		budget = 0;
		destination = "";
	}
	
	public vacation(double startBudget, String startDestination){
		budget = startBudget;
		destination = startDestination;
	}
	
	public void setDestination(String newDestination){
		destination = newDestination;
	}
	
	public String getDestination(){ //This allows "destination" to be called with ease within the subclasses
		return destination;
	}
	
	public double getBudget(){ //This allows "budget" to be called with ease within the subclasses
		return budget;
	}
	
	public void setBudget(int newBudget){
		budget = newBudget;
	}
	public abstract String Spending (String Trip); // "Trip" is a string that represents the name of the proposed trip.
}
