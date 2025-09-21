package com.collections.progrms;

import java.util.ArrayList;

public class SmpleArrayListPrgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList data=new ArrayList();
		data.add("ak");
		data.add(2);
		data.add(10.3f);
		
		data.remove(1);
		
		for ( int i=0; i<data.size();i++) {
		
	                         
			 System.out.println(data.get(i));
			
		}
		
		 
		
		
	}

}
