package com.week1.day5.arraystream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class LambdasFuncs {

	public static void main(String[] args) {
		
		// Q1
		List<Integer> listOfNums = Arrays.asList(3, 44, 1, 19);
		System.out.println(addEandOwithComma(listOfNums));
		
		// Q2
		List<String> listOfStrings = Arrays.asList("tutu", "tam", "ali", "Abi");
		containsAandLength3(listOfStrings).forEach(s-> System.out.println(s));

		List<String> arr = Arrays.asList("Before", "software", "Can", "be", "Reusable", "it", "has",
				"first", "to", "be", "usable");
		System.out.println(LambdasFuncs.sortFirstWithE(arr));
		
		// sort array of strings first ones that contains "e" letter with static method 
		Collections.sort(arr, (s1, s2) -> sortFirstWithE(s1, s2));

		List<String> arrRandom = Arrays.asList("cou", "blo", "m", "alo", "cou", "Amor", "test");
		System.out.println(containsAandLength3(arrRandom));
	}
	
	// sort array of strings in ascending order by length
	public static List<String> orderAscByLength(List<String> arr) {
		return arr.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
	}
	
	// sort array of strings in descending order by length
	public static List<String> orderDescByLength(List<String> arr) {
		return arr.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
	}
	
	// sort array of strings in alphabetically order
	public static List<String> alphabeticallyOrder(List<String> arr){
		return arr.stream()
		        .sorted(String.CASE_INSENSITIVE_ORDER) // 
		        .collect(Collectors.toList());
	};
	
	// sort array of strings first ones that contains "e" letter
	public static List<String> sortFirstWithE(List<String> arr){
		return arr.stream()
		        .sorted(Comparator.comparing(s -> !s.contains("e"))) // sorted naturally
		        .collect(Collectors.toList());
	};
	// sort array of strings first ones that contains "e" letter with static method 
	public static int sortFirstWithE(String string1, String string2) {
		return (string1.contains("e") && !string2.contains("e")) ? -1 : 1;

	}
	
	// check if each element is ODD or EVEN and append a letter with comma and return as String
	public static String addEandOwithComma(List<Integer> arr) {
		return arr.stream().map(i -> i % 2 == 0? "e" + i : "o" + i)
				.collect(Collectors.joining(","));	
	};
	
	// check is words contains "a" and length == 3. 
	public static List<String> containsAandLength3(List<String> arr){
		return arr.stream().filter(s -> s.startsWith("a") && s.length() ==3)
				.collect(Collectors.toList());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
