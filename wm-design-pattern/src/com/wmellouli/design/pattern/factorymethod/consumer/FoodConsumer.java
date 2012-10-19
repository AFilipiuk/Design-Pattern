package com.wmellouli.design.pattern.factorymethod.consumer;

import com.wmellouli.design.pattern.factorymethod.product.FoodProduct;
import com.wmellouli.design.pattern.factorymethod.product.IProduct;

public class FoodConsumer extends Consumer {

	public IProduct makeProduct() {
		return new FoodProduct();
	}

}
