package model;

public class Clothing extends Product {
	
	private String size;
	private String color;
	
	public Clothing(String name, int productID, double purchasePrice, String countryOfOrigin, int minStock, String size, String color) {
		super(name, productID, purchasePrice, countryOfOrigin, minStock);
		this.size = size;
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Clothing [size=" + size + ", color=" + color + ", toString()=" + super.toString() + "]";
	}
	
	

}
