package com.wmellouli.designpatterns.structural.bridge.client;

import com.wmellouli.designpatterns.structural.bridge.abstraction.IProductAbstraction;

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
