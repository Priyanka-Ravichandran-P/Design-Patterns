package com.lld.designpatterns.concepts.factory;

public class Flutter {
	SupportPlaform platform;

	public Flutter(SupportPlaform platform) {
		this.platform = platform;
	}

	public void setTheme(String theme) {
		System.out.print(" Setting Background As" + theme);
	}

	public void setVersion(String version) {
		System.out.print(" Setting Version As" + version);
	}

	public UIFactory getUIFactory() {
		if (platform == SupportPlaform.ANDROID)
			return new AndroidUIFactory();
		else if (platform == SupportPlaform.IOS)
			return new IOSUIFactory();
		else
			return null;
	}
}
