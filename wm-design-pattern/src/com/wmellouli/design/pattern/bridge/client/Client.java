package com.wmellouli.design.pattern.bridge.client;

import com.wmellouli.design.pattern.bridge.abstraction.IProductAbstraction;

public class Client {

	IProductAbstraction productAbstraction;

	public Client(IProductAbstraction productAbstraction) {
		this.productAbstraction = productAbstraction;
	}

	public void showProductInformation() {
		productAbstraction.getProductName();
		productAbstraction.getProductReference();
	}
}
