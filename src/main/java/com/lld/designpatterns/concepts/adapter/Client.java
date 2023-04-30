package com.lld.designpatterns.concepts.adapter;

import com.lld.designpatterns.concepts.adapter.bankadapters.BankAPIAdapter;
import com.lld.designpatterns.concepts.adapter.factory.BankAdapterFactory;

public class Client {
	public static void main(String[] args) throws Exception {
		BankAPIAdapter bank = BankAdapterFactory.getBankAdapter(SupportedBank.YESBANK);
		PhonePay phonepay = new PhonePay(bank);
		float balance = phonepay.dotransaction("123456878H00", 4768, 5000);
		System.out.println("Balance : " + balance); 
		
	}

}
