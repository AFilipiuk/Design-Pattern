package com.wmellouli.design.pattern.factorymethod.product;

import java.util.List;

public interface IProduct {

	public abstract List<String> makeProductList();

	public List<String> getProductList();

}
