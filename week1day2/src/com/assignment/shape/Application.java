package com.assignment.shape;

public class Application {
	
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(5, 20);
		rectangle.calculateArea();
		rectangle.display();
		
		Circle circle = new Circle(7);
		circle.calculateArea();
		circle.display();
		
		Triangle triangle = new Triangle(10, 5, 10);
		triangle.calculateArea();
		triangle.display();
		
	}

}
