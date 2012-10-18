package com.wmellouli.design.pattern.facade;

import java.util.GregorianCalendar;

public class CalendarFacade {

	GregorianCalendar gc;

	public CalendarFacade(String ddMMYYYY) {
		String[] a = ddMMYYYY.split("/");
		gc = new GregorianCalendar(Integer.parseInt(a[2]), Integer.parseInt(a[1]) - 1, Integer.parseInt(a[0]));
	}

	public void addDays(int nbr) {
		System.out.println(String.format("Adding %d days...", nbr));
		gc.add(GregorianCalendar.DAY_OF_MONTH, nbr);
	}

	@Override
	public String toString() {
		return String.format("%1$td-%1$tm-%1$tY", gc);
	}

}
