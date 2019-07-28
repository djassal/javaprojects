package co.d;

public class Employee {

	private int empNo;
	private String empName;
	private int balanceLeave;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getBalanceLeave() {
		return balanceLeave ;
	}
	public void setBalanceLeave(int balanceLeave) {
		this.balanceLeave = balanceLeave;
	}
	public Employee(int empNo, String empName, int balanceLeave) {
		this.empNo = empNo;
		this.empName = empName;
		this.balanceLeave = balanceLeave;
	}
	
	public int getLeave(int appliedleave) throws InvalidLeave, InsufficientLeave {
		try {
			if(balanceLeave < 0) {
				throw new InvalidLeave("Negative Leave balance");
			}
			if(appliedleave > balanceLeave) {
				throw new InsufficientLeave("Insufficient Leave");
			}
			if(appliedleave < 0) {
				throw new InvalidLeave("Invalid Entry");
			}
		} catch (InvalidLeave e) {
			//System.out.println("Negative Leave balance");
			throw e;
			
		} catch (InsufficientLeave e) {
			//System.out.println("Insufficient Leave");
			throw e;
		}
		
		return balanceLeave - appliedleave;
	}
	
}
