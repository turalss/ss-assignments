package com.assignment.lambdas;

import java.math.BigInteger;
import java.util.function.Function;

public class Lambdas {
	// check if the value is even or odd
	static Function<Integer, String> isOdd(){
		return num -> num % 2 != 0 ? "ODD" : "EVEN";	
	};
	
	// check if given number prime 
	static Function<Integer, String> isPrime() {
		return num -> BigInteger.valueOf(num).isProbablePrime(1) ? "PRIME" : "COMPOSITE";
	};
	// parsing Integer to string, reversing it and checking if 2 string are equal 
	static Function<Integer, String> isPalindrome() {
		return num -> Integer.toString(num).equals(
				new StringBuilder(Integer.toString(num)).reverse().toString()) ? "PALIDROME" : "NOT PALIDROME";
	};
	
	public static void main(String[] args) {
		
		int testCase1 = 4;
		int testCase2 = 5;
		int testCase3 = 898;
		int testCase4 = 3;
		int testCase5 = 12;
		
		System.out.println(isOdd().apply(testCase1));
		System.out.println(isPrime().apply(testCase2));
		System.out.println(isPalindrome().apply(testCase3));
		System.out.println(isOdd().apply(testCase4));
		System.out.println(isPrime().apply(testCase5));
		
		

		

	}
	

	

}
