package db;

import model.*;

public interface SaleOrderDBIF {
	
	void saveOrder(SaleOrder o) throws DataAccessException;
	

}
