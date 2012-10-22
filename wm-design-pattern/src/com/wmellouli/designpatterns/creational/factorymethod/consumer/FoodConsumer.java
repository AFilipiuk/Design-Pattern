package com.wmellouli.designpatterns.creational.factorymethod.consumer;

import com.wmellouli.designpatterns.creational.factorymethod.product.FoodProduct;
import com.wmellouli.designpatterns.creational.factorymethod.product.IProduct;

public class FoodConsumer extends Consumer {

	public IProduct makeProduct() {
		return new FoodProduct();
	}

}
