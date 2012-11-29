package com.wmellouli.designpatterns.structural.decorator.component;

public abstract class IHighTechProduct {
	
	public abstract double getPrice();
	
	public abstract String getLibelle();

	@Override
	public String toString() {
		return String.format("%s, Price: %.2f euros", this.getLibelle(), this.getPrice());
	}
	
}
