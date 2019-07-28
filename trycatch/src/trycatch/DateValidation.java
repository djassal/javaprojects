package trycatch;

import java.util.Scanner;

public class DateValidation {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String date = s.next();
		if(Utility.validateDate(date) == 1) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		s.close();
	}
}
