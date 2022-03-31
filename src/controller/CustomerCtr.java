package controller;

import java.sql.SQLException;
import java.util.List;
import db.CustomerDB;
import db.DataAccessException;
import model.Customer;



public class CustomerCtr  {

	private CustomerDB cdb;
	
	public CustomerCtr()  throws DataAccessException {
		this.cdb = new CustomerDB();
		 
	}
	
	public Customer findCustomerByPhone(String phoneno) throws DataAccessException {
		Customer a = cdb.findCustomerByPhone(phoneno);
		return a;
		
	}
	
	public void insertCustomertoDB(String fname, String lname, String zipcode, String city, String phoneno, Boolean isClupType, String Address) throws SQLException {
	
		cdb.insertCustomertoDB(fname, lname, zipcode, city, phoneno, isClupType, Address);
}
	public void deleteCustomerById(int cid) throws SQLException {
		cdb.deleteCustomerbyID(cid);
	}
}

