package model;

public class Customer {

	private String name; 
	private boolean isClubType;
	private String address;
	private String zipcode;
	private String city;
	private String phoneNo;
	int customerID;
	
	Customer(String name, boolean isClubType, String address, String zipcode,String city, String phoneNo, int customerID ) {
		this.name = name;
		this.isClubType = isClubType;
		this.address = address;
		this.zipcode = zipcode;
		this.city = city;
		this.phoneNo= phoneNo;
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isClubType() {
		return isClubType;
	}

	public void setClubType(boolean isClubType) {
		this.isClubType = isClubType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
}
