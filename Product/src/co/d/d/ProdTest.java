package co.d.d;

import java.util.Scanner;

public class ProdTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int in = s.nextInt();
		
		if(in == 1) {
			int code = s.nextInt();
			if(code < 101 || code > 108) {
				System.out.println("Product Not Found");
			}
			else {
				//ProductService.findByNameMethod(code);
				System.out.println(ProductService.findByNameMethod(code));
			}
		}
		else if (in == 2) {
			String cat = s.next();
			ProductService.findMaxPriceProduct(cat);
		}
		else {
			System.out.println("Invalid choice");
		}
		s.close();
	}
}

