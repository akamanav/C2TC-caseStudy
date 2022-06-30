package gsPrimeAcc;
import framework.NormalAcc;
public class GSNormalAcc extends NormalAcc {
//constructor
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}
	
	@Override
	public void bookProduct(float charges) {
//		
		System.out.println(  "Normal user your charges are "+ getCharges() + " "+"with Delivery charges is  "+ getDeliverycharges());
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}