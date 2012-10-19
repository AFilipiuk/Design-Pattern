package com.wmellouli.design.pattern.abstractfactory.consumer;

import com.wmellouli.design.pattern.abstractfactory.product.FoodProduct;
import com.wmellouli.design.pattern.abstractfactory.product.HightTechProduct;
import com.wmellouli.design.pattern.abstractfactory.product.IProduct;

public class Consumer {

	private Preference preference;

	public Consumer(Preference preference) {
		this.preference = preference;
	}

	// Factory method
	public IProduct productFactory() {
		IProduct product = null;

		switch (preference) {
		case FOOD:
			product = new FoodProduct();
			break;
		case HIGHTECH:
			product = new HightTechProduct();
			break;
		}

		return product;
	}
}
