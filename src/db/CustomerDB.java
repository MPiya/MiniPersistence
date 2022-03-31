package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class CustomerDB implements CustomerDBIF {
	
		
		private static final String findByPhone = "select fname,lname,zipcode,city,phoneno,cid,isClupType,address from customer where phoneno = ? ";
		private static final String showCustomer = " select fname  from customer where cid =1";
		private static final String createCustomer = "INSERT INTO customer (fname, lname,zipcode,city,phoneno,isClupType,address)	 "
				+ "values (?, ?, ?,?,?,?,?)";
		private static final String deleteCustomer = " Delete from customer where cid = ? ";
		private PreparedStatement createCus, findCBP, showCus, deleteCus;
		

		public CustomerDB () throws DataAccessException {
			try {
			
				findCBP = DBConnection.getInstance().getConnection()
						.prepareStatement(findByPhone);
				showCus = DBConnection.getInstance().getConnection()
						.prepareStatement(showCustomer);
				createCus = DBConnection.getInstance().getConnection()
						.prepareStatement(createCustomer);
				deleteCus =  DBConnection.getInstance().getConnection()
						.prepareStatement(deleteCustomer);
				
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
		
		 public List<Customer> buildCusObjects(ResultSet rs) throws SQLException {
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
		public void insertCustomertoDB(String fname, String lname, String zipcode, String city, String phoneno, Boolean isClupType, String Address) throws SQLException {
			createCus.setString(1,fname);
			createCus.setString(2,lname);
			createCus.setString(3,zipcode);
			createCus.setString(4,city);
			createCus.setString(5,phoneno);
			createCus.setBoolean(6, false);
			createCus.setString(7, Address);
			// use executeUpdate instead of executequery so it wont give the error resultset doesnt return.
			createCus.executeUpdate();
		
			}
		
		public void deleteCustomerbyID(int cid)throws SQLException {
			deleteCus.setInt(1, cid);
			deleteCus.executeUpdate();
			
		}
		
public static void main(String[] args) throws SQLException,DataAccessException {
	CustomerDB c = new CustomerDB();
	
	//		c.findCustomerByPhone("22222");
	c.showMe();
	c.deleteCustomerbyID(11);
}
}


