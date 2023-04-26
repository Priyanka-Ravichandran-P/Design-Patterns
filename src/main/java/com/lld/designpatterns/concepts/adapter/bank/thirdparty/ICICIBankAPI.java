package com.lld.designpatterns.concepts.adapter.bank.thirdparty;

public class ICICIBankAPI {
	float balance = 100.0f;
	public float checkBalance(String accountNo, int pin) {
		return this.balance;
	}

	public int authenticate(String accountNo, int pin) {
		return 1;
	}

	public float transaction(String accountNo, int pin, int amount) {
		this.balance+=amount;
		return this.balance;
		
	}
}
