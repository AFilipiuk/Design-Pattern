package com.wmellouli.design.pattern.adapter.adaptee;

public class HighTechProduct implements IHighTechProduct {

	@Override
	public void getSmartphone() {
		System.out.println("This is a smartphone");
	}

	@Override
	public void getCamescope() {
		System.out.println("This is a camescope");
	}

	@Override
	public void getComputer() {
		System.out.println("This is a computer");
	}

}
