package com.wmellouli.designpatterns.structural.bridge.abstraction;

import com.wmellouli.designpatterns.structural.bridge.implementor.IProductImplementor;

public interface IProductAbstraction {

	void getProductName();

	void getProductReference();

	void setProductImplementor(IProductImplementor productImplementor);

}
