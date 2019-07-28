package co.d;

public class test2 {
public static void main(String[] args) {
	
	int a=1, b=2;
	if(++a == a++) {
	System.out.println(++a);
	System.out.println(a++);
	System.out.println(++b);
	System.out.println(b++);
	}
	else {
		System.out.println("EOP");
	}
}
}
