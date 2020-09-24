package com.edgp.model.beans;

public class Electronics extends Item{
	
	int warranty;

	public Electronics(int itemCode, String itemName, double unitPrice, long quantity, int warranty) {
		super(itemCode, itemName, unitPrice, quantity);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + ", itemCode=" + itemCode + ", itemName=" + itemName
				+ ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
	}
	
	

}
