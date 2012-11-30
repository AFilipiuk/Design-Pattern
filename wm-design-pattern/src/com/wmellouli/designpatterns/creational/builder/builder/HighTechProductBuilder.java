package com.wmellouli.designpatterns.creational.builder.builder;

public class HighTechProductBuilder extends AbstractProductBuilder {

	@Override
	public void buildName() {
		product.setName("HIGHT-TECH");

	}

	@Override
	public void buildReference() {
		product.setReference("RF 492HIGHTECH/000286");

	}

	@Override
	public void buildType() {
		product.setType("HIGHT-TECH TYPE");
		
	}

}
