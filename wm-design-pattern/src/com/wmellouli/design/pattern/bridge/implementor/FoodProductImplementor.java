package com.wmellouli.design.pattern.bridge.implementor;

public class FoodProductImplementor implements IProductImplementor {

	@Override
	public void getProductNameImpl() {
		System.out.println("Name: Food");
	}

	@Override
	public void getProductReferenceImpl() {
		System.out.println("Reference: FOOD321/5646");
	}

}
