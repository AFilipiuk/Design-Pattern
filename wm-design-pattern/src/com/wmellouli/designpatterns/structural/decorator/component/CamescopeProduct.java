package com.wmellouli.designpatterns.structural.decorator.component;

public class CamescopeProduct extends IHighTechProduct {

	@Override
	public double getPrice() {
		return 150;
	}

	@Override
	public String getLibelle() {
		return "A camescope";
	}

}
