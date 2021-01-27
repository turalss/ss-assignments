package com.week1.day5.lambdas;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Lambdas {
	
	/*  Assignment 1:
	 *  Write the methods that return a lambda expression
	 */
	
	// check if the value is even or odd
	static Function<Integer, String> isOdd() {
		return num -> num % 2 != 0 ? "ODD" : "EVEN";
	};
	// check if given number prime
	static Function<Integer, String> isPrime() {
		return num -> BigInteger.valueOf(num).isProbablePrime(1) ? "PRIME" : "COMPOSITE";
	};

	// parsing Integer to string, reversing it and checking if 2 string are equal
	static Function<Integer, String> isPalindrome() {
		return num -> Integer.toString(num).equals(new StringBuilder(Integer.toString(num)).reverse().toString())
				? "PALIDROME"
				: "NOT PALIDROME";
	};
	
	/*  Assignment 2, 3, 4: Functional 
	 *   
	 */
	
	// return an integer list of the right most digits
	static List<Integer> rightMost(List<Integer> numbers){
		numbers.replaceAll(n -> n %10);
		return numbers;
	}
	// return a list where each value multiplied by 2
	static List<Integer> multipliedBy2(List<Integer> numbers){
		numbers.replaceAll(n -> n * 2);
		return numbers;
	}
	// given a list of strings, return a list where each string has all its "x" removed 
	static List<String> removeX(List<String> strings){
		strings.replaceAll(s -> s.replace("x", ""));
		return strings;
	}
	
	/*  Assignment 5: Recursion 
	 *   
	 */
	
	static boolean groupSumClump(int start, int[] arr, int end) {
	    if (start >= arr.length) return end == 0;

	    int sum = arr[start];
	    int count = 1;
	    for (int i = start + 1; i < arr.length; i++)
	        if (arr[i] == arr[start]) {
	            sum += arr[i];
	            count++;
	        }
	    
	    return groupSumClump(start + count, arr, end - sum) ||  groupSumClump(start + count, arr, end); 
	    
	}
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(16, 8, 886, 8, 1);
		System.out.println(rightMost(num));
		
		int start = 0; 
		int[] arr = {1, 2, 4, 8, 1};
		int end = 14;
		System.out.println(groupSumClump(start, arr, end));
		
		int testCase1 = 4;
		int testCase2 = 5;
		int testCase3 = 898;
		int testCase4 = 3;
		int testCase5 = 12;
		System.out.println(93 % 10);

		System.out.println(isOdd().apply(testCase1));
		System.out.println(isPrime().apply(testCase2));
		System.out.println(isPalindrome().apply(testCase3));
		System.out.println(isOdd().apply(testCase4));
		System.out.println(isPrime().apply(testCase5));

	}

}
