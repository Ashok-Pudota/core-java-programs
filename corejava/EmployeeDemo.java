package com.java.corejava;

public class EmployeeDemo {
	int id;
	String name;

	EmployeeDemo(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println(id + " " + name);

	}

	public static void main(String[] args) {

		EmployeeDemo ed = new EmployeeDemo(10, "Ashok");

	}

}
