package model;

import interfaces.Observer;
import interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
	
	// instance Veriable
	private String message;
	
	// reference to Subject interface
	private Subject topic;
	
	

	public EmailTopicSubscriber(String name) {
		this.message = name;
	}

	@Override
	public void update() {
		String msg =(String)topic.getUpdate(this);
		
		if (msg == null) {
			System.out.println(message + " No new message");
		} else {
			System.out.println(message + " Retriving message " + msg);
		}
	}

	@Override
	public void setobject(Subject subject) {
		this.topic = subject;
	}

}
