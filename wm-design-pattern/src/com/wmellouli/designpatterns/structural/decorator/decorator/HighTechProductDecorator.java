package com.wmellouli.designpatterns.structural.decorator.decorator;

import com.wmellouli.designpatterns.structural.decorator.component.IHighTechProduct;

public abstract class HighTechProductDecorator extends IHighTechProduct {
	
	protected IHighTechProduct product;
	
	public HighTechProductDecorator(IHighTechProduct product) {
		this.product = product;
	}

	@Override
	public abstract double getPrice();

	@Override
	public abstract String getLibelle();

}
