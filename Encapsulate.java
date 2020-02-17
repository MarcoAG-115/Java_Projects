/***************************************************************
 * Encapsulate
 * Marco Gonzalez
 * 04-10-2018
 * 49) This abstract superclass inherits to two non abstract classes 
 * in order to encapsulate them by receiving info 
 * on their perimeter and area.
 ****************************************************************/
public abstract class Encapsulate {
	private double pi ;
	
	public Encapsulate(){
		pi = 3.14;
	}
	public Encapsulate(double startPi){
		pi = startPi;
	}
	public void setPi(double newPi){
		pi = newPi;
	}
	public double getPi(){
		return pi;
	}
	public abstract String Field1(String Dimension1);
	public abstract String Field2(String Dimension1);

}
