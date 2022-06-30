package gsPrimeAcc;
import framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	private static final float charges = 1000f; // change required 
	
	//constructor
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges, isprime);
		
	}
	// getter and setter
	public float getCharges() {
		return GSPrimeAcc.charges;
	}
	@Override
	public void bookProduct(float book) {
		
    System.out.println("Prime user your charges are "+ getCharges());
	}

	@Override
	public String toString() {
		return super.toString() ;
	}
}