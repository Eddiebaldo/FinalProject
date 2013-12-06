package data;

/**
 * CLASS TO SAVE DATA FOR ENROLLMENT
 * @author Eddiebaldo
 *
 */
public class data {
	private String FirstName = "";
	private String LastName = "";
	private String Gender = "";
	private String Email = "";
	private String Id = "";
	
	public data(){}
	public data(String newFirstName, String newLastName, String newGender, String newEmail, String newId){
		setFirstName(newFirstName);
		setLastName(newLastName);
		setGender(newGender);
		setEmail(newEmail);
		setId(newId);
		
	}
	
	//setters and getters
	public String getFirstName(){
		return FirstName;
		
	}
	public String getGender(){
		return Gender;
	}
	public String getLastName(){
		return LastName;
	}
	public void setFirstName(String FirstName){
		this.FirstName=FirstName;
	}
	public void setLastName(String LastName){
		this.LastName=LastName;
	}
	public void setGender(String Gender){
		this.Gender=Gender;
	}
	public String getEmail(){
		return Email;
		
	}
	public String getId(){
		return Id;
		
	}
	public void setEmail(String Email){
		this.Email = Email;
	}
	public void setId(String Id){

		this.Id = Id;
	}
	
	public String toString(){
		return(Id + " " + FirstName+"  " + LastName + " " + Gender + " "+ Email );
	}
	public String IdOnly(){
		return(FirstName+" "+ LastName);
	}
	public String Id2(){
		return(Id);
	}



}
