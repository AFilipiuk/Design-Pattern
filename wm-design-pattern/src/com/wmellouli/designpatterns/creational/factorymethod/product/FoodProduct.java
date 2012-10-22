package com.wmellouli.designpatterns.creational.factorymethod.product;

import java.util.ArrayList;
import java.util.List;

public class FoodProduct extends RegularProduct {

	@Override
	public List<String> makeProductList() {
		List<String> productList = new ArrayList<String>();
		productList.add("BRED");
		productList.add("BANANA");
		productList.add("COOKIES");
		return productList;
	}

}
