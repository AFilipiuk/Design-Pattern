package com.wmellouli.designpatterns.creational.abstractfactory.consumer;

import com.wmellouli.designpatterns.creational.abstractfactory.product.FoodProduct;
import com.wmellouli.designpatterns.creational.abstractfactory.product.HightTechProduct;
import com.wmellouli.designpatterns.creational.abstractfactory.product.IProduct;

public class Consumer {

	private Preference preference;

	public Consumer(Preference preference) {
		this.preference = preference;
	}

	// Factory
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
