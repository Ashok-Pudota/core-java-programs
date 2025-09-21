package com.java.corejava;

public class ConstructorDemo {
	
	public ConstructorDemo(int a , int b) {
		System.out.println(a+b);
		
			
		}
	public ConstructorDemo( String str1, String str2) {
	System.out.println(" Ashok"+ "Kumar");
		
	}

	public static void main(String[] args) {
		ConstructorDemo c= new ConstructorDemo(20,30); 
		System.out.println();
		
		ConstructorDemo c1= new ConstructorDemo("Ashok", "Kumar");
		
	//	System.out.println("Main");
	}

}
