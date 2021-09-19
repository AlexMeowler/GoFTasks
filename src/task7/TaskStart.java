package task7;

import task7.event.listeners.DriveEventListener;
import task7.event.listeners.NotificationEventListener;
import task7.event.listeners.PowerEventListener;
import task7.event.producers.EventProducer;

public class TaskStart {

    public static void main(String[] args) {
	Microwave microwave = new Microwave(new Drive(), new Notification(), new Power());
	
	addEventListeners();
	
	microwave.defrost();
	microwave.bakePie();
    }
    
    private static void addEventListeners() {
	EventProducer eventProducer = EventProducer.get();
	eventProducer.addEventListener(new DriveEventListener() {
	    
	    @Override
	    public void onEvent(Object sender) {
		Drive drive = (Drive) sender;
		System.out.println(drive.toString());
	    }
	});
	eventProducer.addEventListener(new NotificationEventListener() {
	    
	    @Override
	    public void onEvent(Object sender) {
		Notification notification = (Notification) sender;
		System.out.println(notification.toString());
	    }
	});
	eventProducer.addEventListener(new PowerEventListener() {
	    
	    @Override
	    public void onEvent(Object sender) {
		Power power = (Power) sender;
		System.out.println(power.toString());	
	    }
	});
    }

}
