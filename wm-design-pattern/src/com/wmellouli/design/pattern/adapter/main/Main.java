package com.wmellouli.design.pattern.adapter.main;

import com.wmellouli.design.pattern.adapter.adaptee.FoodProduct;
import com.wmellouli.design.pattern.adapter.adaptee.HighTechProduct;
import com.wmellouli.design.pattern.adapter.adaptor.IProductAdaptor;
import com.wmellouli.design.pattern.adapter.adaptor.ProductAdaptorByObject;
import com.wmellouli.design.pattern.adapter.client.Client;

/**
 * Adapter pattern: translates one interface for a class into a compatible interface
 * 
 * FR: Le patron Adaptateur permet de convertir l'interface d'une classe en une autre interface que le client attend. L'Adaptateur fait fonctionner un ensemble
 * des classes qui n'auraient pas pu fonctionner sans lui, à cause d'une incompatibilité d'interfaces.
 * 
 * FYI: Difference between bridge and adapter: Adapter makes things work after they're designed; Bridge makes them work before they are.
 * 
 * @author Walid Mellouli
 * 
 */

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
