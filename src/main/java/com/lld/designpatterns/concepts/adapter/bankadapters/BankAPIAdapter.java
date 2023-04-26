package com.lld.designpatterns.concepts.adapter.bankadapters;

public interface BankAPIAdapter {
	
	public float checkBalance(String accountNo, int pin);

	public boolean auth(String accountNo, int pin);

	public void transfer(String accountNo, int pin, int amount);
	
	

}
