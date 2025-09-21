package com.java.corejava;

import java.util.Arrays;

public class MinMaxArray {

	public static void main(String[] args) {
		int [] numbers = { 102, 40, 60, 90, 30 };

		int Min=numbers[0]; 
		int Max = numbers[0];
		 
		 for (int i = 1; i < numbers.length; i++) { 
			 if (numbers[i] < Min) { 
				 Min = numbers[i]; 
				 } 
			 if (numbers[i] > Max) { 
			 Max = numbers[i];
		 
		 }
		 
		 
		  }
		 
	//	int numbers[] = { 102, 40, 60, 90, 30 }; 
		
	//	Arrays.sort(numbers);

	//	int Min = numbers[0];

	//	int Max = numbers[numbers.length-1];

		System.out.println("Min Value:" + Min);
		System.out.println("Max Value:" + Max);
	}

}
