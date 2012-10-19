package com.wmellouli.design.pattern.abstractfactory.product;

import java.util.ArrayList;
import java.util.List;

public class HightTechProduct implements IProduct {

	@Override
	public List<String> getProductList() {
		List<String> productList = new ArrayList<String>();
		productList.add("COMPUTER");
		productList.add("CAMESCOPE");
		productList.add("SMARTPHONE");
		return productList;
	}

}
