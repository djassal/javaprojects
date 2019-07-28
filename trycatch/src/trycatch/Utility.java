package trycatch;

public class Utility {
	public static boolean isLeap(int year){
		return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)); 
    } 
	
	public static boolean validation(int day, int month, int year) {
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
	
		public static int validateDate(String date){
			if(!(validation(Integer.parseInt(date.substring(0, 2)), Integer.parseInt(date.substring(3, 5)) , Integer.parseInt(date.substring(6))))) {
			return -1;
			}
			return 1;
		} 
		
}
