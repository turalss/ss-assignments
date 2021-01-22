/**
 * 
 */
package com.assignment.shape;

/**
 * @author tural.hasanli
 *
 */
public class Triangle implements ShapeInterface {
	
	private double sideA;
	private double base;
	private double sideB;
	private double perimeter;
	
	
	public Triangle(double sideA, double base, double sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.base = base;
	}

	// calculating parameter of triangle
	@Override
	public double calculateArea() {
		
		if(sideA + base < sideB || sideA + sideB < base || base + sideB < sideA) {
			System.out.println("wrong parameters");
			return 0;
		} else {
			perimeter = sideA + base + sideB;
		}
		
		return perimeter;
	}

	// display calculated parameter of triangle
	@Override
	public void display() {
		System.out.println("Triangle's perimeter is: " + perimeter);
		
	}
	
	
	
	
	

}
