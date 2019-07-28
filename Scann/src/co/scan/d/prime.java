package co.scan.d;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int num = scan.nextInt();
	boolean isprime=true;
	for (int i=2, limit = num/2; i<=limit; i++) {
		if(num%i==0) {
			isprime=false;
			break;
		}
	}
		
		if (isprime) {
			System.out.println(num + " is a Prime Number.");	
		}
		else {
			System.out.println(num + " is not a Prime Number.");
		}
		scan.close();
	}
}

