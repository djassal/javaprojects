package co.scan.d;

import java.util.Scanner;

public class p4 {
	static boolean checkPrime(int numberToCheck) { 
        for (int i = 2; i*i <= numberToCheck; i++){ 
            if (numberToCheck % i == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
    static int primeSum(int a, int b) { 
        int sum = 0; 
        for (int i = b; i >= a; i--) { 
            boolean isPrime = checkPrime(i); 
            if (isPrime) { 
                sum = sum + i; 
            } 
        } 
        return sum; 
    } 
    public static void main(String[] argv) {
    	Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     sc.close();
    	if(a>=3 && a<=1000 && b>=3 && b<=1000 && a<b){
        System.out.println(primeSum(a, b)); 
    }
    else {
    	System.out.println("INVALID_INPUT");
    }
} 	
}
