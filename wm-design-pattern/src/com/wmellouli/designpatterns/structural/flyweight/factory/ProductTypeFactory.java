package com.wmellouli.designpatterns.structural.flyweight.factory;

import java.util.HashMap;
import java.util.Map;

import com.wmellouli.designpatterns.structural.flyweight.flyweight.ProductType;

//FlyweightFactory object
public class ProductTypeFactory {
	
	private Map<String, ProductType> types = new HashMap<String, ProductType>();
	
	public ProductType getProductType(String type) {
		ProductType productType = types.get(type);
		
		if (productType == null) {
			productType = new ProductType(type);
			types.put(type, productType);
		}
		
		return productType;
	}
	
	public int getTotalProductTypes() {
		return types.size();
	}
	
	public Map<String, ProductType> getProductTypeMap() {
		return this.types;
	}
	
}
