package task3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxiService extends TransportService {
    
    private int category;
    
    public TaxiService(String name, int category) {
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
