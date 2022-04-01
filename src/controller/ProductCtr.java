package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import db.DataAccessException;
import db.ProductDB;
import model.Product;

public class ProductCtr {

	ProductDB productDB;
public ProductCtr() throws DataAccessException, SQLException {
	productDB = new ProductDB();
}
	
	
	
	public Product findProductById(int id)throws SQLException {
		Product product = productDB.findProductById(id);
		
		return product;
}
	public void buildObject(ResultSet rs) throws SQLException {
	productDB.buildObject(rs);
	}
}