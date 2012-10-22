package com.wmellouli.designpatterns.structural.bridge.main;

import com.wmellouli.designpatterns.structural.bridge.abstraction.IProductAbstraction;
import com.wmellouli.designpatterns.structural.bridge.abstraction.ProductAbstraction;
import com.wmellouli.designpatterns.structural.bridge.client.Client;
import com.wmellouli.designpatterns.structural.bridge.implementor.FoodProductImplementor;
import com.wmellouli.designpatterns.structural.bridge.implementor.HighTechProductImplementor;
import com.wmellouli.designpatterns.structural.bridge.implementor.IProductImplementor;

/**
 * Bridge pattern: Decouple an abstraction from its implementation so that the two can vary independently. The bridge uses encapsulation, aggregation, and can
 * use inheritance to separate responsibilities into different classes
 * 
 * FR: Le pont est un patron de conception de la famille "Structuration", qui permet de découpler l'interface d'une classe et son implémentation.
 * 
 * FYI: Difference between bridge and adapter: Adapter makes things work after they're designed; Bridge makes them work before they are.
 * 
 * @author Walid Mellouli
 * 
 */

public class Main {

	public static void main(String[] args) {
		IProductImplementor foodProductImplementor = new FoodProductImplementor();
		IProductImplementor highTechProductImplementor = new HighTechProductImplementor();

		IProductAbstraction productAbstraction = new ProductAbstraction();
		productAbstraction.setProductImplementor(foodProductImplementor);

		Client client = new Client(productAbstraction);
		client.showProductInformation();

		productAbstraction.setProductImplementor(highTechProductImplementor);
		client.showProductInformation();
	}
}
