package com.wmellouli.design.pattern.factory.main;

import java.util.List;

import com.wmellouli.design.pattern.factory.consumer.Consumer;
import com.wmellouli.design.pattern.factory.consumer.Preference;
import com.wmellouli.design.pattern.factory.product.IProduct;

public class Main {

	public static void main(String[] args) {
		System.out.println("Init food consumer...");
		Consumer foodConsumer = new Consumer(Preference.FOOD);
		displayProductList(foodConsumer);

		System.out.println("Init high-tech consumer...");
		Consumer hightechConsumer = new Consumer(Preference.HIGHTECH);
		displayProductList(hightechConsumer);
	}

	private static void displayProductList(Consumer consumer) {
		IProduct product = consumer.productFactory();
		List<String> productList = product.getProductList();
		System.out.println("Product available: " + productList);
	}

}
