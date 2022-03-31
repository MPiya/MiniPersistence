package model;

public class SalesOrderLine {
	
	private int quantity;
	private double actuelSalsPrice;
	private Product product;
	

	public SalesOrderLine(int quantity, double actuelSalsPrice) {
		this.quantity = quantity;
		this.actuelSalsPrice = actuelSalsPrice;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getActuelSalsPrice() {
		return actuelSalsPrice;
	}

	public void setActuelSalsPrice(double actuelSalsPrice) {
		this.actuelSalsPrice = actuelSalsPrice;
	}

	public int getSalesOrderLineID() {
		return salesOrderLineID;
	}

	public void setSalesOrderLineID(int salesOrderLineID) {
		this.salesOrderLineID = salesOrderLineID;
	}

}
