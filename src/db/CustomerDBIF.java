package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Customer;


public interface CustomerDBIF {

	 Customer findCustomerByPhone(String phoneNo) throws DataAccessException ;
	 List<Customer> buildCusObjects(ResultSet rs) throws SQLException;
}


