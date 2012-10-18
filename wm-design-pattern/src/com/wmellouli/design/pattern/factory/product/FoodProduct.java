package com.wmellouli.design.pattern.factory.product;

import java.util.ArrayList;
import java.util.List;

public class FoodProduct implements IProduct {

	@Override
	public List<String> getProductList() {
		List<String> productList = new ArrayList<String>();
		productList.add("BRED");
		productList.add("BANANA");
		productList.add("COOKIES");
		return productList;
	}

}
