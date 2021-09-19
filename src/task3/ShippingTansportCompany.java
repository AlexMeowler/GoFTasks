package task3;

public class ShippingTansportCompany extends TransportCompany {

    public ShippingTansportCompany(String name) {
	super(name);
    }

    @Override
    public TransportService create(String name, int category) {
	return new Shipping(name, category);
    }
    
}
