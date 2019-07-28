package co.d.d;

public class ProductService {
	
	public static String findByNameMethod (int code) {
		for (int i=0; i<8 ; i++){
			Product a = ProductData.getProducts()[i];	
				if(a.getProdCode() == code) {
					return (a.getProdName());
				}
		}
		return null;
	}
	
	
	public static Product findMaxPriceProduct(String category) {
			double d[] = new double[8];
			for(int i =0; i<8; i++) {
				Product a = ProductData.getProducts()[i];
					if(a.getCategory().equalsIgnoreCase(category)) {
						d[i] = a.getPrice();
					}	
			}
			double max = d[0];
			for(int i = 1; i < d.length;i++) {
				if(d[i] > max) {
					max = d[i];
				}
			}
			for(int i =0; i<8; i++) {
				Product a = ProductData.getProducts()[i];
					if(a.getPrice() == max) {
						System.out.println(a.getProdCode() + "|" + a.getProdName() + "|" + a.getPrice());	
				}
			}
		return null;
	}
	
}

