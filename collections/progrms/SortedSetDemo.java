package com.collections.progrms;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {

		SortedSet <Integer> ss= new TreeSet<>();
		ss.add(10);
		ss.add(13);
		ss.add(17);
		ss.add(20);
		ss.add(21);
		ss.add(14);
		ss.add(13);
		ss.add(null);
		
		
		
		System.out.println(ss);
		for(int i=0; i<=20; i++) {
			ss.add(i);
		System.out.println(ss);
		}
			System.out.println(ss.first());
			System.out.println(ss.last());
			System.out.println(ss.headSet(14));

			System.out.println(ss.tailSet(13));
			System.out.println(ss.subSet(10, 14));
			
		}
		
		
	}


