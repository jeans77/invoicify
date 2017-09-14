package com.libertymutual.goforcode.invoicify.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="invoicify_flat-fee-billing-record")
public class FlatFeeBillingRecord extends BillingRecord {
	
	private double amount;
	
	public double getTotal() {
		return amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
