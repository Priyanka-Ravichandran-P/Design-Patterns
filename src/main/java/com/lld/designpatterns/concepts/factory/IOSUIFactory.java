package com.lld.designpatterns.concepts.factory;

import com.lld.designpatterns.concepts.factory.components.Button;
import com.lld.designpatterns.concepts.factory.components.Dropdown;
import com.lld.designpatterns.concepts.factory.components.InputField;
import com.lld.designpatterns.concepts.factory.components.Menu;
import com.lld.designpatterns.concepts.factory.components.ios.IOSButton;
import com.lld.designpatterns.concepts.factory.components.ios.IOSDropdown;
import com.lld.designpatterns.concepts.factory.components.ios.IOSInputField;
import com.lld.designpatterns.concepts.factory.components.ios.IOSMenu;

public class IOSUIFactory implements UIFactory{
	@Override
	public Button createButton() {
		return new IOSButton();
	}

	@Override
	public Menu createMenu() {
		return new IOSMenu();
	}

	@Override
	public InputField createInput() {
		return new IOSInputField();
	}

	@Override
	public Dropdown createDropdown() {
		return new IOSDropdown();
	}
}
