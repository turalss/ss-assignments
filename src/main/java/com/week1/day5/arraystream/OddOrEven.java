package com.week1.day5.arraystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddOrEven {
	
	public static void main(String[] args) {
		
		// Q1
		List<Integer> listOfNums = new ArrayList<>(Arrays.asList(3, 44, 1, 19));
		System.out.println(addEandOwithComma(listOfNums));
		
		// Q2
		List<String> listOfStrings = new ArrayList<>(Arrays.asList("tutu", "tam", "ali", "Abi"));
		listOfStrings.stream().filter(s -> s.startsWith("a") && s.length() == 3)
		.forEach(System.out::println);
	}
	
	// check if each element is ODD or EVEN and append a letter with comma and return as String
	public static String addEandOwithComma(List<Integer> arr) {
		return arr.stream().map(i -> i % 2 == 0? "e" + i : "o" + i)
				.collect(Collectors.joining(","));	
	}
	

	
	
	
	

}
