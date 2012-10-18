package com.wmellouli.design.pattern.adapter.adaptor;

import com.wmellouli.design.pattern.adapter.adaptee.IFoodProduct;
import com.wmellouli.design.pattern.adapter.adaptee.IHighTechProduct;

public class ProductAdaptorByObject implements IProductAdaptor {

	//Adaptees
	private IFoodProduct foodProduct;
	private IHighTechProduct highTechProduct;

	//Inject adaptees
	public ProductAdaptorByObject(IFoodProduct foodProduct, IHighTechProduct highTechProduct) {
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
