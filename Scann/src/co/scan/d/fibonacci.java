package co.scan.d;

public class fibonacci {

	public static void main(String[] args) {
		
		int a,b ;
		int c;
		int limit=100;
		a=-1;
		b=1;
		while(true) {
			c=a+b;	
			if(c>limit) {
				break;
			}
			a=b;
			b=c;
		}
	
		int d=3;
		int e=8;

		if(d<e && e<0)
		d=e;
		else 
		d=e++;
		System.out.println("d="+ d +"e="+ e );
}
}