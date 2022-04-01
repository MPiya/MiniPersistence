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
		
		//Create dates to send to SaleOrder constructor
		String date = "2022-08-16";
		String dDate = "2022-12-30";
        LocalDate sDate = LocalDate.parse(date);
        LocalDate eDate = LocalDate.parse(dDate);
        LocalDate pDate = LocalDate.parse(date);
		//Find customer and create a sales order object
		Customer cus = c.findCustomerByPhone("004511223344");
		SaleOrder so = o.createSalesOrderAddCustomer(sDate, "Ikke sendt", eDate, 0.0, cus, pDate);
		//Find products
		Product pr = p.findProductById(8832);
		Product pr2 = p.findProductById(11122);
		//create order line and add the products
		SalesOrderLine sol = o.createSalesOrderLineAddProduct(2, 1000, pr);
		SalesOrderLine sol2 = o.createSalesOrderLineAddProduct(2, 200, pr2);
		//build the complete order object
		so.addSalesOrderLine(sol);
		so.addSalesOrderLine(sol2);
		//save the order
		o.saveOrder(so);
		
				
	}
	
}
