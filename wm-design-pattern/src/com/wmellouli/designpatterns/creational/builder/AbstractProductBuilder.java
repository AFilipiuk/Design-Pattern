package com.wmellouli.designpatterns.creational.builder;

import com.wmellouli.designpatterns.creational.builder.product.Product;

public abstract class AbstractProductBuilder {

	protected Product product;

	public Product getProduct() {
		return product;
	}
	
	public void createNewProduct() {
		product = new Product();
	}
	
	public abstract void buildName();
	public abstract void buildReference();
	public abstract void buildType();

}
