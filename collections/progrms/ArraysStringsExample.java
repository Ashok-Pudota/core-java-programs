package com.collections.progrms;

import java.util.ArrayList;

public class ArraysStringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> str= new ArrayList<>();
		 str.add("ashok");
		 str.add("sravani");
		 str.add("rajesh");
		 str.add("mani");
		 str.add("nandu");
		 str.add("kranthi");
		 
		// for (String name:str) {
		 
		 for(int i=str.size()-1; i>=0; i--) {
			 System.out.println(str.get(i));
			  
			 
		 }
		

	}

}
