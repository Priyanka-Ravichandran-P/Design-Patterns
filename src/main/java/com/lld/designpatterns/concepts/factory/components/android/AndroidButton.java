package com.lld.designpatterns.concepts.factory.components.android;

import com.lld.designpatterns.concepts.factory.components.Button;

public class AndroidButton implements Button {
	public AndroidButton(){
		System.out.println("Android button Created");
	}
}
