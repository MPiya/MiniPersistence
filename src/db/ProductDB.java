package db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Product;
import model.SaleOrder;




public class ProductDB implements ProductDBIF {
	private PreparedStatement findProductbyid;
	
	private static final String find_by_id = "select productID, salesPrice, "
										+ "countryOfOrigin, currentStock, "
										+ "productType, purchasePrice, "
										+ "location_ID, Supplier_ID  where productID=? ";
	
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
//	public boolean update (SaleOrder order) throws SQLException{
//	
//	try {
//		
//		}
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//	return product;
//}

	
}
