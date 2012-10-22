package com.wmellouli.designpatterns.creational.singleton.main;

import com.wmellouli.designpatterns.creational.singleton.Singleton;

/**
 * Singleton pattern represents a class of which only a single instance can exist
 * 
 * @author Walid Mellouli
 *
 */

public class Main {

	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		instance1.setName("TOTO");
		System.out.println("Instance 1 : ");
		instance1.sayHello();
		Singleton instance2 = Singleton.getInstance();
		instance2.setName("TATA");
		System.out.println("Instance 2 : ");
		instance2.sayHello();
		System.out.println("Instance 1 : ");
		instance1.sayHello();
	}

}
