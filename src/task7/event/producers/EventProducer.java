package task7.event.producers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import task7.event.listeners.GenericEventListener;

public class EventProducer {
    
    private List<GenericEventListener> listeners = new ArrayList<>();
    private static EventProducer eventProducer;
    
    private EventProducer() {
	
    }
    
    public static EventProducer get() {
	return Optional.ofNullable(eventProducer)
		.orElseGet(() -> {
		    eventProducer = new EventProducer();
		    return eventProducer;
		});
    }

    public void addEventListener(GenericEventListener g) {
	listeners.add(g);
    }
    
    public GenericEventListener[] getListeners() {
	return listeners.toArray(new GenericEventListener[listeners.size()]);
    }
    
    public void removeListener(GenericEventListener g) {
	listeners.remove(g);
    }
    
    public void createEvent(Class<?> eventListenerClass, Object sender) {
	List<GenericEventListener> matchedListeners = listeners.stream()
		.filter(l -> Arrays.asList(l.getClass().getInterfaces()).indexOf(eventListenerClass) != -1)
		.collect(Collectors.toList());
	
	matchedListeners.forEach(l -> l.onEvent(sender));
    }
}
