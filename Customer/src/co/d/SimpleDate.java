package co.d;

public class SimpleDate {

	private int day;
	private int month;
	private int year;
	
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
		
	public static boolean isLeap(int year){
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)); 
    } 
	
	public static boolean validation(int day, int month, int year) {
		if(year<2000) {
			return false;
		}
		if(month<1 || month>12) {
			return false;
		}
		if(day<1 || day>31) {
			return false;
		}
		if (month == 2)  
        { 
            if (isLeap(year)) 
                return (day <= 29); 
            else
                return (day <= 28); 
        } 
		 if (month == 4 || month == 6 || month == 9 || month == 11) { 
		            return (day <= 30); 
		 }
		
		return true;
	}
	
	public static boolean validateDate(Object d){
		if (d.toString().length() == 10) {
			if(!(validation(Integer.parseInt(d.toString().substring(0, 2)), Integer.parseInt(d.toString().substring(3, 5)) , Integer.parseInt(d.toString().substring(6))))) {
				return false;
			}
			else {
				return true;
			}
		}
		if (d.toString().length() == 8) {
			if(!(validation(Integer.parseInt(d.toString().substring(0, 1)), Integer.parseInt(d.toString().substring(2, 3)) , Integer.parseInt(d.toString().substring(4))))) {
				return false;
			}
			else {
				return true;
			}
		}
		if (d.toString().length() == 9) {
			if(d.toString().charAt(1) == '/') {
				if(!(validation(Integer.parseInt(d.toString().substring(0, 1)), Integer.parseInt(d.toString().substring(2, 4)) , Integer.parseInt(d.toString().substring(5))))) {
					return false;
			}
			else {
				return true;
			}
		}
		else {
			if(!(validation(Integer.parseInt(d.toString().substring(0, 2)), Integer.parseInt(d.toString().substring(3, 4)) , Integer.parseInt(d.toString().substring(5))))) {
				return false;
		}
			else {
				return true;
		}
				
			}
		}
			return true;
	}
	
	@Override
	public String toString() {
		//System.out.println("Registered on : " + day + "/" + month + "/" + year);
		 return  day + "/" + month + "/" + year;
	}
}
