package com.collections.progrms;

import java.util.ArrayList;

class Student{
	private int id;
	private String Name;
	private double Grade;
	
	Student(int id, String Name, double Grade){
		
		this.id= id;
		this.Name= Name;
		this.Grade= Grade;
		
		
	} 
	
	public void getStudentInfo() {
		
		System.out.println( "ID=" + id +", Name= "+Name + ", Grade=" + Grade);
		
	}
	@Override
	public String toString() {
		return "ID=	" +id + ", Name=" +Name + ", Grade=" +Grade;
		
		
	}
}
	
	public class ArrayListDemo {

		
		public static void main(String[] args) {
	
		ArrayList<Student> stntlst= new ArrayList<>();
		stntlst.add( new Student(101,"ashok", 80.2));
		stntlst.add(new Student(102, "Sravani", 85.9));
		System.out.println(stntlst);
		
		for (Student s:stntlst) {
			
			s.getStudentInfo();
			
		}
		
		
			
		}

}
