package com.lld.designpatterns.concepts.adapter.bank.thirdparty;

public class YesBankAPI {
	float balance = 2000.0f;
	public float queryBalance(String accountNo, int pin) {
		return this.balance;
	}

	public boolean authenticate(String accountNo, int pin) {
		return true;
	}

	public int transfer(String accountNo, int pin, int amount) {
		 this.balance+=amount;
		 return 1;
	}
}
