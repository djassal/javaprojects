package co.d;

public abstract class Player {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Player(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getname() {
		return firstName + " " + lastName ;
	}
	public abstract int getRating();
	
}
