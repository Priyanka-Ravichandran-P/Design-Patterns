package com.lld.designpatterns.concepts.factory.components.android;

import com.lld.designpatterns.concepts.factory.components.Menu;

public class AndroidMenu implements Menu {
	public AndroidMenu(){
		System.out.println("Android Menu Created");
	}
}