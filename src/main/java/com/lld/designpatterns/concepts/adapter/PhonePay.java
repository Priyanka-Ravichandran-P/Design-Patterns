package com.lld.designpatterns.concepts.adapter;

import com.lld.designpatterns.concepts.adapter.bankadapters.BankAPIAdapter;


public class PhonePay {
	BankAPIAdapter bank;

	public PhonePay(BankAPIAdapter bank) {
		this.bank = bank;
	}

	public float dotransaction(String accNo, int pin, int amount) throws Exception {
		if (bank.auth(accNo, pin)) {
			bank.transfer(accNo, pin, amount);
			return bank.checkBalance(accNo, pin);
		} else {
			throw new Exception("Not Authorized");
		}
	}
}
