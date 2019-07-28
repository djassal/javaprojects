package co.scan.d;

import java.util.Scanner;

public class dowhile {

	static boolean isprime(int num) {
		for(int i=2, limit=num/2; i<=limit; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc;
		String yesno;	
		do {
			sc = new Scanner(System.in);
			System.out.print("Enter a no: ");
			int num = sc.nextInt();
			if (isprime(num)) {
				System.out.println("The number " + num + " is prime.");
			} else {
				System.out.println("The number " + num + " is not prime.");
			} 
			sc = new Scanner(System.in);
			System.out.println("Continue? Yes/no ");
			yesno = sc.nextLine();
		} while (yesno.equalsIgnoreCase("yes"));
		
sc.close();

	}
}

