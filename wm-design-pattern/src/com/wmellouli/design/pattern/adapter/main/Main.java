package com.wmellouli.design.pattern.adapter.main;

import com.wmellouli.design.pattern.adapter.adaptee.FoodProduct;
import com.wmellouli.design.pattern.adapter.adaptee.HighTechProduct;
import com.wmellouli.design.pattern.adapter.adaptor.IProductAdaptor;
import com.wmellouli.design.pattern.adapter.adaptor.ProductAdaptorByObject;
import com.wmellouli.design.pattern.adapter.client.Client;

public class Main {

	public static void main(String[] args) {
		FoodProduct foodProduct = new FoodProduct();
		HighTechProduct highTechProduct = new HighTechProduct();
		IProductAdaptor productAdaptor = new ProductAdaptorByObject(foodProduct, highTechProduct);

		Client client = new Client(productAdaptor);
		client.showSomeFoods();
		client.showSomeHighTech();
	}

}
