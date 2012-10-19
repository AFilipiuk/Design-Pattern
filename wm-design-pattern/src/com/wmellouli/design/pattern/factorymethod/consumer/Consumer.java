package com.wmellouli.design.pattern.factorymethod.consumer;

import com.wmellouli.design.pattern.factorymethod.product.IProduct;
import com.wmellouli.design.pattern.factorymethod.product.RegularProduct;

public class Consumer {

	public IProduct makeProduct() {
		return new RegularProduct();
	}
}
