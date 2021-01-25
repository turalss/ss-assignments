package com.week1.day2.arraymaxnumber;

/**
 * @author tural.hasanli
 * 
 *         Constructing a 2D array and finding the max number and its position
 *         in an array
 */
public class ArrayMaxNumber {

	public void maxValue(int[][] arr) {

		// find the position of integer in 2D array and the maximum value in an array
		int max = Integer.MIN_VALUE;
		int rowIndex = -1;
		int columnIndex = -1;

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > max) {
					max = arr[row][col];
					rowIndex = row;
					columnIndex = col;
				}
			}
		}

		System.out.println("Max: " + max + ", RowIndex: " + rowIndex + ", ColumnIndex: " + columnIndex);

	}

	public static void main(String[] args) {

		// initializing 2D array
		int[][] arr = { { 11, 27, 30 }, { 41, 55, 10, 88 }, { 90 }, };

		ArrayMaxNumber arrayMaxNumber = new ArrayMaxNumber();
		// print result to the console
		arrayMaxNumber.maxValue(arr);

	}

}
