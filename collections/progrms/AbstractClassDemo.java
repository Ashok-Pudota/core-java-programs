package com.collections.progrms;

abstract class Parent {
	
	
	Parent(){
		System.out.println("Parent abstract class consutuctior");
		
	}
	 abstract void getInfo();
	

	  public void getData() {
		  System.out.println("hi");
		  
	  }
} 
 class  Child  extends Parent{
	 
	 
	 @Override
		void getInfo() {
			// TODO Auto-generated method stub
			
		} 
 }
 
 public class AbstractClassDemo{
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Child ch= new Child();
			
			
 }
}