package com.assignments.patterns;


/**
 * @author tural.hasanli
 *
 */
public class PrintPatterns {

	// no-arg constructor
	public PrintPatterns() {

	}

	// printing a rightTriangle to console
	public void firstPattern(int num) {
		for (int i = 0; i < num; i++) {
			for (int m = 0; m <= i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// printing a leftTriangle to console
	public void secondPattern(int num) {
		for (int i = num; i > 0; i--) {
			for (int m = 0; m < i; m++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// printing a Pyramid to console
	public void thirdPattern(int num) {

		for (int i = 0; i < num; i++) {
			for (int m = num - i; m > 1; m--) {
				System.out.print(" ");
			}
			for (int n = 0; n <= i; n++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
	
	// printing a reversed - Pyramid to console
	public void fourthPattern(int num) {

		for (int i = 0; i <= num - 1; i++) {
			for (int m = 1; m <= i ; m++) {
				System.out.print(" ");
			}
			for (int n = 0; n <= num - 1 - i; n++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
	

	public static void main(String[] args) {

		int num = 5;

		PrintPatterns printPatterns = new PrintPatterns();
		printPatterns.firstPattern(num);
		System.out.println("- - - - - - - - - - - - - - ");
		printPatterns.secondPattern(num);
		System.out.println("- - - - - - - - - - - - - - ");
		printPatterns.thirdPattern(num);
		System.out.println("- - - - - - - - - - - - - - ");
		printPatterns.fourthPattern(num);

	}

}
