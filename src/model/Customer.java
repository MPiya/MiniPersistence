package model;

public class Customer {

	private String fname; 
	private String lname;
	private String zipcode;
	private String city;
	private String phoneNo;
	int cid;
	private boolean isClubType;
	private String address;
	


	public Customer(String fname, String lname, String zipcode, String city, String phoneNo, int cid,
		boolean isClubType, String address) {
		
		this.fname = fname;
		this.lname = lname;
		this.zipcode = zipcode;
		this.city = city;
		this.phoneNo = phoneNo;
		this.cid = cid;
		this.isClubType = isClubType;
		this.address = address;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
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



	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
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

	
}
