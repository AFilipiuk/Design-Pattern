package com.wmellouli.design.pattern.factorymethod.main;

import com.wmellouli.design.pattern.factorymethod.consumer.Consumer;
import com.wmellouli.design.pattern.factorymethod.consumer.FoodConsumer;
import com.wmellouli.design.pattern.factorymethod.consumer.HightechConsumer;
import com.wmellouli.design.pattern.factorymethod.product.IProduct;

/**
 * 
 * The factory method pattern relies on inheritance, as object creation is delegated to subclasses that implement the factory method to create objects
 * 
 * FR: Le patron factory method (fabrique) permet d'instancier des objets dont le type est dérivé d'un type abstrait. La classe exacte de l'objet n'est donc pas
 * connue par l'appelant.
 * 
 * @author Walid Mellouli
 * 
 */

public class Main {

	public static void main(String[] args) {

		System.out.println("Init regular consumer...");
		Consumer consumer = new Consumer();
		displayProducts(consumer);

		System.out.println("Init food consumer...");
		consumer = new FoodConsumer();
		displayProducts(consumer);

		System.out.println("Init high-tech consumer...");
		consumer = new HightechConsumer();
		displayProducts(consumer);

	}

	private static void displayProducts(Consumer consumer) {
		IProduct product = consumer.makeProduct();
		System.out.println(product.getProductList());
	}

}
