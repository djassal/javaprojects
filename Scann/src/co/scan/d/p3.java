package co.scan.d;

public class p3 {

	public static void main(String[] args) {
		int a=3;
		int b=8;

		if(a<b && b<0)
		a=b;
		else 
		b=a++;
		System.out.println("a="+a+"b="+b);
	}
}
