package com.wmellouli.designpatterns.structural.bridge.abstraction;

import com.wmellouli.designpatterns.structural.bridge.implementor.IProductImplementor;

public class ProductAbstraction implements IProductAbstraction {

	private IProductImplementor productImplementor;

	public ProductAbstraction() {
		super();
	}

	@Override
	public void getProductName() {
		productImplementor.getProductNameImpl();

	}

	@Override
	public void getProductReference() {
		productImplementor.getProductReferenceImpl();
	}

	@Override
	public void setProductImplementor(IProductImplementor productImplementor) {
		this.productImplementor = productImplementor;
	}

}
