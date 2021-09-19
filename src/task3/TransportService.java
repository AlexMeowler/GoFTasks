package task3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class TransportService {

    private String name;
    
    public TransportService(String name) {
	setName(name);
    }
    
    public abstract double costTransportation(double distance); 
}
