package task7;

import task7.event.listeners.PowerEventListener;
import task7.event.producers.EventProducer;

public class Power {
    
    private int power;
    
    public void changePower(int power) {
	this.power = power;
	EventProducer.get().createEvent(PowerEventListener.class, this);
    }
    
    @Override
    public String toString() {
	return String.format("Задана мощность %dW", power);
    }
}
