package com.java.corejava;

public class TestDemoMethods {

	

		public void getInfo() {
			System.out.println("Ashok");
		}
			public void add(int a, int b) {
				System.out.println(a+b);
			}
	public	String concatString( String str1, String  str2) {
			 
			String result=str1+str2;
			return result;
			
					
				}
				
				
				
		
			
			public static void main(String[] args) {
			
		       TestDemoMethods td= new TestDemoMethods();
		       td.add(10, 50);
		       td.getInfo();
		  String result= td.concatString("Ashok", "Kumar");
		  System.out.println(result);
	}
	
}

