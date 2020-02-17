/*************************************************************
 * DiplomaWithHonors
 * Marco Gonzalez
 * 04-10-2018
 * This subclass inherits from the DiplomaClass 
 * to perform the same function and adding "with honors"
 **************************************************************/
public class DiplomaWithHonors extends DiplomaClass {
	private String honors = "honors";
	
	public DiplomaWithHonors (String startHonors, String newName, String newMajor){
		super(newName, newMajor);
		setHonors(honors);
	}
	public String getHonors(){
		return honors;
	}
	public void setHonors(String newHonors){
		honors = "honors";
	}
	
	public String toString(){
		if(honors.equalsIgnoreCase("Honors")){
			return super.toString()+" *** with honors ***";
		}
		else{
			return "";
		}
	}

}
