package model;

import java.util.ArrayList;

public class Product {
	
	private String name;
	private int productID;
	private double purchasePrice;
	private String countryOfOrigin;
	private int minStock;
	private Supplier supplier;
	private ArrayList<Stock> stock;
	
	
	
	public Product(String name, int productID, double purchasePrice, String countryOfOrigin, int minStock) {
		super();
		this.name = name;
		this.productID = productID;
		this.purchasePrice = purchasePrice;
		this.countryOfOrigin = countryOfOrigin;
		this.minStock = minStock;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", productID=" + productID + ", purchasePrice=" + purchasePrice
				+ ", countryOfOrigin=" + countryOfOrigin + ", minStock=" + minStock + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}
	
	

}
