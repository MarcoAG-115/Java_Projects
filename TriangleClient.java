/**************************************
 * TriangleClient
 * Marco Gonzalez
 * 11-27-2017
 ***************************************/
public class TriangleClient {
	public static void main (String [ ] args) {
		
		TriangleClass newTriangleClass = new TriangleClass();
		TriangleClass Method = new TriangleClass(3,3,10);
		boolean newIsTriangle = Method.getIsTriangle();
		boolean newIsRight = Method.getIsRight();
		boolean newIsScalene = Method.getIsScalene();
		boolean newIsIsosceles = Method.getIsIsosceles();
		boolean newIsEquilateral = Method.getIsEquilateral();
		System.out.println("Triangle? - " + newIsTriangle);
		System.out.println("Right Triangle? - " + newIsRight);
		System.out.println("Scalene Triangle? - " + newIsScalene);
		System.out.println("Isosceles Triangle? - " + newIsIsosceles);
		System.out.println("Equilateral Triangle? - " + newIsEquilateral);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
