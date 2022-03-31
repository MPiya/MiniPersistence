package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.Customer;
import model.Product;
import model.SaleOrder;




public class ProductDB implements ProductDBIF {
	
	
	private static final String find_by_id = "select name, productID, salesPrice, "
			+ "countryofOrigin, currentStock, "
			+ "productType, purchasePrice, "
			+ "location_ID, Supplier_ID  from product where productID=? ";
private static final String update="select saleOrderID, select deliveryStatus, "
			+ "select deliveryDate, select discount, "
			+ "select deliveryDate, "
			+ "select date where saleOrderID=?";

private String findProductbyid;
private PreparedStatement updateSaleOrder, findById;
	
	public ProductDB() throws SQLException {
		Connection connection = DBConnection.getInstance().getConnection();
		
		try {
			findById =DBConnection.getInstance().getConnection()
					.prepareStatement(find_by_id);
			
			updateSaleOrder =DBConnection.getInstance().getConnection().prepareStatement(update);
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	
	
	
	public Product findProductById(int productID)throws SQLException {
		Product product = null;
		try {
			findById.setInt(1, productID);
			ResultSet rs = findById.executeQuery();
			if (rs.next()) {
				product = buildObject(rs);
				
				System.out.println("Object is created");
			}
		} catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		return product;
	}
	
	
	

	private Product buildObject(ResultSet rs) throws SQLException {
		Product product = new Product(
				rs.getString("name"),
				rs.getInt("productID"),
				rs.getDouble("salesPrice"),
				rs.getString("countryofOrigin"),
				rs.getInt("currentStock")

		);
		return product;
	}
	
	private List<Product> buildObjects(ResultSet rs) throws SQLException {
		List<Product> prodoct = new ArrayList<>();
		while(rs.next()) {
			prodoct.add(buildObject(rs));
		}
		return prodoct;
	}
	
	/*
	public boolean update (SaleOrder saleOrder) throws SQLException{
	try 
			    {
			    	updateSaleOrder.setInt(1, saleOrder.getSaleOrderID());
			    	updateSaleOrder.setDate(2, saleOrder.getDate());
			    	updateSaleOrder.setString(3, saleOrder.getDeliveryDate());
			    	updateSaleOrder.setDouble(4, saleOrder.getDiscount());
			    	updateSaleOrder.setString(5, saleOrder.getDeliveryStatus());
				   
			 } catch (SQLException ex) {
			  throw new SQLException(ex.getMessage(), ex);
			 }
			}
*/
	
	public static void main(String[] args) throws SQLException {
		ProductDB c = new ProductDB();
		c.findProductById(6);
		
	}
	
}
