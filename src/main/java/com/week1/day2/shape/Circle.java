package com.week1.day2.shape;

/**
 * @author tural.hasanli
 *
 */
public class Circle implements ShapeInterface {

	private double diameter;
	private double radius;

	public Circle(double diameter) {
		this.diameter = diameter;
	}

	// calculates the radius of circle
	public double calculateArea() {

		return radius = diameter / 2;
	}

	// displays calculated radius of circle
	public void display() {

		System.out.println("Radius of circle is: " + radius);

	}

}
