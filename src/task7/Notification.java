package task7;

import task7.event.listeners.NotificationEventListener;
import task7.event.producers.EventProducer;

public class Notification {
    
    private String message;
    
    public void startNotification() {
	updateMessage("Операция началась");
    }
    
    public void endNotification() {
	updateMessage("Операция закончилась");
    }
    
    private void updateMessage(String message) {
	this.message = message;
	EventProducer.get().createEvent(NotificationEventListener.class, this);
    }
    
    @Override
    public String toString() {
	return String.format("Информация %s", message);
    }

}
