/*******************************************************
 * DiplomaClass
 * Marco Gonzalez
 * 04-10-2018
 * This class stands in as the superclass 
 * in which the DiplomaWithHonors inherits from.
 *  Together they accept inputs
 *   and display information found within a diploma.
 ********************************************************/
public class DiplomaClass {
	private String name;
	private String major;
	
		public DiplomaClass (String newName, String newMajor){
			setName(newName);
			setMajor(newMajor);
		}
	
		public String getName(){
			return name;
		}
		public String getMajor(){
			return major;
		}
	
		public void setName(String newName){
			name = newName;
		}
		public void setMajor(String newMajor){
			major= newMajor;
		}
	
		public String toString(){
			return ("This certifies that " + name + " has completed a degree in " + major + ".");
		}
}
