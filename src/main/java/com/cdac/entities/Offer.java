package com.cdac.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Offer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Offer_id;
	private String offer_Details;
	private java.sql.Date offer_Date;
	
	@OneToOne
	private Product product;

	public Offer() {
		super();
	}

	public Offer(int offer_id, String offer_Details, Date offer_Date, Product product) {
		super();
		Offer_id = offer_id;
		this.offer_Details = offer_Details;
		this.offer_Date = offer_Date;
		this.product = product;
	}

	public Offer(String offer_Details, Date offer_Date) {
		super();
		this.offer_Details = offer_Details;
		this.offer_Date = offer_Date;
	}

	public int getOffer_id() {
		return Offer_id;
	}

	public void setOffer_id(int offer_id) {
		Offer_id = offer_id;
	}

	public String getOffer_Details() {
		return offer_Details;
	}

	public void setOffer_Details(String offer_Details) {
		this.offer_Details = offer_Details;
	}

	public java.sql.Date getOffer_Date() {
		return offer_Date;
	}

	public void setOffer_Date(java.sql.Date offer_Date) {
		this.offer_Date = offer_Date;
	}

	
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Offer [Offer_id=" + Offer_id + ", offer_Details=" + offer_Details + ", offer_Date=" + offer_Date + "]";
	}
	
	
}
