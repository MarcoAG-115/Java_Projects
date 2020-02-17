/************************************************************************
 * Rectangle
 * Marco Gonzalez
 * 04-10-2018
 * 49) This subclass inherits from the "encapsulate" abstract superclass 
 * in order to feed it information on the shape's area and perimeter.
 * This requires the shape's height and width.
 *************************************************************************/
public class Rectangle extends Encapsulate{
	private double height;
	private double width;
	
	public Rectangle(){
		height = 0;
		width = 0;
	}
	public Rectangle(double startHeight, double startWidth){
		if (startHeight > 0){
			height = startHeight;
		}
		else{
			height = 0;
		}
		if (startWidth > 0){
			width = startWidth;
		}
		else{
			width = 0;
		}
	}
	public String Field1(String Dimension1){
		return "Perimeter of Rectangle: " + ((2*height) + (2*width));
	}
	public String Field2(String Dimension1){
		return "Area of Rectangle: " + (height*width);
	}

}
