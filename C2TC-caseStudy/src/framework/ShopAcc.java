package framework;

public abstract class ShopAcc {
	//Field
private int accNo;
private String accNm;
private float charges;


//Constructor
public ShopAcc(int accNo, String accNm, float charges) {
	super();
	this.accNo = accNo;
	this.accNm = accNm;
	this.charges = charges;
}

//getter of accNo  // Read Only
public int getAccNo() {
	return accNo;
}
//Read-Write
//getter of accNm
public String getAccNm() {
	return accNm;
}

//setter of accNm
public void setAccNm(String accNm) {
	this.accNm = accNm;
}
// Read Only
//getter of charges
public float getCharges() {
	return charges;
}


public static void main(String[] args) {}


//Method
public void bookProduct(float bool) {}
public void items(float item ) {}

public String toString() {
	return "ShopAcc{" + "accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + '}';
}

}