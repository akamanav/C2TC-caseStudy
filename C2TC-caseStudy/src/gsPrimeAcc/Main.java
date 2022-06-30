package gsPrimeAcc;

import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class Main {
	public static void main(String[] args) {
		
		// GSShopFactory to ShopFactory reference
		ShopFactory shopObj = new GSShopFactory();
		
		
		PrimeAcc primeAccObj 	= new GSPrimeAcc(1543, "prime_account_name", 1000f, true);
		primeAccObj.bookProduct(5000.0f);
		primeAccObj.toString();
		
		NormalAcc normalAccObj = new GSNormalAcc(16564, "normal_account_name", 1000f, NormalAcc.getDeliverycharges());
		normalAccObj.bookProduct(5000.0f);
		normalAccObj.toString();
	}

}