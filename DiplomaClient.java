/********************************************************************
 * DiplomaClient
 * Marco Gonzalez
 * 04-10-2018
 * Accepts inputs for the DiplomaClass and DiplomaWithHonors
 * in order to display a user's diploma information.
 ********************************************************************/
public class DiplomaClient {
	public static void main(String [] args){
		DiplomaClass diploma1= new DiplomaClass("Adam Smith", "Engineering");
		System.out.println(diploma1);
		System.out.println();
		DiplomaClass diploma2 = new DiplomaWithHonors("honors","Betsy Smith", "Computer Science"); 
		System.out.println(diploma2);
		System.out.println();
		
	}

}
