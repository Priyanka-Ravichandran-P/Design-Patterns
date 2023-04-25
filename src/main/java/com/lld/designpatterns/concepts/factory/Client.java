package com.lld.designpatterns.concepts.factory;

public class Client {
	public static void main(String[] args) {
		Flutter flutter = new Flutter(SupportPlaform.IOS);
		UIFactory factory = flutter.getUIFactory();
		factory.createButton();
		factory.createMenu();
		factory.createDropdown();
	}
		
}
