package com.wmellouli.designpatterns.structural.flyweight.main;

import com.wmellouli.designpatterns.structural.flyweight.factory.ProductTypeFactory;
import com.wmellouli.designpatterns.structural.flyweight.flyweight.ProductOrderContext;
import com.wmellouli.designpatterns.structural.flyweight.flyweight.ProductType;

/**
 * 
 * A flyweight is an object that minimizes memory use by sharing as much data as possible with other similar objects; 
 * it is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory. 
 * Often some parts of the object state can be shared, and it is common practice to hold them in external data structures 
 * and pass them to the flyweight objects temporarily when they are used.
 * 
 * FR: Le patron poids-mouche est utilisé lorsque de nombreux (petits) objets doivent être manipulés, 
 * mais qu'il serait trop coûteux en mémoire s'il fallait instancier tous ces objets, il est judicieux d'implémenter le poids-mouche.
 * Dans le cas d'une classe représentant des données, il est parfois possible de réduire le nombre d'objets à instancier 
 * si tous ces objets sont semblables et se différencient sur quelques paramètres. 
 * Si ces quelques paramètres peuvent être extraits de la classe et passés ensuite via des paramètres des méthodes, 
 * on peut réduire grandement le nombre d'objets à instancier.
 * 
 * @author Walid Mellouli
 *
 */

public class Main {

	public static void main(String[] args) {
		
		ProductTypeFactory factory = new ProductTypeFactory();
		
		deliveryProduct(factory, "High-Tech", "Computer");
		deliveryProduct(factory, "Food", "Bred");
		deliveryProduct(factory, "High-Tech", "Camescope");
		deliveryProduct(factory, "High-Tech", "Smartphone");
		deliveryProduct(factory, "Food", "Apple");
		deliveryProduct(factory, "Food", "Cake");
		deliveryProduct(factory, "High-Tech", "Keyboard");
		deliveryProduct(factory, "Food", "Biscuit");
		deliveryProduct(factory, "High-Tech", "Webcam");
		deliveryProduct(factory, "High-Tech", "Computer");
		
		System.out.println(String.format("\nNumber of ProductType created: %d", factory.getTotalProductTypes()));

	}

	private static void deliveryProduct(ProductTypeFactory factory, String type, String name) {
		ProductType productType = factory.getProductType(type);
		ProductOrderContext context = new ProductOrderContext(name);
		productType.deliveryProduct(context);
	}

}
