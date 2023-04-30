package com.lld.designpatterns.concepts.observer.subscriber;

import com.lld.designpatterns.concepts.observer.publisher.Amazon;

public class CustomerNotification implements OrderPlaceSubscriber {

	public CustomerNotification(){
		Amazon amazon = Amazon.getInstance();
		amazon.registerSubscribers(this);
	}
	
	@Override
	public void placeOrder() {
		System.out.println("Customer Notified");
	}

}
