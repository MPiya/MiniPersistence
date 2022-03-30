package model;

public class GunReplica extends Product {

	private String calibre;
	private String material;
	
	public GunReplica(String name, int productID, double purchasePrice, String countryOfOrigin, int minStock, String calibre, String material) {
		super(name, productID, purchasePrice, countryOfOrigin, minStock);
		this.calibre = calibre;
		this.material = material;
	}

	@Override
	public String toString() {
		return "GunReplica [calibre=" + calibre + ", material=" + material + ", toString()=" + super.toString() + "]";
	}

	public String getCalibre() {
		return calibre;
	}

	public void setCalibre(String calibre) {
		this.calibre = calibre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	

}
