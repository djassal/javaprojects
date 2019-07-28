package co.scan.d;

public class EqualityCheck {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);
		Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
		c1.setEmail("vinod@mailinator.com");
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
		c2.setEmail("vinod@mailinator.com");
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c1));
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		System.out.println(c3.equals(c4));
	}
}
