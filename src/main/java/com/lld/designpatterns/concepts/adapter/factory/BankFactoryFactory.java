package com.lld.designpatterns.concepts.adapter.factory;

import com.lld.designpatterns.concepts.adapter.SupportBanks;
import com.lld.designpatterns.concepts.adapter.bankadapters.BankAPIAdapter;
import com.lld.designpatterns.concepts.adapter.bankadapters.ICICIAdapter;
import com.lld.designpatterns.concepts.adapter.bankadapters.YesBankAdapter;

public class BankFactoryFactory {
	public static BankAPIAdapter getBankAdapter(SupportBanks bank) throws Exception {
		if(bank == SupportBanks.ICICIBANK) return new ICICIAdapter();
		else if(bank == SupportBanks.YESBANK) return new YesBankAdapter();
		else throw new Exception("Please provide valid bank");
	}
}
