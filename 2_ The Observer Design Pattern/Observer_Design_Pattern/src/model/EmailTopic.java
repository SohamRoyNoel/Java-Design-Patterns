package model;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observer;
import interfaces.Subject;

public class EmailTopic implements Subject {
	
	public List<Observer> observers;
	private String message;
	
	public EmailTopic() {
        this.observers = new ArrayList<>();
    }

	@Override
	public void register(Observer observer) {
		if (observer == null) { throw new NullPointerException("Null Observer"); }
		
		if (!observers.contains(observer)) { observers.add(observer); }
	}

	@Override
	public void unRegister(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}		
	}

	@Override
	public Object getUpdate(Observer observer) { 
		return this.message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message is posted " + msg);
		this.message = msg;
		notifyObserver();
	}

}
