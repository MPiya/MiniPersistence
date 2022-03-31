package db;
import java.sql.SQLException;

import model.*;

public interface ProductDBIF {
	
	public Product findProductById(int id)throws SQLException;
	
	
}
