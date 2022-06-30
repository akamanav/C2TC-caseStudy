package framework;

public abstract class PrimeAcc extends ShopAcc {
	
	private boolean isprime = true;
	private static final float deliverycharges = 0.0f;
	
	//constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isprime) {
		super(accNo, accNm, charges);
		this.isprime = isprime;
	}

	public static void main(String[] args) {}

//Read only
	//Getters and setters are used to protect your data
//	getter of isPrime
	public boolean getisPrime() {
		return this.isprime;
	}

	// getter of delivery charges 
	public  float getDeliverycharges() {
		return deliverycharges;
	}
	
	
	//Method
	
	@Override
	public void bookProduct(float book) {}
	
	@Override  // child class override the base class method
	public String toString() {
		return super.toString() + " PrimeAcc{" + "isPrime=" + isprime + '}';
	}
}