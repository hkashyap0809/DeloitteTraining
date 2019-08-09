package com.oracle.springtraining.coupling1;

public class PaymentService {
	
	private SavingsAccount savingsAccount;
	
	public PaymentService() {
		savingsAccount = new SavingsAccount("1234");
	}
	public void pay(){
	
		System.out.println("Payment using tight coupling ->"+ this.savingsAccount.getDetails());
	}
}
