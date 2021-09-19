package task3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shipping extends TransportService {
    
    private double tariff;
    
    public Shipping(String name, int tariff) {
	super(name);
	setTariff(tariff);
    }

    @Override
    public double costTransportation(double distance) {
	return distance * tariff;
    }
    
    @Override
    public String toString() {
	return String.format("Фирма %s, доставка по тарифу %.0f", getName(), tariff);
    }
}
