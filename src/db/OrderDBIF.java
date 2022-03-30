package db;
import model.Customer;
import model.SalesOrderLine;
import model.SaleOrder;

public interface OrderDBIF {

	public void addCustomer(Customer newCustomer);
	
	public void addSalesOrderLine(SalesOrderLine newSaleOrderLine);
	
	public void saveOrder(OrderLine newOrderLine);
	
	public boolean update (SaleOrder order);
}
