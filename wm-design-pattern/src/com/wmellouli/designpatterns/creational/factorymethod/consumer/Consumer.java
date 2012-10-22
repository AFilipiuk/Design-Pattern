package com.wmellouli.designpatterns.creational.factorymethod.consumer;

import com.wmellouli.designpatterns.creational.factorymethod.product.IProduct;
import com.wmellouli.designpatterns.creational.factorymethod.product.RegularProduct;

public class Consumer {

	public IProduct makeProduct() {
		return new RegularProduct();
	}
}
