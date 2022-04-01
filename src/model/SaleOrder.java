package model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class SaleOrder {

	
	private LocalDate date;
	private String deliveryStatus;
	private LocalDate deliveryDate;
	private double discount;
	private Customer customer;
	private ArrayList<SalesOrderLine> sOrderLines;
	private LocalDate paymentDate;
	private double amount;
	private int saleOrderID;
	
	public SaleOrder(LocalDate date, String deliveryStatus, LocalDate deliveryDate, double discount, Customer customer, LocalDate paymentDate) {
		this.date = date;
		this.deliveryStatus = deliveryStatus;
		this.deliveryDate = deliveryDate;
		this.discount = discount;
		this.customer = customer;
		this.sOrderLines = new ArrayList<>();
		this.paymentDate = paymentDate;
		//this.amount = amount;
	}
	
	public int getSaleOrderID() {
		return saleOrderID;
	}

	public void setSaleOrderID(int saleOrderID) {
		this.saleOrderID = saleOrderID;
	}
	
	public void addSalesOrderLine(SalesOrderLine sol) {
		sOrderLines.add(sol);
	}
	
	public ArrayList<SalesOrderLine> getSalesOrderLines() {
		return sOrderLines;
	}

	public LocalDate getDate() {
		return date;
	}

	public LocalDate setDate(LocalDate date) {
		return this.date = date;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
}
