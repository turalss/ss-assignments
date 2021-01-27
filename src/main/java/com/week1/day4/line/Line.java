package com.week1.day4.line;

/*
 *  Method in this object will be tested with jUnit testing (please refer to src/test/java directory 
 */

public class Line {

	private double x0;
	private double y0;
	private double x1;
	private double y1;

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
		if (x1 == 0) {
			throw new ArithmeticException();
		}

		return (y1 - y0) / (x1 - x0);

	}

	// calculate the distance of the line
	public double getDistance() {
		return Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
	}
	
	// return weather line parallel to another
	public boolean paralellTo(Line l) {
		if(Math.abs(getSlope() - l.getSlope()) < 0.001) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Line nLine = new Line(2, 2, 5, 5);
		Line mLine = new Line(4, 4, 10, 10);
		
		System.out.println(nLine.paralellTo(mLine));

		System.out.println(nLine.getSlope());
		System.out.println(nLine.getDistance());

	}

}
