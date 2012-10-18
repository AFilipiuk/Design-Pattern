package com.wmellouli.design.pattern.factory.consumer;

import com.wmellouli.design.pattern.factory.product.FoodProduct;
import com.wmellouli.design.pattern.factory.product.HightTechProduct;
import com.wmellouli.design.pattern.factory.product.IProduct;

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
