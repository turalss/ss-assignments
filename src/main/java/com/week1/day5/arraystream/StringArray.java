package com.week1.day5.arraystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StringArray {

	public static void main(String[] args) {

		List<String> arr = new ArrayList<>(Arrays.asList("before", "software", "can", "be", "reusable", "it", "has",
				"first", "to", "be", "usable"));
		// sort array in ascending order
		arr.stream().sorted((string1, string2) -> {
			return string1.length() - string2.length();
		}).forEach(System.out::println);
		// sort array in descending order
		arr.stream().sorted((string1, string2) -> {
			return string2.length() - string1.length();
		}).forEach(System.out::println);
		// sort array in alphabetically order
		arr.stream().sorted(alphabeticalOrder).forEach(System.out::println);
		// sort array first with char "e" and after the rest
		Stream.concat(arr.stream().filter(s -> s.contains("e")), arr.stream().filter(s -> !s.contains("e")))
				.forEach(System.out::println);

		// sort array first with char "e" and after the rest with static method
		String[] arr2 = { "Tural", "Hasanli", "Software Engineer", "Smoothstack" };
		Arrays.sort(arr2, (string1, string2) -> sortFirstWithE(string1, string2));

	}

	// sort string in alphabetically order with static method
	public static Comparator<String> alphabeticalOrder = (string1, string2) -> {
		return string1.charAt(0) - string2.charAt(0);
	};

	public static int sortFirstWithE(String string1, String string2) {

		return (string1.contains("e") && !string2.contains("e")) ? -1 : 1;

	}

}
