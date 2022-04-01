package controller;

import java.time.LocalDate;

import db.DataAccessException;
import db.SaleOrderDB;
import db.SaleOrderDBIF;
import model.Customer;
import model.Product;
import model.SaleOrder;
import model.SalesOrderLine;

public class SaleOrderController {
	
	private SaleOrderDBIF saleOrderDB;
	
	public SaleOrderController() throws DataAccessException {
		this.saleOrderDB = new SaleOrderDB();
	}
	
	public SaleOrder createSalesOrderAddCustomer(LocalDate date, String deliveryStatus, LocalDate deliveryDate, double discount, Customer customer, LocalDate paymentDate) {
		SaleOrder o = new SaleOrder(date, deliveryStatus, deliveryDate, discount, customer, paymentDate);
		return o;
	}
	
	public SalesOrderLine createSalesOrderLineAddProduct(int quantity, double actuelSalsPrice, Product product) {
		SalesOrderLine sol = new SalesOrderLine(quantity, actuelSalsPrice);
		sol.setProduct(product);
		return sol;
	}
	
	public void saveOrder(SaleOrder o) throws DataAccessException {
		saleOrderDB.saveOrder(o);
	}
	
	

}
