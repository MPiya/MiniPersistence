package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ctrl.DataAccessException;
import model.Customer;
import model.Product;
import model.SaleOrder;




public class ProductDB implements ProductDBIF {
	private String findProductbyid;
	private PreparedStatement updateSaleOrder;
	
	
	public ProductDB() throws SQLException {
		Connection connection = DBConnection.getInstance().getConnection();
		
		try {
			find_by_id   =DBConnection.getInstance().getConnection()
					.prepareStatement(findProductbyid);
			
			update =DBConnection.getInstance().getConnection().prepareStatement(updateSaleOrder);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	private static final String find_by_id = "select productID, salesPrice, "
										+ "countryOfOrigin, currentStock, "
										+ "productType, purchasePrice, "
										+ "location_ID, Supplier_ID  where productID=? ";
	private static final String update="select saleOrderID, select deliveryStatus, "
										+ "select deliveryDate, select discount, "
										+ "select deliveryDate, "
										+ "select date where saleOrderID=?";
	
	public Product findProductbyid(int productID)throws SQLException {
		Product product = null;
		try {
			findProductbyid.setInt(1, productID);
			ResultSet rs = findProductbyid.executeQuery();
			if (rs.next()) {
				product = buildObject(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}
	
	
	

	private Product buildObject(ResultSet rs) throws SQLException {
		Product product = new Product();
		try {
			
			product.setName(rs.getString("product name"));
			product.setProductID (rs.getInt("Product ID"));
			product.setPurchasePrice(rs.getDouble("Purchase Price"));
			product.setCountryOfOrigin(rs.getString("Country Of Origin"));
			product.setMinStock(rs.getInt("Min Stock"));
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return product;
	}
	
	private List<Product> buildObjects(ResultSet rs) throws SQLException {
		List<Product> prodoct = new ArrayList<>();
		while(rs.next()) {
			prodoct.add(buildObject(rs));
		}
		return prodoct;
	}
	public boolean update (SaleOrder saleOrder) throws SQLException{
	try (Connection connection = getConnection();
			    {
			    	updateSaleOrder.setInt(1, saleOrder.getSaleOrderID());
			    	updateSaleOrder.setLocalDate(2, saleOrder.getDate());
			    	updateSaleOrder.setString(3, saleOrder.getDeliveryDate());
			    	updateSaleOrder.setDouble(4, saleOrder.getDiscount());
			    	updateSaleOrder.setString(5, saleOrder.getDeliveryStatus());
				   
			 } catch (SQLException ex) {
			  throw new SQLException(ex.getMessage(), ex);
			 }
			}

	
}
