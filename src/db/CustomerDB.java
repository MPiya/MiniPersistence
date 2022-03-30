package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class CustomerDB implements CustomerDBIF {
	
		
		private static final String findByPhone = "select fname,lname,zipcode,city,phoneno,cid,isClupType,address from customer where phoneno = ? ";
		private static final String showCustomer = " select fname  from customer where cid =1";
		
		private PreparedStatement findAll, findById, update, findCBP, showCus;

		public CustomerDB () throws DataAccessException {
			try {
			
				findCBP = DBConnection.getInstance().getConnection()
						.prepareStatement(findByPhone);
				showCus = DBConnection.getInstance().getConnection()
						.prepareStatement(showCustomer);
			} catch (SQLException e) {
			 System.out.println("ERROR");
			}
		}
		
		@Override
		public Customer findCustomerByPhone(String phoneNo) throws DataAccessException {
			 Customer  a = null;
			try {
				
				findCBP.setString(1, phoneNo);
				ResultSet rs = findCBP.executeQuery();
				if(rs.next()) {

				a = buildCusObject(rs);
								
				
				}}
			catch (SQLException e ) {
				System.out.println( " No found id = " + phoneNo);
				throw new DataAccessException(e, "Could not find by id = " + phoneNo);
									}
			return a;
				}
		
		private Customer buildCusObject(ResultSet rs) throws SQLException {
			Customer p = new Customer(
					rs.getString("fname"),
					rs.getString("lname"),
					rs.getString("zipcode"),
					rs.getString("city"),
					rs.getString("phoneno"),
					rs.getInt("cid"),
					rs.getBoolean("isClupType"),
					rs.getString("address")
					
					);
			System.out.println("Object customer is created in Java ");
			return p;
			
				
		}
		
		private List<Customer> buildCusObjects(ResultSet rs) throws SQLException {
			List<Customer> res = new ArrayList<>();
			while(rs.next()) {
				res.add(buildCusObject(rs));
			}
			return res;
		}
		
			
		public void showMe() throws DataAccessException  {
			try (ResultSet ab = showCus.executeQuery()) {
				while(ab.next()) {
					System.out.print("hi " + ab.getString("fname"));
				}}
				
				catch (SQLException e) {
			         e.printStackTrace();
			      } 
			}
		
	
//work fine will be changed to comment later
		 public static void main(String[] args) throws DataAccessException {
			CustomerDB c = new CustomerDB();
			
		
			c.findCustomerByPhone("22222");
			c.showMe();
			
		}
	
}
