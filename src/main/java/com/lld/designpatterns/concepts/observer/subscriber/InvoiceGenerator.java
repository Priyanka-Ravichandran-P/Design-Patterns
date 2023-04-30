package com.lld.designpatterns.concepts.observer.subscriber;

import com.lld.designpatterns.concepts.observer.publisher.Amazon;

public class InvoiceGenerator implements OrderPlaceSubscriber {
	public InvoiceGenerator() {
		Amazon amazon = Amazon.getInstance();
		amazon.registerSubscribers(this);
	}

	@Override
	public void placeOrder() {
		System.out.println("Invoice Generated ");

	}

}
