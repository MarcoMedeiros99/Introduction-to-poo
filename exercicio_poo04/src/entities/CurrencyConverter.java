package entities;

public class CurrencyConverter {
	
	public static double iof = 0.06;
	
	public static double buyDollar( double priceDollar, double dollar) {
		return  priceDollar *  dollar * (1.0 + iof);
	}
	
	
	
	

}