package com.java.corejava;

public class Account {

	private long accountno;
	private String accountname;

	public void setAccountNo(long accountno) {
		this.accountno = accountno;

	}

	public long getAccountNo() {
		return accountno;
	}

	public void setAccountName(String accountname) {
		this.accountname = accountname;
	}

	public String getAccountName() {
		return accountname;
	}

	public class EncapsulationDemo {
		public static void main(String[] args) {
			Account a = new Account();
			a.setAccountNo(123456);
			a.setAccountName("Savings account");
			System.out.println(a.getAccountNo() + " " + a.getAccountName());

		}

	}
}
