package view;

import java.sql.SQLException;
import java.time.LocalDate;

import controller.CustomerCtr;
import controller.ProductCtr;
import controller.SaleOrderController;
import db.DataAccessException;
import model.Customer;
import model.Product;
import model.SaleOrder;
import model.SalesOrderLine;

public class Tryme {


	public Tryme() throws DataAccessException   {
		
	}
	
	public static void main(String[] args)  throws DataAccessException, SQLException {
		CustomerCtr c = new CustomerCtr();
		ProductCtr p = new ProductCtr();
		SaleOrderController o = new SaleOrderController();
		/* work fine
		b.deleteCustomerById(9);
		*/
		
		/* work fine
		b.findCustomerByPhone("004511223344");
		*/
		
		/* Work fine
		p.findProductById(6); 
		*/
		String date = "2022-08-16";
		String dDate = "2022-12-30";
        
        LocalDate sDate = LocalDate.parse(date);
        LocalDate eDate = LocalDate.parse(dDate);
		
		Customer cus = c.findCustomerByPhone("004511223344");
		SaleOrder so = o.createSalesOrderAddCustomer(sDate, "Ikke sendt", eDate, 0.0, cus, 2400);
		
		Product pr = p.findProductById(6);
		Product pr2 = p.findProductById(5);
		
		SalesOrderLine sol = o.createSalesOrderLineAddProduct(2, 1000, pr);
		SalesOrderLine sol2 = o.createSalesOrderLineAddProduct(2, 1000, pr2);
		
		so.addSalesOrderLine(sol);
		so.addSalesOrderLine(sol2);
		
		o.saveOrder(so);
		
				
	}
	
}
