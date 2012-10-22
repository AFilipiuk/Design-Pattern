package com.wmellouli.designpatterns.creational.factorymethod.product;

import java.util.List;

public interface IProduct {

	public abstract List<String> makeProductList();

	public List<String> getProductList();

}
