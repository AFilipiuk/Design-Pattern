package com.wmellouli.designpatterns.structural.decorator.decorator;

import com.wmellouli.designpatterns.structural.decorator.component.IHighTechProduct;

public class WarrantyProductDecorator extends HighTechProductDecorator {

	public static double WARRANTY_PRICE = 55;
	
	public WarrantyProductDecorator(IHighTechProduct product) {
		super(product);
	}

	@Override
	public double getPrice() {
		return this.product.getPrice() + WARRANTY_PRICE;
	}

	@Override
	public String getLibelle() {
		return this.product.getLibelle() + " with Warranty";
	}

}
