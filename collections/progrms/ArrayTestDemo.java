package com.collections.progrms;

public class ArrayTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 20, 15, 10, 45, 27, 83, 15, 45};

		for (int i = 0; i < n.length; i++) {
			
			for (int j=i+1; j< n.length;j++) {
				
				if  (n[i]==n[j]) {
					System.out.println(n[i]);
					break;
				}
				
				
			}

		//	System.out.println(n[i]);
		}

	}

}
