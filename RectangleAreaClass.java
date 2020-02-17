/**************************************
 * RectangleAreaClass
 * Marco Gonzalez
 * 11-16-2017
 * This program will solve for the area 
 * of a rectangle using parameters 
 * set by a client class.
 ***************************************/
public class RectangleAreaClass {
	
	//Instance Variables
	private int width; //measurement for the width of the rectangles
	private int height; //measurement for the height of the rectangles
	
	//Default Constructor:
	//initializing width and height to 0
	public RectangleAreaClass ( ) {
	}
	
	//Overload Constructor:
	//user will set values for width and height
	public RectangleAreaClass ( int startWidth, int startHeight ) {
		
		// check the startWidth feasibility 
				if (startWidth >= 0) {
					width = startWidth;
				}
				else {
					System.err.println("Width is negative.");
					System.err.println("Value set to 0.");
				}
				
				//check the startHeight feasibility
				if (startHeight >= 0){
					height = startHeight;
				}
				else {
					System.err.println("Height is negative.");
					System.err.println("Value set to 0.");
				}
	}
	
	//Accessor Method:
	//returns current value of width
	public int getWidth( ) {
		return width;
	}
	//returns current value of height
		public int getHeight( ) {
			return height;
	}
		
	//Mutator Method:
	//allows the client to set or change the value of width
	//print an error if the new value is negative
	public void setWidth( int newWidth ){
		if (newWidth >= 0)
			width = newWidth;
		else{
			System.err.println("Width cannot be be negative.");
			System.err.println("Value not changed.");
		}
	}
	//allows the client to set or change the value of height
	//print an error if the new value is negative
	public void setHeight( int newHeight ){
		if (newHeight >= 0)
			height = newHeight;
		else{
			System.err.println("Height cannot be be negative.");
			System.err.println("Value not changed.");
		}
	}
	
	//Method:
	//calculates the area using the new values for width and height, and sets it equal to area
	public int getArea ( ) {
		return width*height;
	}

}
