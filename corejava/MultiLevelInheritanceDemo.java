package com.java.corejava;

class GrandParent {

	public void money() {
		System.out.println("Grand-parents-money");
	}

}

class Parent1 extends GrandParent {
	
	public void pMoney() {
		System.out.println("parents-money");
	}

}

class Child1 extends Parent1 {

}

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		GrandParent gp=new GrandParent();
		gp.money();
		
		System.out.println();

		Parent1 p1 = new Parent1();
		p1.money();
		
		p1.pMoney();

		System.out.println();

		Child1 ch1 = new Child1();

		ch1.money();
		ch1.pMoney();

	}

}
