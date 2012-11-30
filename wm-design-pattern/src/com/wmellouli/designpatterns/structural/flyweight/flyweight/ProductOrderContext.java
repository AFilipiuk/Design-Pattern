package com.wmellouli.designpatterns.structural.flyweight.flyweight;

public class ProductOrderContext {
	
	private String productName;

	public ProductOrderContext(String productName) {
		super();
		this.productName = productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}
	
	

}
