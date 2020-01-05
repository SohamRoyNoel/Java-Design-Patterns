import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSubscriber;

public class Main {

	public static void main(String[] args) {
		
		EmailTopic topic = new EmailTopic();
		
		// create Observer
		Observer fstObserver = new EmailTopicSubscriber("Tom");
		Observer sndObserver = new EmailTopicSubscriber("Dick");
		Observer trdObserver = new EmailTopicSubscriber("Harry");
		
		// Register Them
		topic.register(fstObserver);
		topic.register(sndObserver);
		topic.register(trdObserver);
		
		// Attach observer to subject
		fstObserver.setobject(topic);
		sndObserver.setobject(topic);
		trdObserver.setobject(topic);
		
		// check for updates
		fstObserver.update();
		
		// post message
		topic.postMessage("Hello world");
		
		fstObserver.update();
		sndObserver.update();
		trdObserver.update();

		
	}

}
