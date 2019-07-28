package co.scan.d;

import java.util.Scanner;

public class ShapeDemo {
	public static void printShape(String Shape) {
		}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String input = s.next();
		if (input.equalsIgnoreCase("CIRCLE")) {
			String c = s.next();
			int r = s.nextInt();
			Circle c1 = new Circle(c, r);
			System.out.println(c1.toString());
			System.out.println("Area: " + (int) c1.getArea() + ",Perimeter: " + (int) c1.getPerimeter());
			}
		
		if (input.equalsIgnoreCase("RECTANGLE")) {
			String c = s.next();
			int l = s.nextInt();
			int b = s.nextInt();
			Rectangle r1 = new Rectangle(c, l, b);
			System.out.println(r1.toString());
			System.out.println("Area: " + (int) r1.getArea() + ",Perimeter: " + (int) r1.getPerimeter());
	
		}
		s.close();
	}
	
	
}

	

