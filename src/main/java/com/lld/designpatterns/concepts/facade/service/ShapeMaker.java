package com.lld.designpatterns.concepts.facade.service;

import com.lld.designpatterns.concepts.facade.shapes.Circle;
import com.lld.designpatterns.concepts.facade.shapes.Rectangle;
import com.lld.designpatterns.concepts.facade.shapes.Square;

public class ShapeMaker {
	Circle circle;
	Rectangle rectangle;
	Square square;

	public ShapeMaker() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

}
