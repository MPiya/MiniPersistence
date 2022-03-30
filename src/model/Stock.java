package model;

public class Stock {

	private String locationID;
	private int stockQuantity;
	private int minStock;
	
	
	
	public Stock(String locationID, int stockQuantity, int minStock) {
		
		this.locationID = locationID;
		this.stockQuantity = stockQuantity;
		this.minStock = minStock;
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
