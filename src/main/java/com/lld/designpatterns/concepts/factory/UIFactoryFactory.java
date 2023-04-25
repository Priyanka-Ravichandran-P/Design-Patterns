package com.lld.designpatterns.concepts.factory;

// Practical Factory
public class UIFactoryFactory {
	public static UIFactory getUIFactory(SupportPlaform platform) {
		if (platform == SupportPlaform.ANDROID)
			return new AndroidUIFactory();
		else if (platform == SupportPlaform.IOS)
			return new IOSUIFactory();
		else
			return null;
	}
}
