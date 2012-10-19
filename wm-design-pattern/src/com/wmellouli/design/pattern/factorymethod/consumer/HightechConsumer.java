package com.wmellouli.design.pattern.factorymethod.consumer;

import com.wmellouli.design.pattern.factorymethod.product.HightTechProduct;
import com.wmellouli.design.pattern.factorymethod.product.IProduct;

public class HightechConsumer extends Consumer {

	public IProduct makeProduct() {
		return new HightTechProduct();
	}

}
