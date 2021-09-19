package task3;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AIDriverService extends TransportService {

    private int category;

    public AIDriverService(String name, int category) {
	super(name);
	setCategory(category);
    }

    @Override
    public double costTransportation(double distance) {
	return distance * category;
    }
    
    @Override
    public String toString() {
	return String.format("Фирма %s, поездка категории %d", getName(), category);
    }

}
