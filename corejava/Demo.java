package com.java.corejava;

import java.util.*;
//import java.util.stream.Collectors;
import java.util.stream.*;

public class Demo {

	public static void main(String[] args) {
		/*
		 * String str = "cpp , java, mock , apple , demo";
		 * 
		 * List<String> words =
		 * Arrays.stream(str.split(",")).map(String::trim).collect(Collectors.toList());
		 * 
		 * Map<Integer, List<String>> grouped =
		 * words.stream().collect(Collectors.groupingBy(String::length));
		 * grouped.forEach((length, list) -> { System.out.println(length + "-" +
		 * String.join(", ", list)); });
		 */

		int[] arr = { 7, 5, 6, 1, 4, 2 };

		OptionalInt secondLargest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1)
				.mapToInt(Integer::intValue).findFirst();

		if (secondLargest.isPresent()) {
			System.out.println(" Secon Largest Number is:" + secondLargest.getAsInt());

		}

		else {
			System.out.println("Second largest Number not Found");

		}

	}

}
