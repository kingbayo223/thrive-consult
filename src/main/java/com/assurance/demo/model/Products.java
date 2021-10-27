package com.assurance.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Products")
public class Products {
	  public Products(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public Products(double amount, String productName) {
		super();
		this.amount = amount;
		this.productName = productName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name="amount")
	private double amount;
	@Column(name="productName")
	private String productName;

}
