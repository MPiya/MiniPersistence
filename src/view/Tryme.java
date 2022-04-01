package view;

import java.sql.SQLException;

import controller.CustomerCtr;
import controller.ProductCtr;
import db.DataAccessException;

public class Tryme {


	public Tryme() throws DataAccessException   {
		
	}
	
	public static void main(String[] args)  throws DataAccessException, SQLException {
		CustomerCtr b = new CustomerCtr();
		ProductCtr p = new ProductCtr();
		/* work fine
		b.deleteCustomerById(9);
		*/
		
		/* work fine
		b.findCustomerByPhone("004511223344");
		*/
		
		/* Work fine
		p.findProductById(6); 
		*/
	}
	
}
