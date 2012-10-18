package com.wmellouli.design.pattern.adapter.adaptee;

public class FoodProduct implements IFoodProduct {

	@Override
	public void getCookies() {
		System.out.println("This is Cookies");
	}

	@Override
	public void getBred() {
		System.out.println("This is a Bred");
	}

	@Override
	public void getBanana() {
		System.out.println("This is a Banana");
	}

}
