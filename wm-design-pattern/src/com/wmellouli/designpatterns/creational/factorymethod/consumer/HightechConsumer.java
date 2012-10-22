package com.wmellouli.designpatterns.creational.factorymethod.consumer;

import com.wmellouli.designpatterns.creational.factorymethod.product.HightTechProduct;
import com.wmellouli.designpatterns.creational.factorymethod.product.IProduct;

public class HightechConsumer extends Consumer {

	public IProduct makeProduct() {
		return new HightTechProduct();
	}

}
