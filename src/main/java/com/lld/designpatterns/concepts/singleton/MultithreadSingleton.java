package com.lld.designpatterns.concepts.singleton;

public class MultithreadSingleton {

	/**
	 * There are three solutions to solve multithreading issue in singleton.
	 * 
	 * Sol 1: Instantiate Singleton Object With Class Load Sol 2: Using Synchronized
	 * Lock on getObj Method Sol 3: Double Check Locking
	 * 
	 */
	private MultithreadSingleton() {

	}

	/**
	 * Sol 1: Instantiate Singleton Object With Class Load.
	 * Problem: If we have 100
	 * singleton class, object will get create by JVM while class loading time
	 * irrespective to whether we are using those objects are not, So class loading
	 * time will be SLOW
	 */
	private static MultithreadSingleton obj = new MultithreadSingleton();

	public static MultithreadSingleton getObj() {
		return obj;
	}

	/**
	 * Sol 2: Using Synchronized Lock on getObj Method.
	 * Problem : After creation of
	 * object also, threads will be keep on waiting on method level to enter one
	 * after other, (Multithreading issue will only comes if obj is not created) So
	 * it makes performance VERY LOW
	 */
	private static MultithreadSingleton obj1;

	public static synchronized MultithreadSingleton getObj1() {
		if (obj1 == null)
			return new MultithreadSingleton();
		return obj1;
	}

	/**
	 * Sol 3: Double Check Locking 
	 * EFFICIENT SOLUTION
	 */
	private static MultithreadSingleton obj2;

	public static synchronized MultithreadSingleton getObj2() {
			if(obj2==null) {
				synchronized(MultithreadSingleton.class) {
					if(obj2 == null) {
						obj2 = new MultithreadSingleton();
					}
				}
				
			} 
			return obj2;
		}
}
