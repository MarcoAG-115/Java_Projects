/************************************************************************
 * EncapsulateClient
 * Marco Gonzalez
 * 04-10-2018
 * 49) Required info on the shapes is entered, and their area 
 * and perimeter are returned.
 *************************************************************************/
public class EncapsulateClient {
	public static void main(String [] args){
		Circle x = new Circle(3.14, 25.5);
		System.out.println(x.Field1("Encapsulate Circle"));
		System.out.println(x.Field2("Encapsulate Circle"));
		
		Rectangle y = new Rectangle(5.5, 2.5);
		System.out.println(y.Field1("Encapsulate Rectangle"));
		System.out.println(y.Field2("Encapsulate Rectangle"));
	}
}
