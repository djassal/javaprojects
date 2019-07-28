package co.scan.d;

import java.util.Scanner;

public class StaticMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//CODE START
        int input = scan.nextInt();
        if(input==1){
            
           double farhenheit = scan.nextDouble();
            Utility.fahrenheitToCelcius(farhenheit);
        }
        if(input==2){
            int n = scan.nextInt();
            int[] array = new int[n];
            for (int i=1;i<n;i++) {
            	array[i] = scan.nextInt();
            }
            Utility.getLevel(array);
        }
        if(input !=1 && input !=2) {
            System.out.println("INVALID OPTION");
        }
		//CODE END
        scan.close();
	}
}
