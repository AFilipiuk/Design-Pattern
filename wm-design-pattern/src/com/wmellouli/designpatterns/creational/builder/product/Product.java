package com.wmellouli.designpatterns.creational.builder.product;

public class Product {

	private String name;

	private String reference;

	private String type;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getReference() {
		return reference;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return String.format("name: %s / reference: %s / type: %s", this.name, this.reference, this.type);
	}
	
	

}
