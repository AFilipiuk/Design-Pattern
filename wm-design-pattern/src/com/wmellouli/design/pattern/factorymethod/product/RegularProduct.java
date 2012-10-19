package com.wmellouli.design.pattern.factorymethod.product;

import java.util.ArrayList;
import java.util.List;

public class RegularProduct implements IProduct {

	@Override
	public List<String> makeProductList() {
		List<String> productList = new ArrayList<String>();
		productList.add("SMARTPHONE");
		productList.add("APPLE");
		productList.add("COOKIES");
		productList.add("BRED");
		return productList;
	}

	public List<String> getProductList() {
		List<String> toReturn = makeProductList();
		return toReturn;
	}

}
