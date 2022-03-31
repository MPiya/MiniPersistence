package view;

import controller.CustomerCtr;
import db.DataAccessException;

public class Tryme {


	public Tryme() throws DataAccessException   {
		
	}
	
	public static void main(String[] args)  throws DataAccessException {
		CustomerCtr b = new CustomerCtr();
		// work fine
		b.findCustomerByPhone("22222");
		
	}
	
}
