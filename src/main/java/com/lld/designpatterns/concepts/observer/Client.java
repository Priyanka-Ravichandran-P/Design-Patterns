package com.lld.designpatterns.concepts.observer;

import com.lld.designpatterns.concepts.observer.publisher.Amazon;
import com.lld.designpatterns.concepts.observer.subscriber.CustomerNotification;
import com.lld.designpatterns.concepts.observer.subscriber.InvoiceGenerator;

public class Client {
	public static void main(String[] args) {
		Amazon amazon = Amazon.getInstance();
		CustomerNotification custNotify = new CustomerNotification();
		InvoiceGenerator invoice = new InvoiceGenerator();
		amazon.placeOrder();
		amazon.deregisterSubscribers(invoice);
		System.out.println("=========================");
		amazon.placeOrder();
	}

}
