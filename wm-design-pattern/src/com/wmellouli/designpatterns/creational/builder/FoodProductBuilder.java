package com.wmellouli.designpatterns.creational.builder;

public class FoodProductBuilder extends AbstractProductBuilder {

	@Override
	public void buildName() {
		product.setName("FOOD");

	}

	@Override
	public void buildReference() {
		product.setReference("RF 431FOOD/000234");

	}

	@Override
	public void buildType() {
		product.setType("FOOD TYPE");
		
	}

}
