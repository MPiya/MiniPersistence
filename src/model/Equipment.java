package model;

public class Equipment extends Product {
	
	private String type;
	private String description;

	public Equipment(String name, int productID, double purchasePrice, String countryOfOrigin, int minStock, String type, String description) {
		super(name, productID, purchasePrice, countryOfOrigin, minStock);
		this.type = type;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Equipment [type=" + type + ", description=" + description + ", toString()=" + super.toString() + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
