/************************************************************************
 * Circle
 * Marco Gonzalez
 * 04-10-2018
 * 49) This subclass inherits from the "encapsulate" abstract superclass 
 * in order to feed it information on the shape's area and perimeter. 
 * This requires the shape's radius.
 *************************************************************************/
public class Circle extends Encapsulate{
	private double radius;
	
	public Circle(){
		super();
		radius = 0;
	}
	public Circle(double startPi, double startRadius){
		super(startPi);
		if (startRadius > 0){
			radius = startRadius;
		}
		else{
			radius = 0;
		}
	}
	public String Field1(String Dimension1){
		return "Perimeter of Circle: " + (2*super.getPi()*radius);
	}
	public String Field2(String Dimension1){
		return "Area of Circle: " + (super.getPi()*radius*radius);
	}

}
