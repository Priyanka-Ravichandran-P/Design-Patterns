package com.lld.designpatterns.concepts.strategy;


public class Client {
	public static void main(String[] args) {
		Map map = new Map();
		map.findPath("AGRA", "DELHI", SupportableMode.BIKE );
	}
}
