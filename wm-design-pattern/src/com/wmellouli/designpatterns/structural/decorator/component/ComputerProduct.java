package com.wmellouli.designpatterns.structural.decorator.component;

public class ComputerProduct extends IHighTechProduct {

	@Override
	public double getPrice() {
		return 500;
	}

	@Override
	public String getLibelle() {
		return "A computer";
	}

}
