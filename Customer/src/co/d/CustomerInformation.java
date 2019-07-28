package co.d;

import java.util.Scanner;

public class CustomerInformation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int day = s.nextInt();
		int month = s.nextInt();
		int year = s.nextInt();
		String area = s.next();
		String city = s.next();
		int custId = s.nextInt();
		String name = s.next();
		SimpleDate d = new SimpleDate(day, month, year);
		Address ad = new Address(area, city);
		Customer c = new Customer(custId, name , ad, d);
		//System.out.println(SimpleDate.validateDate(d.toString()));
				//c.toString();
				c.printDetails();
				String details = c.toString();
				System.out.println(details.indexOf("1"));
				System.out.println(details.indexOf("d, d"));
				System.out.println(details.indexOf("1/1/2019")); 
				System.out.println(c.getRegistrationDate());
				System.out.println(c.getAddress());
		
		//System.out.println(Integer.parseInt(d.toString(), 0, 1, 10));
		s.close();
		//System.out.println(c.getregistrationDate().getDay());
		//System.out.println(d.toString().length());
	}
}
