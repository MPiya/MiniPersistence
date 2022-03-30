package db;
import java.sql.SQLException;

import model.*;

public interface ProductDBIF {
	
	public Product findProductbyid(int id)throws SQLException;
	
	public boolean update (SaleOrder order) throws SQLException;
}
