package com.lld.designpatterns.concepts.observer.publisher;

import java.util.ArrayList;
import java.util.List;

import com.lld.designpatterns.concepts.observer.subscriber.OrderPlaceSubscriber;

public class Amazon {
	private static Amazon amazon;
	public List<OrderPlaceSubscriber> registeredSubscribers;

	private Amazon() {
		registeredSubscribers = new ArrayList<OrderPlaceSubscriber>();
	}

	public static Amazon getInstance() {
		if (amazon == null) {
			synchronized (Amazon.class) {
				if (amazon == null) {
					amazon = new Amazon();
				}
			}
		}
		return amazon;
	}

	public void registerSubscribers(OrderPlaceSubscriber subscriber) {
		registeredSubscribers.add(subscriber);
	}

	public void deregisterSubscribers(OrderPlaceSubscriber subscriber) {
		registeredSubscribers.remove(subscriber);
	}
	
	public void placeOrder() {
		for(OrderPlaceSubscriber subscriber : registeredSubscribers) {
			subscriber.placeOrder();
		}
	}

}
