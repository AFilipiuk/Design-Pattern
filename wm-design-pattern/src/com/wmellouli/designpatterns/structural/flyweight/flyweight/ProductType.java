package com.wmellouli.designpatterns.structural.flyweight.flyweight;

//ConcreteFlyweight object that creates ConcreteFlyweight 
public class ProductType implements ProductOrder {

	private String type;
	
	public ProductType(String type) {
		super();
		this.type = type;
	}

	@Override
	public void deliveryProduct(ProductOrderContext context) {
		System.out.println(String.format("Delivering the product '%s' of type '%s'", context.getProductName(), this.type));
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
