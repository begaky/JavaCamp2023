package oop1;

public class CorporateCustomer extends Customer {
	
	private String campanyName;
	private String taxNumber;
	
	public String getCampanyName() {
		return campanyName;
	}
	public void setCampanyName(String campanyName) {
		this.campanyName = campanyName;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	

}
