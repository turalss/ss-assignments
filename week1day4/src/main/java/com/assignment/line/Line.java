package com.assignment.line;

/*
 *  Method in this object will be tested with jUnit testing (please refer to src/test/java directory 
 */

public class Line {
	
	public double x0;
	public double y0;
	public double x1;
	public double y1;
	
	
	// construct Line object
	public Line(double x0, double y0, double x1, double y1) {
		super();
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
	}
	
	// calculate the slope of the line
	public double getSlope() {
		// avoid dividing by zero
		if(x1 == 0) {
			throw new ArithmeticException();
		}
		
		return (y1 - y0) / (x1 -x0);
		
	}
	
	// calculate the distance of the line
	public double getDistance() {
		return Math.sqrt((x1 - x0) * (x1 -x0) + (y1 - y0) * (y1 - y0));
	}
	
	
	public static void main(String[] args) {
		Line nLine = new Line(2, 2, 5, 5);
		
		System.out.println(nLine.getSlope());
		System.out.println(nLine.getDistance());

	}
	
	

	

}

