package com.wmellouli.designpatterns.structural.adapter.adaptor;

import com.wmellouli.designpatterns.structural.adapter.adaptee.FoodProduct;
import com.wmellouli.designpatterns.structural.adapter.adaptee.HighTechProduct;

public class ProductAdaptorByObject implements IProductAdaptor {

	//Adaptees
	private FoodProduct foodProduct;
	private HighTechProduct highTechProduct;

	//Inject adaptees
	public ProductAdaptorByObject(FoodProduct foodProduct, HighTechProduct highTechProduct) {
		this.foodProduct = foodProduct;
		this.highTechProduct = highTechProduct;
	}

	@Override
	public void getTheCookies() {
		foodProduct.getCookies();
	}

	@Override
	public void getTheBred() {
		foodProduct.getBred();
	}

	@Override
	public void getTheBanana() {
		foodProduct.getBanana();
	}

	@Override
	public void getTheSmartphone() {
		highTechProduct.getSmartphone();
	}

	@Override
	public void getTheCamescope() {
		highTechProduct.getCamescope();
	}

	@Override
	public void getTheComputer() {
		highTechProduct.getComputer();
	}

}
