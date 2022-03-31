package model;

import java.sql.Date;
import java.time.LocalDate;

public class SaleOrder {

	
	private Date date;
	private String deliveryStatus;
	private String deliveryDate;
	private double discount;
	private int saleOrderID;
	
	public SaleOrder(Date date, String deliveryStatus, String deliveryDate, double discount, int saleOrderID) {
		this.date = date;
		this.deliveryStatus = deliveryStatus;
		this.deliveryDate = deliveryDate;
		this.discount = discount;
		this.saleOrderID = saleOrderID;
		
	}

	public Date getDate() {
		return date;
	}

	public Date setDate(Date date) {
		return this.date = date;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getSaleOrderID() {
		return saleOrderID;
	}

	public void setSaleOrderID(int saleOrderID) {
		this.saleOrderID = saleOrderID;
	}
}
