package model;

import java.time.LocalDate;

public class Invoice {
	private LocalDate paymentDate;
	private int amount;
	private int invoiceNo;
	
	public Invoice(LocalDate paymentDate, int amount, int invoiceNo) {
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.invoiceNo = invoiceNo;
	}

	
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
