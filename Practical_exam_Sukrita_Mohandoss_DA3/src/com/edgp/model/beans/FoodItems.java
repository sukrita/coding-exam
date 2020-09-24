package com.edgp.model.beans;

import java.util.Date;

public class FoodItems extends Item{
	
	public FoodItems(int itemCode, String itemName, double unitPrice, long quantity) {
		super(itemCode, itemName, unitPrice, quantity);
		// TODO Auto-generated constructor stub
	}

	Date dateOfManufacture, dateOfExpiry;
	String vegetarian;
	


	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return "FoodItems [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", vegetarian="
				+ vegetarian + ", itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + "]";
	}
	
	
	

}
