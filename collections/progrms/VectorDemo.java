package com.collections.progrms;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		 Vector vr= new Vector();
		 
vr.add("Ak");
vr.add(10);
vr.add("Ak");
vr.add(14f);
vr.add("Ashok");
vr.add(12.3);
System.out.println(vr);

System.out.println();

vr.remove(4);
System.out.println(vr);
	}

}
