package com.lld.designpatterns.concepts.singleton;

public class Singleton {
	/**
	 * To make a class singleton have to follow three steps Declare static object in
	 * class level as private make constructor private get object from the static
	 * method
	 * 
	 */
	private static Singleton obj = null;

	private Singleton() {

	}

	public static Singleton getObj() {
		if (obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
}
