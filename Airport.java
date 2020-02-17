/*********************
 * Airport
 * Marco Gonzalez
 * 11-14-2017
 **********************/
public class Airport {

	//Instance variables:
	
	private String airportCode; //model of auto
	private int gates; //number of miles driven
	
	//Default constructor:
	
	public Airport ( ) {
		airportCode = "";
	}
	
	//Overload constructor:
	
	public Airport (String startAirportCode, int startGates) {
		airportCode = startAirportCode;
	
	//checking feasibility of gates
	if (startGates >= 0){
		gates = startGates;
	}
	else {
		System.err.println("Gate number is negative.");
		System.err.println("Value set to 0.");
	}
	}
	
	//Accessor Method:
	
	//returns current value of airportCode
	public String getAirportCode( ) {
		return airportCode;
	}
	//returns current value of gates
	public int getGates( ) {
		return gates;
	}
	
	//Mutator Method:
	
	//allows client to set or change the value of airportCode
	public void setAirportCode( String newAirportCode) {
		airportCode = newAirportCode;
	}
	//allows client to set or change the value of gates
	//prints error if value is negative
	public void setGates( int newGates ) {
		if (newGates >= 0)
			gates = newGates;
		else {
			System.err.println("Gates cannot be negative.");
			System.err.println("Value not changed.");
		}
	}
}

