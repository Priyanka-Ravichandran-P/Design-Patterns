package com.lld.designpatterns.concepts.adapter.bankadapters;

import com.lld.designpatterns.concepts.adapter.bank.thirdparty.ICICIBankAPI;

public class ICICIAdapter implements BankAPIAdapter {
	ICICIBankAPI iciciBankApi;

	public ICICIAdapter() {
		this.iciciBankApi = new ICICIBankAPI();
	}

	@Override
	public float checkBalance(String accountNo, int pin) {
		return iciciBankApi.checkBalance(accountNo, pin);
	}

	@Override
	public boolean auth(String accountNo, int pin) {
		if(iciciBankApi.authenticate(accountNo, pin) == 1) return true;
		else return false;
	}

	@Override
	public void transfer(String accountNo, int pin, int amount) {
		 iciciBankApi.transaction(accountNo, pin, amount);
	}

}
