package week7;

public class Mother extends Parent{
	String gender;
	
	public Mother() {
		super();
		this.gender = "female";
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}	
	
	public String getGender() {
		return gender;
	}
	
	public String getJobTitle(){
		jobTitle = "Full-time mum";
		return jobTitle;
	}
	
	
	public static void main(String[] args) {
				
	}
}
