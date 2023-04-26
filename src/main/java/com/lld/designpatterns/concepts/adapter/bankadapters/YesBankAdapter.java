package com.lld.designpatterns.concepts.adapter.bankadapters;

import com.lld.designpatterns.concepts.adapter.bank.thirdparty.YesBankAPI;

public class YesBankAdapter implements BankAPIAdapter {

	YesBankAPI yesBankAPI;

	public YesBankAdapter() {
		this.yesBankAPI = new YesBankAPI();
	}
	
	@Override
	public float checkBalance(String accountNo, int pin) {
		return yesBankAPI.queryBalance(accountNo, pin);
	}

	@Override
	public boolean auth(String accountNo, int pin) {
		return yesBankAPI.authenticate(accountNo, pin);
	}

	@Override
	public void transfer(String accountNo, int pin, int amount) {
		yesBankAPI.transfer(accountNo, pin, amount);
	}

}
