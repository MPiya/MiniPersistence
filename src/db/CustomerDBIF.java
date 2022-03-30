package db;

import java.util.List;

import model.Customer;

public interface CustomerDBIF {

	public Customer findCustomerByPhone(String phoneNo);
	
}


