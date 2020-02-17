/******************************************
 * JavaStudy
 * Marco Gonzalez
 * 10-31-2017
 * This class includes a method that
 *  simulates the learning progress and
 * returns the number of months
 * it will take to get ready for an exam.
 * The program displays the result
 * in years and months.
 ********************************************/
public class JavaStudy {
		
			public static void main(String[] args){
			
			//Variables used within the while loop are initialized and given initial values	
				
			double NoKnow = 1;
			int months = 0;
			
			//The while loop continues to find how much has been learned until the amount learned is 95% or more
			//The number of months is counted every iteration
			
			while (NoKnow > .05 )
			{
				NoKnow = NoKnow-(NoKnow*.1);
				months = months + 1;
			}
			
		}
		
		public static void Simulation( int months){
			
		//The program utilizes the value of months to find the number of years and months that it will take to learn +95% of the material
			
		int ReMonths = months%12;
		int years = months/12;
		System.out.println("It will take "+years+" years and "+ReMonths+" months.");
	}
}
