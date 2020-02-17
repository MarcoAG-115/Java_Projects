/************************************************************************
 * AllinclusiveVacation
 * Marco Gonzalez
 * 04-02-2018
 * This subclass has three variables: brand, # rating, and a price. 
 * The class inherits from the abstract class "vacation" 
 * to ultimately compare the proposed budget with the price 
 * of booking an All-Inclusive trip.
 ************************************************************************/
public class AllinclusiveVacation extends vacation {

	private String brand;
	private int rating;
	private double price;
	
	public AllinclusiveVacation(){
		super();
		brand = "";
		rating = 0;
		price = 0;
	}
	
	public AllinclusiveVacation(int startRating , String startBrand , double startPrice, double startBudget, String startDestination){
		super(startBudget, startDestination);
		brand = startBrand;
		rating = startRating;
		if (startPrice > 0){
			price = startPrice;
		}
		else{
			price = 0;
		}
	}
	
	public String Spending (String Trip){ //The price is used to see if the planned trip is over or below the proposed budget. Trip details are given.
		if (super.getBudget() - price >=  0){
			return "You are staying at a " + rating + " star, "+brand +"  for $"+price+" in "+ super.getDestination()+ ". Your are $" + (super.getBudget() - price) + " under your budget.";
		}
		else{
			return "You are staying at a " + rating + " star, "+brand +" hotel for $"+price+" in "+ super.getDestination()+ ". Your are $" + Math.abs(super.getBudget() - price) + " over your budget.";
		}
	}
}
