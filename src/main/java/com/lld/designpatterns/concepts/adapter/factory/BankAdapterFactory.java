package com.lld.designpatterns.concepts.adapter.factory;

import com.lld.designpatterns.concepts.adapter.SupportedBank;
import com.lld.designpatterns.concepts.adapter.bankadapters.BankAPIAdapter;
import com.lld.designpatterns.concepts.adapter.bankadapters.ICICIAdapter;
import com.lld.designpatterns.concepts.adapter.bankadapters.YesBankAdapter;

public class BankAdapterFactory {
	private BankAdapterFactory() {};
	
	public static BankAPIAdapter getBankAdapter(SupportedBank bank) throws Exception {
		if(bank == SupportedBank.ICICIBANK) return new ICICIAdapter();
		else if(bank == SupportedBank.YESBANK) return new YesBankAdapter();
		else throw new Exception("Please provide valid bank");
	}
}
