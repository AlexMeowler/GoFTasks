package task7;

import task7.event.listeners.DriveEventListener;
import task7.event.producers.EventProducer;

public class Drive {
    
    private String twist;
    
    public Drive() {
	twist = "Исходная операция";
    }
    
    public void turlLeft() {
	updateTwist("Поворот влево");
    }
    
    public void turlRight() {
	updateTwist("Поворот вправо");
    }
    
    public void stop() {
	updateTwist("Стоп");
    }
    
    private void updateTwist(String status) {
	twist = status;
	EventProducer.get().createEvent(DriveEventListener.class, this);
    }
    
    @Override
    public String toString() {
	return String.format("Привод: %s", twist);
    }
}
