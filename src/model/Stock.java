package model;

public class Stock {
	
	private String locationID;
	private int stockQuantity;
	private int minStock;
	private Product product;
	
	
	public Stock(String locationID, int stockQuantity, int minStock, Product product) {
		this.locationID = locationID;
		this.stockQuantity = stockQuantity;
		this.minStock = minStock;
		this.product = product;
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}
	
	
}
