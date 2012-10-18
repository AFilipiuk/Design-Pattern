package com.wmellouli.design.pattern.bridge.implementor;

public class HighTechProductImplementor implements IProductImplementor {

	@Override
	public void getProductNameImpl() {
		System.out.println("Name: HIGH-TECH");
	}

	@Override
	public void getProductReferenceImpl() {
		System.out.println("Reference: HIGHD684/TECH5852");
	}

}
