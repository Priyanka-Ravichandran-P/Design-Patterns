package com.lld.designpatterns.concepts.facade.shapes;

public class Circle  implements Shape {

	@Override
	public void draw(){
		System.out.println("Drawing Circle");
	}

}