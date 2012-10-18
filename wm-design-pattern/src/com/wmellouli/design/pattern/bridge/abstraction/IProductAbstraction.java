package com.wmellouli.design.pattern.bridge.abstraction;

import com.wmellouli.design.pattern.bridge.implementor.IProductImplementor;

public interface IProductAbstraction {

	void getProductName();

	void getProductReference();

	void setProductImplementor(IProductImplementor productImplementor);

}
