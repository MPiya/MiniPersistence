package model;

public class SalesOrderLine {
private	int quantity;
private double actuelSalsPrice;
private int salesOrderLineID;
private Product product;
private SalesOrderLine(int quantity, double actuelSalsPrice, int salesOrderLineID) {
	this.quantity= quantity;
	this.actuelSalsPrice= actuelSalsPrice;
	this.salesOrderLineID= salesOrderLineID;
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
