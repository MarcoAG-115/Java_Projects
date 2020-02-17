/*********************************************************************
 * PiecemealVacation
 * Marco Gonzalez
 * 04-02-2018
 * This subclass has six variables attributes: 
 * meal plan, hotel name, airline, and the price of each. 
 * The class inherits from the abstract class "vacation" 
 * to ultimately compare the proposed budget with the price 
 * of booking a piecemeal trip.
 **********************************************************************/
public class PiecemealVacation extends vacation{

	private String meal;
	private double priceMeal;
	private String hotel;
	private double priceHotel;
	private String airline;
	private double priceAirline;
	
	public PiecemealVacation(){
		super();
		meal = "";
		priceMeal = 0;
		hotel = "";
		priceHotel = 0;
		airline = "";
		priceAirline = 0;
	}
	
	public PiecemealVacation(String startMeal, double startPriceMeal, String startHotel , double startPriceHotel, String startAirline, double startPriceAirline, double startBudget, String startDestination){
		super(startBudget, startDestination);
		meal = startMeal;
		hotel = startHotel;
		airline = startAirline;
		if (startPriceMeal > 0){
			priceMeal = startPriceMeal;
		}
		else{
			priceMeal = 0;
		}
		if (startPriceHotel > 0){
			priceHotel = startPriceHotel;
		}
		else{
			priceHotel = 0;
		}
		if (startPriceAirline > 0){
			priceAirline = startPriceAirline;
		}else{
			priceAirline = 0;
		}
	}
	
	public String Spending (String Trip){ //This finds the total price and uses it to dictate if the actual price is below or over the proposed budget. Details of the trip or re-stated.
		double totalPrice = priceMeal + priceAirline + priceHotel;
		if (super.getBudget() - totalPrice >=  0){
			return "Your are $" + (super.getBudget() - totalPrice) + " under your budget. The details for your trip are: "+ meal + " plan at $" + priceMeal + " / Accomodation at " + hotel + " for $" + priceHotel+ " / Flying with "+ airline + " to "+ super.getDestination()+ " for $"+priceAirline + ".";
		}
		else{
			return "Your are $" + Math.abs(super.getBudget() - totalPrice) + " over your budget. The details for your trip are: "+ meal + " plan at $" + priceMeal + " / Accomodation at " + hotel + " for $" + priceHotel+ " / Flying with "+ airline + " to "+ super.getDestination()+ " for $"+priceAirline + ".";
		}
	}
}
