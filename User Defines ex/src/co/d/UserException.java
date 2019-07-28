package co.d;

import java.util.Scanner;

public class UserException {

	public static void main(String[] args) throws InvalidLeave, InsufficientLeave {
		
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		String name = s.next();
		int bal = s.nextInt();
		int app = s.nextInt();
		Employee e1 = new Employee(id, name , bal);
		try {
			e1.getLeave(app);
			//int d = e1.getBalanceLeave();
				//d =	bal - e1.getLeave(app) ;
			//e1.setBalanceLeave((e1.getBalanceLeave() - e1.getLeave(app)));
			//e1.setBalanceLeave(e1.getBalanceLeave());
			System.out.println(e1.getLeave(app));
			System.out.println(e1.getBalanceLeave());
			System.out.println(e1.getLeave(app) - e1.getBalanceLeave());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		s.close();
	}
	
}
