
public class RectangleAreaClient {
	public static void main (String [ ] args) {
		
		RectangleAreaClass newRectangleAreaClass = new RectangleAreaClass();
		RectangleAreaClass Method1 = new RectangleAreaClass( 3,4 );
		int newArea = Method1.getArea();
		System.out.println("The area is " + newArea + ".");
	}

}
