package com.wmellouli.designpatterns.structural.facade;


/**
 * A facade is an object that provides a simplified interface to a larger body of code, such as a class library. It Provides a unified interface to a set of
 * interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
 * 
 * FR: Le patron façade a pour but de cacher une conception et une interface complexe difficile à comprendre (cette complexité étant apparue "naturellement"
 * avec l'évolution du sous-système en question)
 * 
 * [source wikipedia]
 * 
 * @author Walid Mellouli
 * 
 */
public class Main {

	public static void main(String[] args) {
		CalendarFacade facade = new CalendarFacade("18/10/2012");
		System.out.println(String.format("The date is: %s", facade));
		facade.addDays(3);
		System.out.println(String.format("The date is: %s", facade));
		facade.addDays(-1);
		System.out.println(String.format("The date is: %s", facade));
	}

}
