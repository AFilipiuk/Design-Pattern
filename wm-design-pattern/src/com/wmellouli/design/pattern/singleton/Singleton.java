package com.wmellouli.design.pattern.singleton;

public final class Singleton {

	private static Singleton instance = null;
	private String name;

	private Singleton() {
		super();
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

	public void sayHello() {
		System.out.println("Hello " + name + " !");
	}

	public void setName(String name) {
		this.name = name;
	}
}
