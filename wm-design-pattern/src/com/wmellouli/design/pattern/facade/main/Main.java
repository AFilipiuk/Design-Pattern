package com.wmellouli.design.pattern.facade.main;
import com.wmellouli.design.pattern.facade.CalendarFacade;

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
