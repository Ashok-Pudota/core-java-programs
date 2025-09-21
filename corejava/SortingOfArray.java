package com.java.corejava;

import java.util.Arrays;

public class SortingOfArray {

	public static void main(String[] args) {
		int arr[] = { 11, 15, 61, 101, 30 };

		Arrays.sort(arr);
		System.out.println("Ascending Order");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}

		System.out.println();
		System.out.println("Descending Order");
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(arr[i]);

		}

	}

}
