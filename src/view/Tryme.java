package view;

import java.sql.SQLException;

import controller.CustomerCtr;
import db.DataAccessException;

public class Tryme {


	public Tryme() throws DataAccessException   {
		
	}
	
	public static void main(String[] args)  throws DataAccessException, SQLException {
		CustomerCtr b = new CustomerCtr();
		// work fine
		b.deleteCustomerById(9);
		
		
	}
	
}
