package framework;

 public abstract class NormalAcc extends ShopAcc {
	 private   static final  float deliveryCharges = 45.0f;
	 
	 //constructor
	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		super(accNo, accNm, charges);
	
	}
	public static void main(String[] args) {}

	// Getter and setter
	public static  float getDeliverycharges() {
		return deliveryCharges;
	}

	@Override
	public void bookProduct(float book) {

	}

	@Override
	public String toString() {
		return super.toString() + " NormalAcc{" + "DeliveryCharges=" + deliveryCharges + "}";
	}
}