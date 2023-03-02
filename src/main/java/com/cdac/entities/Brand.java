package com.cdac.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Brand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Brand_id;
	private String brand_Name;
	
	@ManyToOne
	private Category category;

	public Brand() {
		super();
	}

	public Brand(int brand_id, String brand_Name, Category category) {
		super();
		Brand_id = brand_id;
		this.brand_Name = brand_Name;
		this.category = category;
	}

	
	public Brand(String brand_Name) {
		super();
		this.brand_Name = brand_Name;
	}

	public int getBrand_id() {
		return Brand_id;
	}

	public void setBrand_id(int brand_id) {
		Brand_id = brand_id;
	}

	public String getBrand_Name() {
		return brand_Name;
	}

	public void setBrand_Name(String brand_Name) {
		this.brand_Name = brand_Name;
	}

	
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Brand [Brand_id=" + Brand_id + ", brand_Name=" + brand_Name + "]";
	}
	
	
}
