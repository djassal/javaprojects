package co.scan.d;

public class Utility {
	

		public static int fahrenheitToCelcius(double farhenheit) {
			//CODE START
			double celcius = (farhenheit - 32) * 5 / 9;
	       	System.out.println((int)Math.round(celcius));
			return (int) celcius;
	        //CODE END
		}

		public static String getLevel(int[] array) {
			//CODE START
	        int sum = 0;
		    for(int i = 0; i < array.length; i++)
		        {
		        sum = sum + array[i];
		        }
		        if (sum>=100){
		        	return "HIGH";
		        } 
		        if (sum>=70 && sum<100){
		        	return "MEDIUM";
		        }
		        if (sum<70){
		        	return "LOW";
		        }
	        return null;
			//CODE END
		}
	}
