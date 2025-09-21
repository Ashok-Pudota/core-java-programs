package com.java.corejava;
// getuseremail

public class Account1 {
	private long accountno;
	private String accountname;
	private String useremail;
	

	public void setuseremail(String useremail) {
		this.useremail = useremail;

	}

	public String getuseremail() {
		return useremail;

	}

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

			Account1 demo = new Account1();
			demo.setAccountNo(1077905);
			demo.setAccountName("Current Account");
			demo.setuseremail("ashok@gmail.com");

			System.out.println(demo.getAccountNo() + " " + demo.getAccountName() + " " + demo.getuseremail());

		}

	}

}
