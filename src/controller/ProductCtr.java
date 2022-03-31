package controller;

import java.sql.SQLException;

import db.ProductDB;
import model.Product;

public class ProductCtr {

	
	ProductDB productctrl;
	
	public Product findProductById(int id)throws SQLException {
		Product product = productctrl.findProductById(id);
		
		return product;
}
	

}