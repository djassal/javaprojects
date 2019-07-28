package co.d;

public class Customer {

	private int custId;
	private String name;
	private Address address;
	private SimpleDate RegistrationDate;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public SimpleDate getRegistrationDate() {
		if(!(SimpleDate.validateDate(RegistrationDate))) {
			return null;
		}
		return RegistrationDate;
	}
	public void setRegistrationDate(SimpleDate RegistrationDate) {
		this.RegistrationDate = RegistrationDate;
	}
	
	public void printDetails(){
		   System.out.println("Id : " + custId + ", Name : " + name);
			if(address.getArea().contentEquals("null")) {
				System.out.println("Address : Unknown");
			}
			if(!(address.getArea().contentEquals("null"))){
				System.out.println("Address : " + address.toString());
			}
			if(SimpleDate.validateDate(RegistrationDate)) {
				System.out.println("Registered on : " + RegistrationDate.toString());
			}
			else {  
			      System.out.println("Registered on : Unknown");
				} 
		}
	
	
	public Customer(int custId, String name, Address address, SimpleDate RegistrationDate) {
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.RegistrationDate = RegistrationDate;
	}
	@Override
	public String toString() {
		return "custId=" + custId + ", name=" + name + ", address=" + address + ", RegistrationDate="
				+ RegistrationDate;
	}
	
	
}
