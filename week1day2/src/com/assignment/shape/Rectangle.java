/**
 * 
 */
package com.assignment.shape;

/**
 * @author tural.hasanli
 * 
 */
public class Rectangle implements ShapeInterface {
	
		private double height; 
		private double width;
		private double diagonal;
		
		public Rectangle(double height, double width) {
			this.height = height;
			this.width = width;
			
		}


		// calculates diagonal of rectangle 
		@Override
		public double calculateArea() {
			
			double calculate = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
			// removes decimals
			diagonal = Math.round(calculate);
			
			return diagonal;
			
		}

		// prints calculated diagonal of rectangle 
		@Override
		public void display() {

			System.out.println("Rectangle's diagonal is: " + diagonal);
		}
		
		
		

}
