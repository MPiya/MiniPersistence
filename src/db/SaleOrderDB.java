package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Customer;
import model.Dog;
import model.SaleOrder;
import model.SalesOrderLine;

public class SaleOrderDB implements SaleOrderDBIF {
	
	private static final String INSERT_SALEORDER_Q = "insert into saleorder (dato, deliveryStatus, deliveryDato, discount, customer_id, paymentdate) " 
													+ "values (?, ?, ?, ?, ?, ?)";
	private static final String INSERT_SALEORDERLINE_Q = "insert into salesOrderLines (order_id, productt_ID, quantity, actuelSalsPrice) values (?, ?, ?, ?)";
	
	private PreparedStatement insertPS, insertPSsol;
	
	public SaleOrderDB() throws DataAccessException {
		Connection con = DBConnection.getInstance().getConnection();
		try {
			insertPS = con.prepareStatement(INSERT_SALEORDER_Q, PreparedStatement.RETURN_GENERATED_KEYS);
			insertPSsol = con.prepareStatement(INSERT_SALEORDERLINE_Q);
		} catch (SQLException e) {
			throw new DataAccessException("Could not prepare SaleOrder prepared statement", e);
		}
	}

	@Override
	public void saveOrder(SaleOrder o) throws DataAccessException {
		try {
			insertPS.setString(1, o.getDate().toString()); //TODO: EFTERTJEK ALLE DIAGRAMMER DM/DC/RDM, SQL SCRIPT OG SAMT KODE ER SAMMENHÆNGENDE!
			insertPS.setString(2, o.getDeliveryStatus());
			insertPS.setString(3, o.getDeliveryDate().toString());
			insertPS.setDouble(4, o.getDiscount());
			insertPS.setInt(5, o.getCustomer().getCid()); 
			insertPS.setString(6, o.getPaymentDate().toString());
			//insertPS.setDouble(7, o.getAmount());
			
			//insertPS.executeUpdate();
			int id = DBConnection.getInstance().executeInsertWithIdentity(insertPS);
			
			o.setSaleOrderID(id);
			
			insertOrderlines(o);
		} catch (SQLException e) {
			throw new DataAccessException("Could not save sale order",e);
		}
	}
	
	private void insertOrderlines(SaleOrder o) throws DataAccessException {
		try {
			int size = o.getSalesOrderLines().size();
			
			for(int i = 0; i < size; i++ ) {
				SalesOrderLine currSol = o.getSalesOrderLines().get(i);
				
				insertPSsol.setInt(1, o.getSaleOrderID());
				insertPSsol.setInt(2, currSol.getProduct().getProductID());
				insertPSsol.setInt(3, currSol.getQuantity());
				insertPSsol.setDouble(4, currSol.getActuelSalsPrice());
				insertPSsol.executeUpdate();
			}
			
		} catch (SQLException e) {
			throw new DataAccessException( "Could not save sale order lines", e);
		}
	}
	

}
