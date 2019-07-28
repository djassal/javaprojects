package co.scan.d;

public class Account {
	public int accountNo;
	 public double balance;
	 public String accountType;
	 public static int counter;

	 public Account(double balance, String accountType){
	 	 	this.balance = balance;
			this.accountType = accountType;
	 	  }
	 		public void depositAmount(double amount){
				double newbal = amount + balance;
				System.out.println("New Balance : " + newbal);
			}	  
	 
	 	public void printAccountDetails(){
	 	System.out.println("[Acct No : Type : " + accountType + ", Balance : " + balance + "]");
	 	 }
	 
		
 }