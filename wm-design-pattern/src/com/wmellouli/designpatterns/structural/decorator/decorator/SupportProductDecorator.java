package com.wmellouli.designpatterns.structural.decorator.decorator;

import com.wmellouli.designpatterns.structural.decorator.component.IHighTechProduct;

public class SupportProductDecorator extends HighTechProductDecorator {

	public static double SUPPORT_PRICE = 80;
	
	public SupportProductDecorator(IHighTechProduct product) {
		super(product);
	}

	@Override
	public double getPrice() {
		return this.product.getPrice() + SUPPORT_PRICE;
	}

	@Override
	public String getLibelle() {
		return this.product.getLibelle() + " with Support";
	}

}
