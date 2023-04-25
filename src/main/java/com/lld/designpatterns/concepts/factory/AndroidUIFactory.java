package com.lld.designpatterns.concepts.factory;

import com.lld.designpatterns.concepts.factory.components.Button;
import com.lld.designpatterns.concepts.factory.components.Dropdown;
import com.lld.designpatterns.concepts.factory.components.InputField;
import com.lld.designpatterns.concepts.factory.components.Menu;
import com.lld.designpatterns.concepts.factory.components.android.AndroidButton;
import com.lld.designpatterns.concepts.factory.components.android.AndroidDropdown;
import com.lld.designpatterns.concepts.factory.components.android.AndroidInputField;
import com.lld.designpatterns.concepts.factory.components.android.AndroidMenu;

public class AndroidUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		return new AndroidButton();
	}

	@Override
	public Menu createMenu() {
		return new AndroidMenu();
	}

	@Override
	public InputField createInput() {
		return new AndroidInputField();
	}

	@Override
	public Dropdown createDropdown() {
		return new AndroidDropdown();
	}

}
