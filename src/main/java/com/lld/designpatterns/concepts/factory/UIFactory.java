package com.lld.designpatterns.concepts.factory;

import com.lld.designpatterns.concepts.factory.components.Button;
import com.lld.designpatterns.concepts.factory.components.Dropdown;
import com.lld.designpatterns.concepts.factory.components.InputField;
import com.lld.designpatterns.concepts.factory.components.Menu;

public interface UIFactory {
	public Button createButton();
	public Menu createMenu();
	public InputField createInput();
	public Dropdown createDropdown();
}
