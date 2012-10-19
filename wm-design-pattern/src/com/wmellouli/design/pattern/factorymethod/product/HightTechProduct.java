package com.wmellouli.design.pattern.factorymethod.product;

import java.util.ArrayList;
import java.util.List;

public class HightTechProduct extends RegularProduct {

	@Override
	public List<String> makeProductList() {
		List<String> productList = new ArrayList<String>();
		productList.add("COMPUTER");
		productList.add("CAMESCOPE");
		productList.add("SMARTPHONE");
		return productList;
	}

}
