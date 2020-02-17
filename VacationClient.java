/*************************************************
 * VacationClient
 * Marco Gonzalez
 * 04-02-2018
 * This client utilizes the "vacation" 
 * abstract class to compare a proposed 
 * budget, for a trip, with the actual price 
 * of the trip.
 **************************************************/
public class VacationClient {
	public static void main(String [] args){
		AllinclusiveVacation x = new AllinclusiveVacation(5, "JW Marriot at Union Square", 3050.00, 2000.00, "San Francisco");
		System.out.println(x.Spending("SFO"));
		
		PiecemealVacation y = new PiecemealVacation("Daily Continental Breakfast", 100.87, "Embassy Suites @ Airport Waterfront", 597.50, "Delta Airlines", 280.98, 2000.00, "San Francisco");
		System.out.println(y.Spending("SFO"));
	}
}
