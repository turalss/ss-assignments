package com.week1.day2.commandline;

/**
 * @author tural.hasanli
 * 
 *         Taking multiple values from command line and showing the result of
 *         adding all of them
 *
 */
public class CommandLine {

	public static void main(String[] args) {

		double sum = 0;

		for (String s : args) {

			try {
				sum += Double.parseDouble(s);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

		System.out.println("The total is: " + sum);

	}

}
