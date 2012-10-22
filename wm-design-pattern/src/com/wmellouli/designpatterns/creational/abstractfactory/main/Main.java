package com.wmellouli.designpatterns.creational.abstractfactory.main;

import java.util.List;

import com.wmellouli.designpatterns.creational.abstractfactory.consumer.Consumer;
import com.wmellouli.designpatterns.creational.abstractfactory.consumer.Preference;
import com.wmellouli.designpatterns.creational.abstractfactory.product.IProduct;

/**
 * 
 * An Abstract Factory is a class with several Factory methods. So basically, an Abstract Factory class has a collection of different Factory Methods to create
 * different desired Concrete objects.
 * 
 * FR: Une fabrique abstraite encapsule un groupe de fabriques ayant une thématique commune. Le code client crée une implémentation concrète de la fabrique
 * abstraite, puis utilise les interfaces génériques pour créer des objets concrets de la thématique.
 * 
 * @author Walid Mellouli
 * 
 */

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
