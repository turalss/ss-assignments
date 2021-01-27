package com.week1.week1assignment;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import javax.sound.midi.SysexMessage;

public class Week1Assigment {

	/*
	 * Assignment 1: Write the methods that return a lambda expression
	 */

	// check if the value is even or odd
	public static Function<Integer, String> isOdd() {
		return num -> num % 2 != 0 ? "ODD" : "EVEN";
	};

	// check if given number prime
	public static Function<Integer, String> isPrime() {
		return num -> BigInteger.valueOf(num).isProbablePrime(1) ? "PRIME" : "COMPOSITE";
	};

	// parsing Integer to string, reversing it and checking if 2 string are equal
	public static Function<Integer, String> isPalindrome() {
		return num -> Integer.toString(num).equals(new StringBuilder(Integer.toString(num)).reverse().toString())
				? "PALIDROME"
				: "NOT PALIDROME";
	};

	/*
	 * Assignment 2, 3, 4: Functional
	 * 
	 */

	// return an integer list of the right most digits
	public static List<Integer> rightMost(List<Integer> numbers) {
		numbers.replaceAll(n -> n % 10);
		return numbers;
	}

	// return a list where each value multiplied by 2
	public static List<Integer> multipliedBy2(List<Integer> numbers) {
		numbers.replaceAll(n -> n * 2);
		return numbers;
	}

	// given a list of strings, return a list where each string has all its "x"
	// removed
	public static List<String> removeX(List<String> strings) {
		strings.replaceAll(s -> s.replace("x", ""));
		return strings;
	}

	/*
	 * Assignment 5: Recursion
	 * 
	 */

	public static boolean groupSumClump(int start, int[] arr, int end) {
		
		System.out.println("START = " + start);
		System.out.println("END = " + end);
		if (start >= arr.length) { // if 5
			System.out.println("start: " + start + " arr.length: " + arr.length);
			return end == 0;
		}

		int sum = arr[start]; // 1 / 2
		System.out.println("SUM = " + sum);
		int count = 1; // 2
		System.out.println("COUNT = " + count);
		// 1 / // 1 < 5
		for (int i = start + 1; i < arr.length; i++)
			if (arr[i] == arr[start]) {
				System.out.println("*IF" + arr[i] + " and " + arr[start] + " are equal");
				sum += arr[i];
				System.out.println("sum += arr[i] : SUM: " + sum);
				count++;
				System.out.println("incrementing count now =  " + count);
			}
		// 2 14 - 2
		// 2
		return groupSumClump(start + count, arr, end - sum) || groupSumClump(start + count, arr, end);

	}


	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(16, 8, 886, 8, 1);
		System.out.println(rightMost(num));

		int start = 0;
		int[] arr = {2, 4, 4, 4};
		int end = 12;

		System.out.println(groupSumClump(start, arr, end));
//		System.out.println(groupSumClump(start, arr, end));

		int testCase1 = 4;
		int testCase2 = 5;
		int testCase3 = 898;
		int testCase4 = 3;
		int testCase5 = 12;
//		
//		System.out.println(93 % 10);
//
//		System.out.println(isOdd().apply(testCase1));
//		System.out.println(isPrime().apply(testCase2));
//		System.out.println(isPalindrome().apply(testCase3));
//		System.out.println(isOdd().apply(testCase4));
//		System.out.println(isPrime().apply(testCase5));

	}

}
