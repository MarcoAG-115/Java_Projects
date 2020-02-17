/**************************************
 * TriangleClass
 * Marco Gonzalez
 * 11-27-2017
 * This program will identify a type of
 *  triangle through analyzing three
 *   inputs from the user.
 ***************************************/
public class TriangleClass {
	
	//Instance Variables
	private double SideOne;
	private double SideTwo;
	private double SideThree;
	
	//Default Constructor:
	//Side variables are initialized to zero
	public TriangleClass () {
		
	}
	
	//Overload Constructor:
	//user sets value for each side variable
	public TriangleClass ( double startSideOne , double startSideTwo , double startSideThree ) {
		
		// check the startSideOne feasibility 
		if (startSideOne >= 0) {
			SideOne = startSideOne;
		}
		else {
			System.err.println("Value entered is negative.");
			System.err.println("Value set to 0.");
		}
		
		// check the startSideTwo feasibility 
				if (startSideTwo >= 0) {
					SideTwo = startSideTwo;
				}
				else {
					System.err.println("Value entered is negative.");
					System.err.println("Value set to 0.");
				}
				
				// check the startSideThree feasibility 
				if (startSideThree >= 0) {
					SideThree = startSideThree;
				}
				else {
					System.err.println("Value entered is negative.");
					System.err.println("Value set to 0.");
				}
	}
	
	//Accessor Method
	//returns current value of SideOne
	public double getSideOne( ) {
		return SideOne;
	}
	//returns current value of SideTwo
		public double getSideTwo( ) {
			return SideTwo;
	}
	//returns current value of SideThree
		public double getSideThree( ) {
			return SideThree;
	}
		
	//Mutator Method
	//Client is able to set or change the value of SideOne
	public void setSideOne( double newSideOne ){
		if (newSideOne >= 0)
			SideOne = newSideOne;
		else{
			System.err.println("The value cannot be be negative.");
			System.err.println("Value not changed.");
		}
	}
	//Client is able to set or change the value of SideTwo
	public void setSideTwo( double newSideTwo ){
		if (newSideTwo >= 0)
			SideTwo = newSideTwo;
		else{
			System.err.println("The value cannot be be negative.");
			System.err.println("Value not changed.");
		}
	}
	//Client is able to set or change the value of SideThree
	public void setSideThree( double newSideThree ){
		if (newSideThree >= 0)
			SideThree = newSideThree;
		else{
			System.err.println("The value cannot be be negative.");
			System.err.println("Value not changed.");
		}
	}
	
	//Methods
	//checks off the characteristics that do not relate to the entered side values
	public boolean getIsTriangle ( ) {
		if (SideOne > 0 && SideTwo > 0 && SideThree > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean getIsRight ( ) {
		double x = SideOne*SideOne;
		double y = SideTwo*SideTwo;
		double z = SideThree*SideThree;
		if (SideOne > SideTwo && SideOne > SideThree) {
			if ((y+z) == x) {
				return true;
			}
			else {
				return false;
			}
		}
		else if (SideTwo > SideOne && SideTwo > SideThree) {
			if ( (z+x) == y) {
				return true;
			}
			else {
				return false;
			}
		}
		else if (SideThree > SideOne && SideThree > SideTwo) {
			if ( (x+y) == z) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public boolean getIsScalene ( ) {
		if (SideOne != SideTwo && SideOne != SideThree && SideTwo != SideThree) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean getIsIsosceles ( ) {
		if (((SideOne == SideTwo || SideOne == SideThree) && (SideTwo != SideThree)) || ((SideThree == SideTwo || SideOne == SideThree) && (SideTwo != SideOne)) || ((SideOne == SideTwo || SideTwo == SideThree) && (SideOne != SideThree)) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean getIsEquilateral ( ) {
		if (SideOne == SideTwo && SideOne == SideThree && SideTwo == SideThree) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
