package com.wmellouli.design.pattern.adapter.adaptor;

import com.wmellouli.design.pattern.adapter.adaptee.FoodProduct;

public class ProductAdaptorByClass extends FoodProduct implements IProductAdaptor {

	@Override
	public void getTheCookies() {
		this.getCookies();
	}

	@Override
	public void getTheBred() {
		this.getBred();
	}

	@Override
	public void getTheBanana() {
		this.getBanana();
	}

	@Override
	public void getTheSmartphone() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getTheCamescope() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getTheComputer() {
		// TODO Auto-generated method stub
	}

}
