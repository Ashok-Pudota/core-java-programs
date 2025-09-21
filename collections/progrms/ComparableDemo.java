package com.collections.progrms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1> {
	int id;
	int age;
	String name;

	Student1(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student1 s) {
		// TODO Auto-generated method stub
		return this.age - s.age;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student1[id= " + id + " ,name= " + name + ",age=" + age + "]";

	}

}

public class ComparableDemo {

	public static void main(String[] args) {
		List<Student1> slist = new ArrayList<>();
		slist.add(new Student1(101, "Ashok", 22));
		slist.add(new Student1(102, "Sravs", 25));
		slist.add(new Student1(103, "Rajesh", 24));
		slist.add(new Student1(104, "Mani", 28));
		slist.add(new Student1(105, "Kranthi", 19));

		System.out.println("Before Sorthing");

		slist.forEach(System.out::println);
		Collections.sort(slist);

		System.out.println();

		System.out.println("AfterSorting by age");
		slist.forEach(System.out::println);

	}

}
