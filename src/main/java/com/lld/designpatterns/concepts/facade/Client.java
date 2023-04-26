package com.lld.designpatterns.concepts.facade;

import com.lld.designpatterns.concepts.facade.service.ShapeMaker;

public class Client {
public static void main(String[] args) {
	ShapeMaker shapemaker = new ShapeMaker();
	shapemaker.drawCircle();
	shapemaker.drawRectangle();
	shapemaker.drawSquare();
}
}
