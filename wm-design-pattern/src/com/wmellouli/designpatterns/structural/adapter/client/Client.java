package com.wmellouli.designpatterns.structural.adapter.client;

import com.wmellouli.designpatterns.structural.adapter.adaptor.IProductAdaptor;

public class Client {

	IProductAdaptor productAdaptor;

	public Client(IProductAdaptor productAdaptor) {
		this.productAdaptor = productAdaptor;
	}

	public void showSomeFoods() {
		productAdaptor.getTheBred();
		productAdaptor.getTheCookies();
	}

	public void showSomeHighTech() {
		productAdaptor.getTheSmartphone();
		productAdaptor.getTheComputer();
	}
}
