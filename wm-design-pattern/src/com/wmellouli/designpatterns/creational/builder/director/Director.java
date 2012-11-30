package com.wmellouli.designpatterns.creational.builder.director;

import com.wmellouli.designpatterns.creational.builder.builder.AbstractProductBuilder;
import com.wmellouli.designpatterns.creational.builder.product.Product;

public class Director {
	
	private AbstractProductBuilder builder;
	
	public void setProductBuilder(AbstractProductBuilder builder) {
		this.builder = builder;
	}
	
	public Product getProduct() {
		return this.builder.getProduct();
	}
	
	public void constructProduct() {
		this.builder.createNewProduct();
		this.builder.buildName();
		this.builder.buildReference();
		this.builder.buildType();
	}

}
